package com.previred.cache.infinispan.services;

import javax.inject.Inject;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.previred.cache.infinispan.dao.WeatherDAO;
import com.previred.cache.infinispan.domain.LocationWeather;

public class OpenWeatherMapService implements WeatherService {
	
	@Inject
	private WeatherDAO weatherDAO;
	
	
	@Override
	public LocationWeather getWeatherForLocation(String location) {
		Document dom = weatherDAO.fetchData(location);
		Element current = (Element) dom.getElementsByTagName("current").item(0);
	    Element temperature = (Element) current.getElementsByTagName("temperature").item(0);
	    Element weather = (Element) current.getElementsByTagName("weather").item(0);
	    String[] split = location.split(",");
	    return new LocationWeather(Float.parseFloat(temperature.getAttribute("value")), 
	    		weather.getAttribute("value"), 
	    		split[1].trim());		
	}

}
