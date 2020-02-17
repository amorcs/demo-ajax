package com.marcos.demoajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcos.demoajax.domain.SocialMetaTag;
import com.marcos.demoajax.service.SocialMetaTagService;

@Controller
@RequestMapping("/meta")
public class SocialMetaTagController {
	@Autowired
	private SocialMetaTagService metaTagService;
	
	@PostMapping("/info")
	public ResponseEntity<SocialMetaTag> getDadosViaUrl(@RequestParam("url")String url){
		SocialMetaTag socialMetaTag = metaTagService.getSocialMetaTagByUrl(url);
		return socialMetaTag!=null 
				? ResponseEntity.ok(socialMetaTag) 
				: ResponseEntity.notFound().build();
	}
}
