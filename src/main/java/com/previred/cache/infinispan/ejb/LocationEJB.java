package com.previred.cache.infinispan.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import com.previred.cache.infinispan.domain.Location;
import java.io.Serializable;

@SessionScoped
public class LocationEJB implements Serializable {

	private static final long serialVersionUID = -8744540420122168967L;
	
	private List<Location> locations;
	
	@PostConstruct
	public void init(){
		Location l = new Location("Valparaiso, Chile");
		Location l2 = new Location("Valdivia, Chile");
		Location l3 = new Location("Santiago, Chile");
		
		this.addLocation(l);
		this.addLocation(l2);
		this.addLocation(l3);
	}
	
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public void addLocation(Location location){
		locations.add(location);
	}
	
	
}
