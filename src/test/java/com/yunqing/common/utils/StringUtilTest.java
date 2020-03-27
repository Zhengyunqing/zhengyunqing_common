package com.yunqing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str="";
		//String str=" ";
		String str="a";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="";
		String str1=" ";
		String str2="1";
		boolean b = StringUtil.hasText(str1);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(5);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
