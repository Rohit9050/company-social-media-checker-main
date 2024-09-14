package com.namekart.socialmediafinder.enums;

public enum SocialMediaPlatform {

	FACEBOOK("https://www.facebook.com/"), 
	TWITTER("https://twitter.com/"),
	LINKEDIN("https://www.linkedin.com/company/"), 
	INSTAGRAM("https://www.instagram.com/"),
	YOUTUBE("https://www.youtube.com/user/");

	private final String baseUrl;

	SocialMediaPlatform(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getFullUrl(String companyName) {
		return baseUrl + companyName.replaceAll(" ", "").toLowerCase();
	}
}
