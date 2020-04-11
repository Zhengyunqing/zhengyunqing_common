package com.yunqing.common.utils;


import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testBaiNumber() {
		String baiNumber = NumberUtil.baiNumber(50, 50);
		System.out.println(baiNumber);
	}

}
