package com.previred.cache.infinispan.domain;

public class Weather {
	
	private long id;
	private String main;
	private String description;
	private String icon;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Weather [id=");
		builder.append(id);
		builder.append(", main=");
		builder.append(main);
		builder.append(", description=");
		builder.append(description);
		builder.append(", icon=");
		builder.append(icon);
		builder.append("]");
		return builder.toString();
	}
	
	

}
