package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.currency.converter.service.CurrencyService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test-spring-dispatcher-servlet.xml"})
public class CurrencyConverterJUnit {

	@Autowired
	private CurrencyService currencyService;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <-----");
	}
	
	@Test
	public void testConvertedCurrencyNotNull() {
		//	Check if the return value is null.
		assertNotNull(currencyService.getConvertedCurrency("usdToInr", 3));
	}
	
	@Test
	public void testConvertedCurrencyNull() {
		//	Check if the return value is null.
		assertNull(currencyService.getConvertedCurrency("usdToInd", 3));
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}
}
