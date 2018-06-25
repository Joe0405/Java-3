package com.stackroute.pe3main;

//import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalculateDate {
	public String[] calculateDate() {
		String[] days = new String[2];
		Date date = new Date();  
		Calendar firstDay = Calendar.getInstance();
	    SimpleDateFormat day = new SimpleDateFormat("E, dd/MM/yyyy");  
	    firstDay.setTime(date);
	    firstDay.add(Calendar.DATE,0);
	    days[0] = day.format(firstDay.getTime());
	    firstDay.add(Calendar.DATE,5);
	    days[1] = day.format(firstDay.getTime());
		return days;
	}	

}
