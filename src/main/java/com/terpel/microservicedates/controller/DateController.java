package com.terpel.microservicedates.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terpel.microservicedates.model.Model;

@RestController
@RequestMapping("/date")
public class DateController {
    LocalDate localDate=LocalDate.now();
	Locale spanishLocale = new Locale("es", "ES");

	@RequestMapping(method = RequestMethod.GET)
	public Model getPetById() {
		return new Model(generarPeriodo(), generarFecha(), generarDia());
	}

	private String generarDia() {
		DayOfWeek day = localDate.getDayOfWeek();
		return day.getDisplayName(TextStyle.FULL, spanishLocale);
	}

	private String generarFecha() {
		String date = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", spanishLocale));
		return date;
	}

	private String generarPeriodo() {
		LocalTime time = LocalTime.now();
		String periodo = "";
		if (time.getHour() < 12) {
			periodo = "dias";
		} else if (time.getHour() < 18) {
			periodo = "tardes";
		} else {
			periodo = "noches";
		}
		return periodo;
	}

}
