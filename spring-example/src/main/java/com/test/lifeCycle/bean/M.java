package com.test.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Slf4j(topic = "e")
public class M {
	//单例bean非构造方法注入的bean是支持循环依赖的;原型bean也不支持


	@Autowired
	N n;
	public M(){
		log.debug("m create ");
	}

	public void printf(){
		log.debug("printf");
	}
}
