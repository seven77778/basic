package com.http.send;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/12 11:21.
 *
 * @author lsh
 * @date 2018/11/12
 *
 * 实现 CloseableHttpClient
 * 1.EntityUtils.toString 中finally 中关闭了 InputStream
 */
public class CloseHttpUtil {

    private static CloseableHttpClient closeableHttpClient;
    private static HttpClientBuilder httpClientBuilder;
    static final int CONNTECT_TIMEOUT = 1;
    static final int SOCKET_TIMEOUT = 1;

    static {
        httpClientBuilder = HttpClients.custom();
        closeableHttpClient = httpClientBuilder
            .build();
    }

    @Test
    public void test(){
        HttpGet httpGetRequest = new HttpGet("http://www.baidu.com");
        RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(1)
            .setSocketTimeout(1)
            .setConnectionRequestTimeout(1)
            .build();

        httpGetRequest.setConfig(requestConfig);

        try {
            CloseableHttpResponse response = closeableHttpClient.execute(httpGetRequest);
            //
            System.out.println(EntityUtils.toString(response.getEntity(),"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }

}
