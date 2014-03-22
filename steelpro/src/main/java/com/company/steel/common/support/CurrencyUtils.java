package com.company.steel.common.support;

import java.text.NumberFormat;

import org.apache.commons.lang3.StringUtils;

public class CurrencyUtils {
	public static String getCurrencyString(String s){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double ls = 0d;
		if(!StringUtils.isBlank(s)){
			ls = new Double(s);
		}
		String r = nf.format(ls);
		return r;
	}
}
