package com.previred.cache.infinispan.domain;

import java.io.Serializable;

public class Coord implements Serializable {
	
	private static final long serialVersionUID = -9137990996214088339L;
	
	private float lon;
	private float lat;
	
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coord [lon=");
		builder.append(lon);
		builder.append(", lat=");
		builder.append(lat);
		builder.append("]");
		return builder.toString();
	}
	
	

}
