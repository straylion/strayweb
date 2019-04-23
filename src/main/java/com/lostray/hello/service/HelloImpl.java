package com.lostray.hello.service;

import java.util.Date;

import com.lostray.hello.service.impl.IHello;

public class HelloImpl implements IHello {

	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String sayHello() {
		return "当前时间:" + new Date() + "\n" + msg;
	}

}
