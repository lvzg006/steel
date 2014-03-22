package com.company.steel.common.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Description Spring上下文工具
 * @author 
 * @date 
 * @version 1.0
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext context;

	

	public static ApplicationContext getContext() {
		return context;
	}

	public static Object getBean(String id) {
		return context.getBean(id);
	}

	public static <T> T getBean(Class<T> c) {
		return context.getBean(c);
	}

	public void setApplicationContext(ApplicationContext applicationcontext)
			throws BeansException {
		
		context = applicationcontext;
	}
}
