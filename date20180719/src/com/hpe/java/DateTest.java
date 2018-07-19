package com.hpe.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test1() {
		
		Date date = new Date();
		//System.out.println(date);
		
		/*Date date1 = new Date(1000);
		System.out.println(date1);*/
		
		
		SimpleDateFormat sdf = new 
				SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		
		String dateStr = "1997-06-26 05:30:00";
		try {
			Date date2 = sdf.parse(dateStr);
			System.out.println(date2);
			long time = date2.getTime();
			System.out.println(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
