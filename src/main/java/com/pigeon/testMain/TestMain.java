package com.pigeon.testMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pigeon.module.test.dto.TestDTO;
import com.pigeon.module.test.service.TestService;

@RestController
@RequestMapping("/test")
public class TestMain {

	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/showTest", method = { RequestMethod.POST })
	public TestDTO showTest(@RequestBody TestDTO request){
		int id = request.getId();
		TestDTO t = testService.selectByPrimaryKey(id);
		return t;
	}

}
