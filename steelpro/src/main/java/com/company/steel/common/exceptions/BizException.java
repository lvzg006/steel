package com.company.steel.common.exceptions;

/**
 * @Description 业务异常类
 * @author 
 * @date 
 * @version 1.0
 */
@SuppressWarnings("serial")
public class BizException extends RuntimeException {
	public BizException() {
		super();
	}
	
	public BizException(String message) {
		super(message);
	}

	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(Throwable cause) {
		super(cause);
	}
	
	
}
