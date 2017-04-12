package com.previred.cache.infinispan.services;

import javax.inject.Inject;

import com.previred.cache.infinispan.dao.WeatherDAO;
import com.previred.cache.infinispan.domain.LocationWeather;
import javax.inject.Named;

@Named
public class OpenWeatherMapService implements WeatherService {
	
	@Inject
	private WeatherDAO weatherDAO;
	
	@Override
	public LocationWeather getWeatherForLocation(String location) {
		return weatherDAO.fetchData(location);
	}

}
