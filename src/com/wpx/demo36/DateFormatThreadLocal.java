package com.wpx.demo36;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author wangpx
 */
public class DateFormatThreadLocal {

	private static final ThreadLocal<DateFormat> tl = new ThreadLocal<DateFormat>() {
		protected DateFormat initValue() {
			return new SimpleDateFormat("yyyyMMdd");
		}
	};
	
	public static Date conver(String source) throws ParseException {
		return tl.get().parse(source);
	}
}
