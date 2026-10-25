package com.spotify;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("owner")
	private Owner owner;

	@JsonProperty("images")
	private List<ImagesItem> images;

	@JsonProperty("snapshot_id")
	private String snapshotId;

	@JsonProperty("collaborative")
	private boolean collaborative;

	@JsonProperty("description")
	private String description;

	@JsonProperty("primary_color")
	private Object primaryColor;

	@JsonProperty("type")
	private String type;

	@JsonProperty("uri")
	private String uri;

	@JsonProperty("public")
	private boolean jsonMemberPublic;

	@JsonProperty("name")
	private String name;

	@JsonProperty("href")
	private String href;

	@JsonProperty("id")
	private String id;

	@JsonProperty("external_urls")
	private ExternalUrls externalUrls;

	@JsonProperty("items")
	private Items items;

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setSnapshotId(String snapshotId){
		this.snapshotId = snapshotId;
	}

	public String getSnapshotId(){
		return snapshotId;
	}

	public void setCollaborative(boolean collaborative){
		this.collaborative = collaborative;
	}

	public boolean isCollaborative(){
		return collaborative;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPrimaryColor(Object primaryColor){
		this.primaryColor = primaryColor;
	}

	public Object getPrimaryColor(){
		return primaryColor;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setJsonMemberPublic(boolean jsonMemberPublic){
		this.jsonMemberPublic = jsonMemberPublic;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setExternalUrls(ExternalUrls externalUrls){
		this.externalUrls = externalUrls;
	}

	public ExternalUrls getExternalUrls(){
		return externalUrls;
	}

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"owner = '" + owner + '\'' + 
			",images = '" + images + '\'' + 
			",snapshot_id = '" + snapshotId + '\'' + 
			",collaborative = '" + collaborative + '\'' + 
			",description = '" + description + '\'' + 
			",primary_color = '" + primaryColor + '\'' + 
			",type = '" + type + '\'' + 
			",uri = '" + uri + '\'' + 
			",public = '" + jsonMemberPublic + '\'' + 
			",name = '" + name + '\'' + 
			",href = '" + href + '\'' + 
			",id = '" + id + '\'' + 
			",external_urls = '" + externalUrls + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}