package com.example.demo.domain;

import javax.annotation.ManagedBean;

@ManagedBean
public class DemoDTO {

	private String name;
	private String value;
	
	public DemoDTO() {
		setName("test name");
		setValue("test value");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	
}
