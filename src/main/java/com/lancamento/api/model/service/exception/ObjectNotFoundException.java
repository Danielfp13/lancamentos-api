package com.lancamento.api.model.service.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
