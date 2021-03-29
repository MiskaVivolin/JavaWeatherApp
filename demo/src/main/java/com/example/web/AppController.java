package com.example.web;

import java.math.BigDecimal;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.CurrentWeather;

public class AppController {

	@RequestMapping(value = { "/", "/weather" })
    public String getCurrentWeather(Model model) {
        CurrentWeather currentWeather = new CurrentWeather("Clear", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
        model.addAttribute("currentWeather", currentWeather);
        return "weather";
    }
	
}
