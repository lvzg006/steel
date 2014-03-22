package com.company.steel.common.comm;

public class Constants {
	
	public static final String QUERY_SUB = "querySub";
	
	public static final String ERROR_KEY = "error:";
	
	public static final String RMB = "156";
	
	/**
	 * 异常头结构
	 * */
	public static final String ERROR_MESSAGE = "ERROR MESSAGE: {}";
	
	/**
	 * 日期验证正则-yyyy-MM-dd
	 * */
	public static final String DATE_PATTERN = "^\\d{4}(\\-\\d{2}){2}$";
	
	/**
	 * 日期验证正则-HH:mm:ss
	 * */
	public static final String TIME_PATTERN = "^\\d{2}(:\\d{2}){2}$";
	
	/**
	 * 日期验证正则-yyyy-MM-dd HH:mm:ss
	 * */
	public static final String DATE_TIME_PATTERN = "^\\d{4}(\\-\\d{2}){2}\\s\\d{2}(:\\d{2}){2}$";
	/**
	 * 金额验证正则
	 * */
	public static final String AMT_PATTERN = "^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){1,4})?$";
	
	
	/**
	 * 时间日期格式 yyyy-MM-dd HH:mm:ss
	 */
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 日期格式 yyyy-MM-dd
	 */
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	
	/**
	 * 时间格式 HH:mm:ss
	 */
	public static final String TIME_FORMAT = "HH:mm:ss";
	
	/**
	 * 时间日期格式yyyyMMddHHmmss
	 */
	public static final String DATE_TIME_FORMAT_NO_SEPARATOR = "yyyyMMddHHmmss";
	
	/**
	 * 资源状态-有效
	 * */
	public static final String RESOURCE_EFFECT = "1";
	/**
	 * 资源状态-无效
	 * */
	public static final String RESOURCE_UNEFFECT = "0";
	
	/**
	 * 菜单状态-有效
	 * */
	public static final String MENU_EFFECT = "1";
	/**
	 * 菜单状态-无效
	 * */
	public static final String MENU_UNEFFECT = "0";
	
	
	/**
	 * 角色状态-启用
	 * */
	public static final String ROLE_EFFECT = "1";
	/**
	 * 角色状态-禁用
	 * */
	public static final String ROLE_UNEFFECT = "0";
	
	/**
	 * 用户状态-启用
	 * */
	public static final String USER_EFFECT = "1";
	/**
	 * 用户状态-禁用
	 * */
	public static final String USER_UNEFFECT = "0";
	
	/**
	 * 是否叶子节点-否
	 * */
	public static final String IS_NOT_LEAF = "0";
	/**
	 * 是否叶子节点-是
	 * */
	public static final String IS_LEAF = "1";
	
	/* 交易码前缀 */
	public static final String TRAN_PREFIX = "TRAN_";
	
	public static final String SESSION_ID = "sessionId";
	
	/**
	 * 默认每页条数
	 * */
	public static final Integer DEFAULT_LIMIT = 10;
	
	public static final String _storage = "_storage";
	
	public static final String _col1 = "col1";
	
	public static final String _message = "message";
	
	public static final String PAGE_LIST = "pageList";
	
	public static final String _page = "page";
	
	public static final String _add = "add";
	
	public static final String _update = "update";
	
	public static final String _delData = "delData";
	
	public static final String _securityFilter = "cAuthc";
	
	public static final String _subBtn = "subBtn";
	
	public static final String SUCCESS = "000000";
	
}
