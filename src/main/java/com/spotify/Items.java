package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items{

	@JsonProperty("total")
	private int total;

	@JsonProperty("href")
	private String href;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	@Override
 	public String toString(){
		return 
			"Items{" + 
			"total = '" + total + '\'' + 
			",href = '" + href + '\'' + 
			"}";
		}
}