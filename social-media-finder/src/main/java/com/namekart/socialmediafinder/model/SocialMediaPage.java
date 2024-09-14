package com.namekart.socialmediafinder.model;

public class SocialMediaPage {

	private String platformName;
	private String pageUrl;
	private boolean isActive;

	public SocialMediaPage() {
		super();
	}

	public SocialMediaPage(String platformName, String pageUrl, boolean isActive) {
		super();
		this.platformName = platformName;
		this.pageUrl = pageUrl;
		this.isActive = isActive;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
