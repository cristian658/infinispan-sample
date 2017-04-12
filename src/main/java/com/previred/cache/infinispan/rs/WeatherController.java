package com.previred.cache.infinispan.rs;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.previred.cache.infinispan.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.previred.cache.infinispan.services.WeatherService;

import javax.inject.Named;
import javax.management.DescriptorKey;

@Path("/weather")
public class WeatherController {
	
	static final String[] locations = { "Valparaiso, Chile", "Valdivia, Chile", "Santiago, Chile" };
	
	@Inject @Named("openWeatherMapService")
	private WeatherService weatherService;
	
	@Inject @Named("cachingWeatherService")
	private WeatherService weatherServiceCache;
	
	@GET
    @Path("/getall")
    @Produces({ "application/json" })
    public String getAll() {
		String response = "";
		ObjectMapper mapper = new ObjectMapper();
		List<LocationWeather> listaUbicaciones = new ArrayList<LocationWeather>();
		for(String location : locations){
			listaUbicaciones.add(weatherService.getWeatherForLocation(location));
		}
		try {
			response = mapper.writeValueAsString(listaUbicaciones);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return response;
    }
	
	@GET
    @Path("/getallCache")
    @Produces({ MediaType.APPLICATION_JSON })
    public String getAllCache() {
		String response = "";
		ObjectMapper mapper = new ObjectMapper();
		List<LocationWeather> listaUbicaciones = new ArrayList<LocationWeather>();
		for(String location : locations){
			listaUbicaciones.add(weatherServiceCache.getWeatherForLocation(location));
		}
		try {
			response = mapper.writeValueAsString(listaUbicaciones);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return response;
    }
	
	
	
	
	
}
