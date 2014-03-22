package com.company.steel.common.web.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;


/**
 * @Description 自定义映射异常解析器
 * @author 
 * @date 2012-11-19
 * @version 1.0
 */
public class CustomMappingExceptionResolver extends
		SimpleMappingExceptionResolver {

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// Expose ModelAndView for chosen error view.
		String viewName = determineViewName(ex, request);
		if (viewName != null) {
			// Apply HTTP status code for error views, if specified.
			// Only apply it if we're processing a top-level request.
			Integer statusCode = determineStatusCode(request, viewName);
			if (statusCode != null) {
				applyStatusCodeIfPossible(request, response, statusCode);
			}
			
			//add by 
			log.error("====Error Type====: {}", new Object[]{ex.getClass()});

			
			return getModelAndView(viewName, ex, request)
					.addObject("errorType", ex.getClass().getSimpleName())
					.addObject("message", ex.getMessage());
		} else {
			return null;
		}
	}
	
	protected transient Logger log = LoggerFactory.getLogger(this.getClass());
}
