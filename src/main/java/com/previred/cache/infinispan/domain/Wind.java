package com.previred.cache.infinispan.domain;

import java.io.Serializable;

public class Wind implements Serializable {
	
	private static final long serialVersionUID = 6398894976624061722L;
	
	private float speed;
	private float deg;
	
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDeg() {
		return deg;
	}
	public void setDeg(float deg) {
		this.deg = deg;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wind [speed=");
		builder.append(speed);
		builder.append(", deg=");
		builder.append(deg);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
