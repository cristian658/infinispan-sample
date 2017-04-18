package com.previred.cache.infinispan.domain;

import java.io.Serializable;

public class Clouds implements Serializable {
	
	private static final long serialVersionUID = 3135109285524358903L;
	
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
