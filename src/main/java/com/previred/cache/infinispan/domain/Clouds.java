package com.previred.cache.infinispan.domain;

public class Clouds {
	
	private float all;

	public float getAll() {
		return all;
	}

	public void setAll(float all) {
		this.all = all;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clouds [all=");
		builder.append(all);
		builder.append("]");
		return builder.toString();
	}
	
	
}
