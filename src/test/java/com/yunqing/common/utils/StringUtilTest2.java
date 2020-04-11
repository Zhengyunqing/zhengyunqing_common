package com.yunqing.common.utils;

import org.junit.Test;

public class StringUtilTest2 {
	@Test
	public void testIsEmail() {
		String str="111@qq.com";
		boolean b = StringUtil.isEmail(str);
		System.out.println(b);
	}
	
	@Test
	public void testIsPhoneNumber() {
		String str="13456789101";
		boolean b = StringUtil.isPhoneNumber(str);
		System.out.println(b);
	}
	
	@Test
	public void testIsNumber() {
		String str="-34";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
	}
}
