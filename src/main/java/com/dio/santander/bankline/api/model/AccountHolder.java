package com.dio.santander.bankline.api.model;

public class AccountHolder {
	private Integer id;
	private Integer cpf;
	private String name;
	
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
