package com.namekart.socialmediafinder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.namekart.socialmediafinder.enums.SocialMediaPlatform;
import com.namekart.socialmediafinder.model.SocialMediaPage;
import com.namekart.socialmediafinder.util.Utils;

@Service
public class SocialMediaFinderService {
	
	   public List<SocialMediaPage> findSocialMediaPages(String companyName) {
	        List<SocialMediaPage> socialMediaPages = new ArrayList<>();

	        for (SocialMediaPlatform platform : SocialMediaPlatform.values()) {
	            String pageUrl = platform.getFullUrl(companyName);
	            boolean isActive = Utils.isPageActive(pageUrl);
	            SocialMediaPage page = new SocialMediaPage(platform.name(), pageUrl, isActive);
	            socialMediaPages.add(page);
	        }

	        return socialMediaPages;
	    }
}
