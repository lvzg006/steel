package com.company.steel.common.web.controller.pagination.impl;

import com.company.steel.common.web.controller.pagination.Pageable;

/**
 * @Description 分页实现-请求
 * @author 
 * @date 2012-11-15
 * @version 1.0
 */
public class PageRequest implements Pageable {
	
	public PageRequest(Integer start, Integer limit){
		this.start = start;
		this.limit = limit;
		this.startRecord = (start - 1) * limit;
	}
	

	public Integer getPageStart() {
		return start;
	}

	public Integer getPageLimit() {
		return limit;
	}

	
	public Integer getCount() {		
		throw new UnsupportedOperationException();
	}
	
	
	public <RESULTTYPE> RESULTTYPE getResult(Class<RESULTTYPE> resultType) {
		throw new UnsupportedOperationException();
	}

	//起始页
	private Integer start;
	//单页总量
	private Integer limit;
	//起始记录
	private Integer startRecord;
	
	public Integer getStartRecord() {
		return startRecord;
	}


	public void setStartRecord(Integer startRecord) {
		this.startRecord = startRecord;
	}


	
	public Integer getTotalPageCount() {
		throw new UnsupportedOperationException();
	}
	
}
