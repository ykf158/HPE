package com.task.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestFour {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		Date inputTime = null;
		Date beginTime = null;
		Date endTime = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入指定日期：格式为：hh:mm");
		String time = sc.nextLine();		
		
			try {
				inputTime = sdf.parse(time);
				beginTime = sdf.parse("06:00");
				endTime = sdf.parse("21:59");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		
		System.out.println("请输入乘车距离");
		double km = sc.nextDouble();
		double pay = 0.0;
		if (belongCalendar(inputTime, beginTime, endTime)) {
			if (km <= 2.0) {
				pay = 6 + 1;
			}else {
				pay = 6 + 1.5 * (km-2) + 1;
			}
		} else {
			if (km <= 2.0) {
				pay = 7 + 1;
			}else {
				pay = 7 + 1.5 * (km-2) + 1;
			}
		}
		
		System.out.println("你需要支付的费用为："+pay);
		
	}
	
	//判断输入时间是否处于指定时间段
	public static boolean belongCalendar(Date inputTime,Date beginTime,Date endTime) {
		
		
		/*Calendar input = Calendar.getInstance();
		input.setTime(inputTime);
		Calendar begin = Calendar.getInstance();
		begin.setTime(beginTime);
		Calendar end = Calendar.getInstance();
		end.setTime(endTime);
		if (input.after(begin)&&input.before(end)) {
			return true;
		}else {
			return false;
		}*/
		if (inputTime.after(beginTime)&&inputTime.before(endTime)) {
			return true;
		}else {
			return false;
		}
		
	}

}
