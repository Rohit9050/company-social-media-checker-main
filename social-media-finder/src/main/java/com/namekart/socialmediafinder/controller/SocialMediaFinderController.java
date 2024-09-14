package com.namekart.socialmediafinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.namekart.socialmediafinder.model.SocialMediaPage;
import com.namekart.socialmediafinder.service.SocialMediaFinderService;

@RestController
public class SocialMediaFinderController {
	
	   @Autowired
	    private SocialMediaFinderService socialMediaFinderService;

	    @GetMapping("/findSocialMediaPages")
	    public List<SocialMediaPage> findSocialMediaPages(@RequestParam String companyName) {
	        return socialMediaFinderService.findSocialMediaPages(companyName);
	    }

}
