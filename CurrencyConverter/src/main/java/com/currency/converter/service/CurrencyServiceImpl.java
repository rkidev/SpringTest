package com.currency.converter.service;

import java.util.Map;

import javax.annotation.Resource;

public class CurrencyServiceImpl implements CurrencyService {

	@Resource(name = "currencyrate")
	private Map<String, Double> currencyrate;

	public double getConvertedCurrency(String key, Integer amount) {

		double rate = currencyrate.get(key) * amount;
		return rate;

	}
}
