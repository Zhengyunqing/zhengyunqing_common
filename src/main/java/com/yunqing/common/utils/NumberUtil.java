package com.yunqing.common.utils;

import java.text.NumberFormat;

public class NumberUtil {
	public static String baiNumber(int num1,int num2) {
		//创建一个数值格式化对象
		NumberFormat numerberFormat = NumberFormat.getInstance();
		//设置精确到小数点后2位
		numerberFormat.setMaximumFractionDigits(0);
		String result=numerberFormat.format((float)num1/(float)num2*100);
		return result+"%";
	}
}
