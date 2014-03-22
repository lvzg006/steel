package com.company.steel.common.support;

import java.util.HashMap;
import java.util.Map;

public class PageFieldMapping {

	public static final Map<String, String> PAGE_FIELD_MAP = new HashMap<String, String>();

	static {
		PAGE_FIELD_MAP.put("outSupplierCode", "bankName");
		PAGE_FIELD_MAP.put("bankCode", "bankName");
		PAGE_FIELD_MAP.put("hisSupplierCode", "bankName");
	}

}
