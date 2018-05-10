package com.guoke.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.guoke.cms.models.Site;
import com.guoke.controller.BaseController;

@Controller
@RequestMapping("/Site")
public class SiteController extends BaseController<Site> {
	@RequestMapping("/Index")
	public  ModelAndView Index() {		
		return View("/Site/Index");
	}
}
