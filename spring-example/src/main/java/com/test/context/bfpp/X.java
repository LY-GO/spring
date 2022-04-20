package com.test.context.bfpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
public class X {
	public X(){
		log.debug("x bd create normal");
	}

	/**
	 * 会产生不合格的bean,使用@Component是可以完整扫描到的;使用BeanFactoryPostProcessor会得到不完整的bean所以不推荐BeanFactoryPostProcessor去动态注册bean;BeanDefinitionRegistryPostProcessor是可以支持的
	 * @return
	 */
	@Bean
	public Y y(){
		log.debug("x @bean create Y");
		return new Y();
	}
}
