package com.previred.cache.infinispan.domain;

public class Main {

	private float temp;
	private float pressure;
	private float humidity;
	private float temp_min;
	private float temp_max;
	private float sea_level;
	private float grnd_level;
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}
	public float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	public float getSea_level() {
		return sea_level;
	}
	public void setSea_level(float sea_level) {
		this.sea_level = sea_level;
	}
	public float getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(float grnd_level) {
		this.grnd_level = grnd_level;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Main [temp=");
		builder.append(temp);
		builder.append(", pressure=");
		builder.append(pressure);
		builder.append(", humidity=");
		builder.append(humidity);
		builder.append(", temp_min=");
		builder.append(temp_min);
		builder.append(", temp_max=");
		builder.append(temp_max);
		builder.append(", sea_level=");
		builder.append(sea_level);
		builder.append(", grnd_level=");
		builder.append(grnd_level);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
