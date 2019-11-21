package com.yk.common.utils;

import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

import org.junit.Test;
import org.springframework.format.datetime.standard.DateTimeContext;

public class DateUtil {
	
	@Test
	public static Date getDateByInitMonth(Date src){
		//TODO 实现代码
		DateTimeAtCreation dateTimeAtCreation = new DateTimeAtCreation(src);
		String string = dateTimeAtCreation.toString();
		String substring = string.substring(0);
		DateTimeContext context = new DateTimeContext();
		String string2 = context.toString();
		String concat = substring.concat(string);
		System.out.println(dateTimeAtCreation);
		return src;	
	}
}
