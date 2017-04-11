package com.previred.cache.infinispan.rs;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.previred.cache.infinispan.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.previred.cache.infinispan.services.WeatherService;

@Path("/weather")
public class WeatherController {
	
	static final String[] locations = { "Valparaiso, Chile", "Valdivia, Chile", "Santiago, Chile" };
	
	@Inject
	private WeatherService weatherService;
	
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
}
