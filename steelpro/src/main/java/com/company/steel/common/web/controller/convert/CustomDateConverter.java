package com.company.steel.common.web.controller.convert;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import com.company.steel.common.exceptions.SysException;

/**
 * @Description 适用于注解mvc的日期类型转换器
 * @author 
 * @date 2013-4-26
 * @version 1.0
 */
public class CustomDateConverter implements Converter<String, Date> {

	/*@Override
	public Date convert(String source) {
		try {
			return DateUtils.parseDate(source, candidateDatePatterns);
		} catch (ParseException e) {
			log.error(e.getMessage(), e);
			throw new SysException(e);
		}
	}*/
	
	public Date convert(String source) {
		try {
			return DateUtils.parseDate(source, candidateDatePatterns);
		} catch (ParseException e) {
			log.error(e.getMessage(), e);
			throw new SysException(e);
		}
	}

	
	/**
	 * 候选日期模式
	 */
	private String[] candidateDatePatterns;

	public void setCandidateDatePatterns(String[] candidateDatePatterns) {
		this.candidateDatePatterns = candidateDatePatterns;
	}

	private transient Logger log = LoggerFactory.getLogger(this.getClass());

	
}
