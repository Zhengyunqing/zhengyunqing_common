package com.yunqing.daomain;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.yunqing.common.utils.DateUtil;
import com.yunqing.common.utils.RandomUtil;
import com.yunqing.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 10000 ; i++) {
			Calendar c = Calendar.getInstance();
			c.set(1997, 1, 12);
			Calendar c1 = Calendar.getInstance();
			c1.set(1997, 1, 13);
			Person p=new Person(StringUtil.generateChineseName(),RandomUtil.random(1, 120), StringUtil.randomChineseString(140),DateUtil.randomDate(c.getTime(), c1.getTime()));
			System.out.println(p);
		}
	}

}
