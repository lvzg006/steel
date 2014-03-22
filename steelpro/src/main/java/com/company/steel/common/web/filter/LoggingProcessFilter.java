package com.company.steel.common.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.filter.OncePerRequestFilter;

import com.company.steel.common.comm.Constants;
import com.company.steel.common.support.SessionUtil;


/**
 * @Description 日志处理过滤器
 * @author caobin
 * @date 2012-11-15
 * @version 1.0
 */
public class LoggingProcessFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//ShiroUser user = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		String userName = ANONYM;
		//若无法确认用户身份(未登录用户)，则加入匿名标志
		StringBuilder sb = new StringBuilder();
		/*if (user == null) {
			log.trace("cannot get user authentication.");
			sb.append(ANONYM);
		} else {
			log.trace("current user principal: {}", new Object[]{user.getUserName()});
			sb.append(user.getUserName());
		}*/
		log.trace("trace No.: {}", new Object[]{sb.toString()});
		MDC.put(TRACE_NO, sb.toString());

		//扩展日志追踪号
		MDC.put(Constants.SESSION_ID, SessionUtil.getSessionId());
		try {
			filterChain.doFilter(request, response);
		} finally {
			MDC.clear();
		}

	}
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 匿名用户(未登录)
	 */
	private static final String ANONYM = "anonym";
	
	private static final String PATTERN = "yyyyMMddHHmmSS";
	
	/**
	 * 日志追踪号
	 */
	private static final String TRACE_NO = "traceNo";
}
