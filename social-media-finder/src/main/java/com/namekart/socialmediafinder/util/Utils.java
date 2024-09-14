package com.namekart.socialmediafinder.util;

import org.springframework.web.client.RestTemplate;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {
	
	 private static final RestTemplate restTemplate = new RestTemplate();

	    public static boolean isPageActive(String pageUrl) {
	        try {
	            URL url = new URL(pageUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");
	            connection.setConnectTimeout(5000); // 5 seconds timeout
	            connection.connect();
	            int responseCode = connection.getResponseCode();
	            return (responseCode >= 200 && responseCode < 300); // Check for successful responses
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}
