package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImagesItem{

	@JsonProperty("width")
	private Object width;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private Object height;

	public void setWidth(Object width){
		this.width = width;
	}

	public Object getWidth(){
		return width;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHeight(Object height){
		this.height = height;
	}

	public Object getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ImagesItem{" + 
			"width = '" + width + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}