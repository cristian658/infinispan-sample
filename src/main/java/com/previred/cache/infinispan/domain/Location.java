package com.previred.cache.infinispan.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Location {
	
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
