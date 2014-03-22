package com.company.steel.common.support;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.company.steel.common.comm.Constants;

public class BusinessUtil {
	
	/**
	 * 得到页面选中的数据
	 * */
	public static LinkedHashMap<String, String> getStorage(String _storage) {
		Map<String, ArrayList<LinkedHashMap<String, String>>> map = JsonUtils.jsonString2Map(_storage);
		if(map == null || map.isEmpty())
			return null;
		ArrayList<LinkedHashMap<String, String>> ids = map.get(Constants._storage);
		if(ids == null || ids.isEmpty())
			return null;
		LinkedHashMap<String, String> selectArr = ids.get(0);
		if(selectArr == null || selectArr.isEmpty())
			return null;
		return selectArr;
	}
	
	/**
	 * 替换卡号-前6后4当中用*代替
	 * @param cardNo
	 * @return
	 */
	public static String subCardNo(String cardNo) {
		if(StringUtils.isBlank(cardNo))
			return "";
		else if(cardNo.length() < 6)
			return cardNo;
		return cardNo.substring(0, 6).concat("******").concat(cardNo.substring(cardNo.length()-4,cardNo.length()));
	}
	
	
	public static String doSysNo(String id) {
		if (id.length() < 20) {
			return StringUtils.leftPad(id,20,'0');
		}
		String reverseId = StringUtils.reverse(id);
		return reverseId.substring(0,20);
	}
	
	public static String doAmt(BigDecimal amt) {
		BigDecimal formatAmt = amt.setScale(2, RoundingMode.HALF_DOWN);
		formatAmt = formatAmt.multiply(new BigDecimal(100)).setScale(0);
		return formatAmt.toString();
	}
	
	public static void main(String[] args) {
		String id1 = "124";
		String id2 = "123456";
		
		String id3="123456789";
		
		System.out.println(doSysNo(id1));
		System.out.println(doSysNo(id2));
		System.out.println(doSysNo(id3));
		//=========
		System.out.println("doAmt:" + doAmt(new BigDecimal("0")));
		System.out.println("doAmt:" + doAmt(new BigDecimal("1.0")));
		System.out.println("doAmt:" + doAmt(new BigDecimal("1.11")));
		System.out.println("doAmt:" + doAmt(new BigDecimal("1.1123")));
		System.out.println("doAmt:" + doAmt(new BigDecimal("1.1179")));
	}
	
}
