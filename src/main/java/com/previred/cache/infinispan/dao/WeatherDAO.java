package com.previred.cache.infinispan.dao;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class WeatherDAO {
	
	final private static String OWM_BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
	final private static String APIKEY = "...";
	
	private DocumentBuilder db;
	
	public Document fetchData(String location) {
		 HttpURLConnection conn = null;
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 
	      try {
	    	  db = dbf.newDocumentBuilder();
			 String query = String.format("%s?q=%s&mode=xml&units=metric&APPID=%s", OWM_BASE_URL,
					  URLEncoder.encode(location.replaceAll(" ", ""), "UTF-8"), APIKEY);
			 System.out.println("URL: "+query);
			 URL url = new URL(query);
			 conn = (HttpURLConnection) url.openConnection();
			 conn.setRequestMethod("GET");
			 conn.setRequestProperty("Accept", "application/xml");
			 if (conn.getResponseCode() != 200) {
			    throw new Exception();
			 }
			 System.out.println("Estado: "+ conn.getResponseCode());
			 return db.parse(conn.getInputStream());
	      } catch (Exception e) {
	         return null;
	      } finally {
	         if (conn != null) {
	            conn.disconnect();
	         }
	      }
	}

}
