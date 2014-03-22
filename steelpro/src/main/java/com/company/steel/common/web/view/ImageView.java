package com.company.steel.common.web.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

/**
 * @Description 图片视图
 * @author 
 * @date 2013-2-26
 * @version 1.0
 */
public class ImageView extends AbstractView {
	
	public static final String DEFAULT_CONTENT_TYPE = "image/jpeg";
	
	public ImageView(){
		//候选view需要从中获取匹配视图
		this.setContentType(DEFAULT_CONTENT_TYPE);
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//do nothing
	}
	
	@Override
	protected void prepareResponse(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType(getContentType());
		response.addHeader("Pragma", "no-cache");
		response.addHeader("Cache-Control", "no-cache,no-store");
		response.addDateHeader("Expires", -1);
	}

}
