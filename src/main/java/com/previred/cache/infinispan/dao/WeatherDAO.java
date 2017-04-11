package com.previred.cache.infinispan.dao;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.previred.cache.infinispan.domain.LocationWeather;

public class WeatherDAO {

	final private static String OWM_BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
	final private static String APIKEY = "bcf843eff7f26ee7cc5172b31cec74f0";
	final private static String FORMAT_JSON = "json";

		public LocationWeather fetchData(String location) {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpURLConnection conn = null;
		LocationWeather locationWeather = null;
		
		try {
			String query = String.format("%s?q=%s&mode=%s&units=metric&APPID=%s", OWM_BASE_URL,
					  URLEncoder.encode(location.replaceAll(" ", ""), "UTF-8"), FORMAT_JSON, APIKEY);
			System.out.println("URL: " + query);
			URL url = new URL(query);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				System.out.println("Estado: " + conn.getResponseCode());
				throw new Exception();
			}
			 locationWeather = objectMapper.readValue(conn.getInputStream(), LocationWeather.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return locationWeather;
	}

}
