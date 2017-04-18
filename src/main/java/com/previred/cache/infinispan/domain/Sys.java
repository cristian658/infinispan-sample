package com.previred.cache.infinispan.domain;

import java.io.Serializable;

public class Sys implements Serializable {
	
	private static final long serialVersionUID = -1967011578418989119L;
	
	private long type;
	private long id;
	private String message;
	private String country;
	private long sunrise;
	private long sunset;
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getSunrise() {
		return sunrise;
	}
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}
	public long getSunset() {
		return sunset;
	}
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sys [type=");
		builder.append(type);
		builder.append(", id=");
		builder.append(id);
		builder.append(", message=");
		builder.append(message);
		builder.append(", country=");
		builder.append(country);
		builder.append(", sunrise=");
		builder.append(sunrise);
		builder.append(", sunset=");
		builder.append(sunset);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
