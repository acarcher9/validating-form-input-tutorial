package com.example.validatingforminput;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//We are creating a Controller! Note that all of these are in a main.java folder...
@Controller
public class WebController implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}

//	This is the GET method linking to info from form.html in template
	@GetMapping("/")
	public String showForm(PersonForm personForm) {
		return "form";
	}

//	This is the POST method
	@PostMapping("/")
//	checkPerson Info takes two arguments...
	public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		// if statement in case info entered has a problem. it'll redirect to the form to correct. if not it'll display the results.
		if (bindingResult.hasErrors()) {
			return "form";
		}

		return "redirect:/results";
	}
}
