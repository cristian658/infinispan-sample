package com.previred.cache.infinispan.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Location {
	
	private String location;
	
	public Location(){}

	public Location(String location) {
		super();
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
