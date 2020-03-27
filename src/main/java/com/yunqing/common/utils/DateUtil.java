package com.yunqing.common.utils;

import java.util.Date;
import java.util.Random;

public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate和endDate的随机日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		long t1 = startDate.getTime();//从1970到startDate的毫秒数
		long t2 = endDate.getTime();//从1970到endDate的毫秒数
		//随机产生一个在t1和t2之间的毫秒数
		long t=(long) ((Math.random()) * (t2-t1+1)+t1) ;		
		if(t2<t1) {
			throw new RuntimeException("不符合日期范围");
		}
		
		return new Date(t);
	}
}
