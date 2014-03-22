package com.company.steel.common.support;

import java.util.Properties;

import org.apache.commons.lang.StringUtils;


public class CsvDataUtil {


	public static String filterVal(String name, String val) throws Exception {

		Properties display = DisplayPropUtil.getDisplayProp();

		if (PageFieldMapping.PAGE_FIELD_MAP.containsKey(name)) {
			name = PageFieldMapping.PAGE_FIELD_MAP.get(name);
		}

		if (display.containsKey(name + val)) {
			val = (String) display.get(name + val);
		}

		return StringUtils.stripToEmpty(val);
	}
}
