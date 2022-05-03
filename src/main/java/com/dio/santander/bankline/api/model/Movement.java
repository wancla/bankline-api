package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movement {
	private Integer id;
	private LocalDateTime datetime;
	private String desc;
	private Double value;
	private MovementType type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public MovementType getType() {
		return type;
	}
	public void setType(MovementType type) {
		this.type = type;
	}
	
	
}
