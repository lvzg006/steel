package com.company.steel.common.support;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

public class MathUtils {

	public static String getRandomString(int length)
	{
	String str = "0123456789";
	Random random = new Random();
	StringBuffer sb = new StringBuffer();

	for (int i = 0; i < length; ++i)
	{
	int number = random.nextInt(10);

	sb.append(str.charAt(number));
	}

	return sb.toString();
	}
	
	public static String substractDecimal(String minuend, String subtractor) {
		try {
			if(StringUtils.isBlank(minuend) || StringUtils.isBlank(subtractor))
				return "";
			BigDecimal m = new BigDecimal(minuend);
			BigDecimal s = new BigDecimal(subtractor);
			return String.valueOf(m.subtract(s));
		} catch (Exception e) {
			return "";
		}
	}
	
	public static BigDecimal addDecimal(BigDecimal add1, BigDecimal add2) {
		if (add1 == null) return add2;
		if (add2 == null) return add1;
		
		return add1.add(add2).setScale(2,RoundingMode.HALF_UP);
	}
	
	public static BigDecimal minusDecimal(BigDecimal b1, BigDecimal b2) {
		if (b1 == null || b2 == null) return b1;
		return b1.subtract(b2).setScale(2,RoundingMode.HALF_UP);
	}
	
	public static BigDecimal multiDecimal(BigDecimal b1,Integer oweDays) {
		if (b1 == null) return b1;
		return b1.multiply(new BigDecimal(oweDays)).setScale(2,RoundingMode.HALF_UP);
	}
	
	public static BigDecimal multiDecimal(BigDecimal b1,BigDecimal b2) {
		if (b1 == null) return b1;
		return b1.multiply(b2).setScale(2,RoundingMode.HALF_UP);
	}
	
	public static Boolean compareDecimal(BigDecimal b1, BigDecimal b2) {
		if (b1.compareTo(b2) >= 0) {
			return true;
		} 
		
		return false;
	}
	
	public static Boolean compareMoreZero(BigDecimal b1) {
		return b1.compareTo(zeroBigdecimal()) > 0;
	}
	
	public static Boolean compareLessZero(BigDecimal b1) {
		return b1.compareTo(zeroBigdecimal()) <= 0;
	}
	
	public static Boolean compareEqualZero(BigDecimal b1) {
		return b1.compareTo(zeroBigdecimal()) == 0;
	}
	
	public static BigDecimal zeroBigdecimal() {
		return new BigDecimal("0.00").setScale(2);
	}

}
