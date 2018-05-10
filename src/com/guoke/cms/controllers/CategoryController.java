package com.guoke.cms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.guoke.cms.models.Category;
import com.guoke.controller.BaseController;

@Controller
@RequestMapping("/Category")
public class CategoryController extends BaseController<Category> {
	@RequestMapping("/Index")
	public  ModelAndView Index() {		
		return View("/Category/Index");
	}
}
