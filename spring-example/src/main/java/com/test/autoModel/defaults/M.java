package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class M{

public M(){
	log.debug("default constructor m");
}

public  M(N n){
	log.debug("constructor N:{}",n);
}
public void setN(N n) {
	log.debug("setter N:{}",n);
	//this.n = n;
}



//	@Autowired
//	@Resource
	private N n;




//	setX(X x){
//		xdskfs;kfl;
//	}


//	public N getN() {
//		return n;
//	}
}
