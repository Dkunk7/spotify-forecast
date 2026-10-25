package com.spotify;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Playlists{

	@JsonProperty("next")
	private String next;

	@JsonProperty("total")
	private int total;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("limit")
	private int limit;

	@JsonProperty("href")
	private String href;

	@JsonProperty("items")
	private List<ItemsItem> items;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setPrevious(Object previous){
		this.previous = previous;
	}

	public Object getPrevious(){
		return previous;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Playlists{" + 
			"next = '" + next + '\'' + 
			",total = '" + total + '\'' + 
			",offset = '" + offset + '\'' + 
			",previous = '" + previous + '\'' + 
			",limit = '" + limit + '\'' + 
			",href = '" + href + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}