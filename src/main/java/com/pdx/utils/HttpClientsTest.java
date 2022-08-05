package com.pdx.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @ClassName:HttpClientsTest
 * @Author JunchiLu
 * @Date 2022/7/13
 * @Version 1.0
 */
public class HttpClientsTest {
    public static String doGet(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String data = EntityUtils.toString(entity);
        response.close();
        httpClient.close();
        System.out.println(data);
        return data;
    }

    public static void main(String[] args) throws IOException {
        String s = doGet("http://127.0.0.1:8080/api/login");
        System.out.println(s);
    }
}
/**
 * @ClassName:HttpClientsTest
 * @Author JunchiLu
 * @Date 2022/7/13
 * @Version 1.0
 */