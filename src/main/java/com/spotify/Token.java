package com.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token{

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("expires_in")
	private int expiresIn;

	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	public String getAccessToken(){
		return accessToken;
	}

	public void setTokenType(String tokenType){
		this.tokenType = tokenType;
	}

	public String getTokenType(){
		return tokenType;
	}

	public void setExpiresIn(int expiresIn){
		this.expiresIn = expiresIn;
	}

	public int getExpiresIn(){
		return expiresIn;
	}

	@Override
 	public String toString(){
		return 
			"Token{" + 
			"access_token = '" + accessToken + '\'' + 
			",token_type = '" + tokenType + '\'' + 
			",expires_in = '" + expiresIn + '\'' + 
			"}";
		}
}