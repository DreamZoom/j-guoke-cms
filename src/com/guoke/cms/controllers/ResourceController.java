package com.guoke.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guoke.cms.models.Resource;
import com.guoke.controller.BaseController;

@Controller
@RequestMapping("/Resource")
public class ResourceController extends BaseController<Resource> {
	@RequestMapping("/Index")
	public  ModelAndView Index() {		
		return View("/Resource/Index");
	}
}
