package com.previred.cache.infinispan.rs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
		StringBuilder responds = new StringBuilder();
		for(String location : locations){
			responds.append(weatherService.getWeatherForLocation(location).toString());
		}
        return responds.toString();
    }
}
