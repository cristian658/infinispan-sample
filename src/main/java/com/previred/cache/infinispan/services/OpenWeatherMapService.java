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
		return weatherDAO.fetchData(location);
	}

}
