package com.webnest.commons.util;

import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class DateTimeUtils {
	
	private DateTimeUtils() {
		//Singleton
	}
	
	public static String toString(Temporal dataHora, String mascara) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(mascara);
		return formatter.format(dataHora);
	}

}
