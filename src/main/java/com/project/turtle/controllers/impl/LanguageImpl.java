package com.project.turtle.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.turtle.models.LanguageModel;


@RestController
@RequestMapping("/test")
public class LanguageImpl   {

	
		@GetMapping
	    public LanguageModel findCount(){
		 	//ArrayList<LanguageModel> listL = new ArrayList<>();
		 	LanguageModel model1 = new LanguageModel();
		 	model1.setName("test");
		 	model1.setId(1);
		 	model1.setCode("AR");
		 	model1.setSlug("ABC");
		 	//listL.add(model1);;
	        return model1;
	    }
	
	
}
