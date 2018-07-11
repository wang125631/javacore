package com.wpx.demo36;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.LocalDateTime;


import org.junit.Test;

/**
 * 新时间和日期API
 * {@link Demo16}
 * 时区
 * @see com.wpx.demo36.Demo16
 * 
 * @author wangpx
 */
public class Demo15 {

	/**
	 * 
	 * 日期
	 *{@link  LocalDate} 
	 * 时间
	 *{@link  LocalTime}
	 * 日期时间
	 *{@link  LocalDateTime}
	 *
	 *<br>相同的使用方式 倾向于人读
	 */
	@Test
	public void test01() {
		//获取当前时间
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//指定时间
		LocalDateTime of = LocalDateTime.of(2018, 8, 8, 8, 23, 12, 2);
		System.out.println(of);
		//添加年份/月/..
		LocalDateTime plusYears = of.plusYears(1);
		System.out.println(plusYears);
		//减 年/月/...
		LocalDateTime minusWeeks = plusYears.minusWeeks(2);
		System.out.println(minusWeeks);
		
		System.out.println(minusWeeks.getYear() +"年"+ minusWeeks.getMonth()+"月"+minusWeeks.getDayOfWeek());
	}
	/**
	 * 计算机读的时间
	 * {@link Instant} :时间戳 (1970年1月1日 00:00:00到指定时间的毫秒值)
	 */
	@Test
	public void test02() {
		Instant now = Instant.now();// UTC时区
		System.out.println(now);  
		//偏移运算
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
		//时间戳
		System.out.println(now.toEpochMilli());
	}
	/**
	 * {@link Duration}
	 * 计算两个时间之间的间隔
	 * {@link Period}
	 * 计算两个日期之间的间隔
	 */
	@Test
	public void test03() {
		Instant now1 = Instant.now();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant now2 = Instant.now();
		Duration between = Duration.between(now1, now2);
		System.out.println(between.getSeconds());
		
		//两周有多少天
		LocalDate now3 = LocalDate.now();
		LocalDate now4 = LocalDate.now();
		LocalDate now5 = now4.plusWeeks(2);
		System.out.println(now3);
		System.out.println(now4);
		Period between2 = Period.between(now3,now5);
		System.out.println(between2.getDays());
	}
}
