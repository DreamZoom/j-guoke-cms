package com.guoke.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.guoke.cms.models.Tag;
import com.guoke.controller.BaseController;

@Controller
@RequestMapping("/Tag")
public class TagController extends BaseController<Tag> {
	@RequestMapping("/Index")
	public  ModelAndView Index() {		
		return View("/Tag/Index");
	}
}
