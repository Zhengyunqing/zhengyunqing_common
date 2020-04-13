package com.yunqing.common.utils;

import java.util.Calendar;
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
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回传入日期的月初 如 传入1997-02-12 返回 1997-02-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();//获取一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0个小时
		c.set(Calendar.MINUTE, 0);//设置天的0分钟
		c.set(Calendar.SECOND, 0);//设置天的0秒
		return c.getTime();
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回传入日期的月末 如 传入1997-03-12 返回 1997-03-31 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//先初始化日历类
		Calendar c = Calendar.getInstance();
		//用传入参数初始化日历类
		c.setTime(date);
		//想当前月份+1天  变成4-27  变成月初2020/04-01 00:00:00,再减去1秒  
		c.add(Calendar.MONTH, 1);//1.让当前日期的月份+1
		Date initMonth = getInitMonth(c.getTime());//2.变成月初
		//用initMonth 再次初始化日历类
		c.setTime(initMonth);
		c.add(Calendar.SECOND,-1);//在减去1秒
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据出生日期算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date birthday) {
		Calendar c = Calendar.getInstance();//获取日期类
		int s_year=c.get(Calendar.YEAR);//获取系统的年
		int s_month=c.get(Calendar.MONTH);//获取系统的月
		int s_date=c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		c.setTime(birthday);//用出生日期初始化日历类
		int b_year=c.get(Calendar.YEAR);  //获取年
		int b_month=c.get(Calendar.MONTH);  //获取年
		int b_date=c.get(Calendar.DAY_OF_MONTH);  //获取年
		
		int age=s_year-b_year;
		if(s_month<b_month) {
			age--;
		}else if(s_month==b_month && s_date<b_date) {
			age--;
		}
		
		return age;
	}
	/**
	 * 
	 * @Title: getDateByBefore 
	 * @Description: 返回昨天的时间
	 * @return
	 * @return: Date
	 */
	public static Date getDateByBefore() {
		//用系统时间初始化 Calender
		Calendar c=Calendar.getInstance();
		//让系统时间减去1天
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}
	
}
