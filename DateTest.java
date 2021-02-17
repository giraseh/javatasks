package com.java.javaexamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {

		DateTest dateTest = new DateTest();

		TimeZone timeZone = TimeZone.getTimeZone("US/Central");
		String dateFormat = "yyyyMMddHHmmSSssss"; // MMMM dd,yyyy G

		System.out.println("Todays Date:" + dateTest.getTodayDate(dateFormat, timeZone));

	}

	/**
	 * Description - Method to Get Today's date
	 * 
	 * @param dateFormat
	 * @param TimeZone
	 */
	public String getTodayDate(String dateFormat, TimeZone timeZone) {
		Date todayDate = new Date();
		/* Specifying the format */
		DateFormat todayDateFormat = new SimpleDateFormat(dateFormat);
		/* Setting the Timezone */
		todayDateFormat.setTimeZone(timeZone);
		/* Picking the date value in the required Format */
		String strTodayDate = todayDateFormat.format(todayDate);
		return strTodayDate;
	}

}
