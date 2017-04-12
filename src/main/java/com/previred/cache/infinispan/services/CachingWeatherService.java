package com.previred.cache.infinispan.services;

import javax.inject.Inject;
import javax.inject.Named;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

import com.previred.cache.infinispan.dao.WeatherDAO;
import com.previred.cache.infinispan.domain.LocationWeather;

@Named
public class CachingWeatherService implements WeatherService {

	@Inject
	private WeatherDAO weatherDAO;
	
	@Inject
	private DefaultCacheManager cacheManager;
	
	private Cache<String, LocationWeather> cacheWeather;
	
	@Override
	public LocationWeather getWeatherForLocation(String location) {
		cacheWeather = cacheManager.getCache("weather");
		LocationWeather locationWeather = cacheWeather.get(location);
		if(locationWeather == null) {
			locationWeather = weatherDAO.fetchData(location);
			cacheWeather.put(location, locationWeather);
		}
		return locationWeather;
	}
	
}
