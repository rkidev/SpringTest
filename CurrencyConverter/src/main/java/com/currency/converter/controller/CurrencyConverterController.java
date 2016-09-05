package com.currency.converter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.currency.converter.model.UserInput;
import com.currency.converter.service.CurrencyService;

@Controller
public class CurrencyConverterController {

	@Autowired
	private CurrencyService currencyService;
	
	/* Getting user input data and return model object */
	@RequestMapping(value = "jsp/submitUserInput", method = RequestMethod.POST)
	public ModelAndView convertCurrency(@ModelAttribute("userInput") UserInput userInput) {

		
		double rate;
		ModelAndView model = new ModelAndView("ConvertedCurrency");
		
		String key = userInput.getInputCurrency() + "To" + userInput.getOutputCurrency();
		
		if (userInput.getInputCurrency().equalsIgnoreCase(userInput.getOutputCurrency())) {
			model.addObject("convertedCurrency", userInput.getAmount());
		} else {
			rate = currencyService.getConvertedCurrency(key, userInput.getAmount());
			model.addObject("convertedCurrency", rate);
		}

		return model;
	}

}
