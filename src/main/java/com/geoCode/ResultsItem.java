package com.geoCode;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("elevation")
	private int elevation;

	@JsonProperty("country")
	private String country;

	@JsonProperty("admin1_id")
	private int admin1Id;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("latitude")
	private Object latitude;

	@JsonProperty("admin3_id")
	private int admin3Id;

	@JsonProperty("admin2_id")
	private int admin2Id;

	@JsonProperty("population")
	private int population;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("name")
	private String name;

	@JsonProperty("admin1")
	private String admin1;

	@JsonProperty("admin2")
	private String admin2;

	@JsonProperty("id")
	private int id;

	@JsonProperty("feature_code")
	private String featureCode;

	@JsonProperty("postcodes")
	private List<String> postcodes;

	@JsonProperty("country_id")
	private int countryId;

	@JsonProperty("admin3")
	private String admin3;

	@JsonProperty("longitude")
	private Object longitude;

	public void setElevation(int elevation){
		this.elevation = elevation;
	}

	public int getElevation(){
		return elevation;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setAdmin1Id(int admin1Id){
		this.admin1Id = admin1Id;
	}

	public int getAdmin1Id(){
		return admin1Id;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setAdmin3Id(int admin3Id){
		this.admin3Id = admin3Id;
	}

	public int getAdmin3Id(){
		return admin3Id;
	}

	public void setAdmin2Id(int admin2Id){
		this.admin2Id = admin2Id;
	}

	public int getAdmin2Id(){
		return admin2Id;
	}

	public void setPopulation(int population){
		this.population = population;
	}

	public int getPopulation(){
		return population;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAdmin1(String admin1){
		this.admin1 = admin1;
	}

	public String getAdmin1(){
		return admin1;
	}

	public void setAdmin2(String admin2){
		this.admin2 = admin2;
	}

	public String getAdmin2(){
		return admin2;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setFeatureCode(String featureCode){
		this.featureCode = featureCode;
	}

	public String getFeatureCode(){
		return featureCode;
	}

	public void setPostcodes(List<String> postcodes){
		this.postcodes = postcodes;
	}

	public List<String> getPostcodes(){
		return postcodes;
	}

	public void setCountryId(int countryId){
		this.countryId = countryId;
	}

	public int getCountryId(){
		return countryId;
	}

	public void setAdmin3(String admin3){
		this.admin3 = admin3;
	}

	public String getAdmin3(){
		return admin3;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"elevation = '" + elevation + '\'' + 
			",country = '" + country + '\'' + 
			",admin1_id = '" + admin1Id + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",admin3_id = '" + admin3Id + '\'' + 
			",admin2_id = '" + admin2Id + '\'' + 
			",population = '" + population + '\'' + 
			",country_code = '" + countryCode + '\'' + 
			",name = '" + name + '\'' + 
			",admin1 = '" + admin1 + '\'' + 
			",admin2 = '" + admin2 + '\'' + 
			",id = '" + id + '\'' + 
			",feature_code = '" + featureCode + '\'' + 
			",postcodes = '" + postcodes + '\'' + 
			",country_id = '" + countryId + '\'' + 
			",admin3 = '" + admin3 + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}