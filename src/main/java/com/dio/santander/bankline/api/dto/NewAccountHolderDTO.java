package com.dio.santander.bankline.api.dto;

public class NewAccountHolderDTO {
	private String name;
	private Integer cpf;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
}
