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

}
