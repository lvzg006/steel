package com.company.steel.common.web.controller;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;

import com.company.steel.common.web.controller.pagination.CustomPaginatedList;
import com.company.steel.common.web.controller.pagination.Pageable;
import com.company.steel.common.web.controller.pagination.PaginatedList;
import com.company.steel.common.web.controller.pagination.impl.PageRequest;



/**s
 * @Description 控制器基类
 * @author 
 * @date 2012-11-15
 * @version 1.0
 */
public abstract class BaseController{
	

	/**
	 * @Description 获取分页信息
	 * @param start 起始页
	 * @param limit 每页数量
	 * @return
	 * @author 
	 */
	protected Pageable findPage(int start, int limit){		
		//限制pageSize <= 150
		if(limit > 150){
			log.warn("pageSize must be less than 150");
			limit = 150;
		};
		return new PageRequest(
				start == 0 ? 1 : start,
				limit	
		);
	}
	
	/**
	 * @Description 执行分页处理
	 * @param pageable 分页结果
	 * @param start
	 * @param limit
	 * @return
	 * @author 
	 */
	protected PaginatedList doPaging(Pageable pageable, int start, int limit){
		  // 分页获取记录  
	    int pageNumber = start;
	      
	    CustomPaginatedList pageList = new CustomPaginatedList();  

	    // 设置当前页数  
	    pageList.setPageNumber(pageNumber);  
	    // 设置当前页列表  
	    pageList.setList(pageable.getResult(List.class));  
	    // 设置page size  
	    pageList.setObjectsPerPage(limit);  
	    // 设置总页数  
	    pageList.setFullListSize(pageable.getCount());  

	    return pageList;
	}
	
	protected String splitError(String errorMsg) {
		if(StringUtils.isBlank(errorMsg))
			return errorMsg;
		String[] errors = errorMsg.split("[|]");
		if(errors != null && errors.length > 1)
			return errors[1];
		else
			return errorMsg;
	}

	
	/**
	 * 分页请求起始参数
	 */
	protected final String PAGE_PARAM_START = "page";
	
	/**
	 * 每页显示数量
	 */
	protected final String PAGE_PARAM_LIMIT = "pageSize";

	protected transient Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected MessageSourceAccessor msa;
	
}
