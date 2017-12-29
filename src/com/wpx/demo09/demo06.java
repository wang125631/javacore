package com.wpx.demo09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期类 Date 
 
	
	Calendar
	 
	 
	日期格式化类    SimpleDateFormat
 * @author wangpx
 */
public class demo06 {

	public static void main(String[] args) throws ParseException {
		/*Date date = new Date(); // 获取当前的系统时间		
		Calendar calendar = Calendar.getInstance(); //获取当前的系统时间。
		System.out.println("年："+ calendar.get(Calendar.YEAR));
		System.out.println("月："+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("日："+ calendar.get(Calendar.DATE));
		System.out.println("时："+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+ calendar.get(Calendar.MINUTE));
		System.out.println("秒："+ calendar.get(Calendar.SECOND));
		*/
		/**
		 * 
		 *  日期格式化类    SimpleDateFormat 
		 *  		作用1： 可以把日期转换转指定格式的字符串     format()
		 *  		作用2： 可以把一个 字符转换成对应的日期。    parse()   生日
		 */
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月dd日    HH时mm分ss秒");
		String format = sdf.format(d);
		System.out.println(format);
		
		Date parse = sdf.parse(format);
		System.out.println(parse);
	}
}
