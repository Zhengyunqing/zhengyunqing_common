package com.yunqing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Calendar c = Calendar.getInstance();
		c.set(1997, 1, 12);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			//System.out.println(df.format(date));
		}
	
	}
	//月初
	@Test
	public void testMonth() {
		Date date = DateUtil.getInitMonth(new Date(30000000000000l));
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sd.format(date));
	}
	
	//月末
		@Test
		public void testEndMonth() {
//			Calendar c = Calendar.getInstance();
//			c.set(2020,1,20);
			Date date = DateUtil.getEndMonth(new Date(10000000000000l));
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sd.format(date));
		}
	
		@Test
		public void testGetAge() {
			Calendar c = Calendar.getInstance();
			c.set(2011, 2,28);
			int i = DateUtil.getAgeByBirthday(c.getTime());
			System.out.println(i);
		}
	
	
}
