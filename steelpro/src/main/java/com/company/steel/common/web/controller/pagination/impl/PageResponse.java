package com.company.steel.common.web.controller.pagination.impl;

import com.company.steel.common.web.controller.pagination.Pageable;

/**
 * @Description 分页实现-响应
 * @author 
 * @date 2012-11-15
 * @version 1.0
 */
public class PageResponse implements Pageable {
	
	public PageResponse(Object result, Integer count){
		this.result = result;
		this.count = count;
	}
	
	public PageResponse(Object result, Integer count,Integer pageSize){
		this.result = result;
		this.count = count;
		this.pageSize= pageSize;
	}

	
	public Integer getPageStart() {
		throw new UnsupportedOperationException();
	}

	
	public Integer getPageLimit() {
		return pageSize;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public Integer getTotalPageCount() {
        return count % pageSize != 0 ? count / pageSize + 1 : count / pageSize;
    }

	
	public Integer getCount() {
		return count;
	}

	
	public<RESULTTYPE> RESULTTYPE getResult(Class<RESULTTYPE> resultType) {
		return resultType.cast(result);
	}
	
	//结果集
	private Object result;
	//结果集总数
	private Integer count;
	
	private Integer pageSize;
}
