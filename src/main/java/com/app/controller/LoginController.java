package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@RestController

public class LoginController extends HttpServlet {

    @Override
    @GetMapping("/doGet")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //System.out.println("doGet--------------------");
        doPost(req, resp);
    }

    @Override
    @RequestMapping("/index")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //System.out.println("doPost--------------------");
        // 获取操作类型，根据类型执行不同操作
        String operFlag = request.getParameter("operFlag");
        //System.out.println("operFlag" + operFlag);
        String results = "";
        if ("getOpenid".equals(operFlag)) {
            String code = request.getParameter("code");   //拿到微信小程序传过来的code
            //System.out.println(code);
            String appid = "wx3d187adf6ac92dd8";
            String secretKey = "e108f78c3b8eff0c2bf960079e607ea6";
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secretKey
                    + "&js_code=" + code + "&grant_type=authorization_code";   //接口地址
            //System.out.println("url" + url);
            results = sendGetReq(url);// 发送http请求
            //System.out.println("results" + results);
        }

        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("catch-control", "no-catch");
        PrintWriter out = response.getWriter();
        out.write(results);
        out.flush();
        out.close();
    }

    private String sendGetReq(String url) {
        StringBuilder result = new StringBuilder();
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            java.util.Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                //System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            //System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        } // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result.toString();
    }
}
