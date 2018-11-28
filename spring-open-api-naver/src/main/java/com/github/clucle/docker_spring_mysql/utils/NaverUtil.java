package com.github.clucle.docker_spring_mysql.utils;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Component("naverUtil")
public class NaverUtil {

    public String getImages(String text) {
        String clientId = "BnGjwz9sTUi85WcDnoXe";
        String clientSecret = "1sOxQ4oNdZ";
        try {
            text = URLEncoder.encode(text, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/image?query=" + text; // json 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuilder resBuffer = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                resBuffer.append(inputLine);
            }
            br.close();
            System.out.println(resBuffer.toString());
            return  resBuffer.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "Error in NaverUtil's getImages";
    }
}
