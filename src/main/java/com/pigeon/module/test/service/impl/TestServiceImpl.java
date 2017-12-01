package com.pigeon.module.test.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pigeon.module.test.dao.TestDao;
import com.pigeon.module.test.dto.TestDTO;
import com.pigeon.module.test.model.Test;
import com.pigeon.module.test.service.TestService;


@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDao testDao;

	public TestDTO selectByPrimaryKey(Integer id) {
		Test te = testDao.selectByPrimaryKey(id);
		if(te==null){
			return null;
		}
		TestDTO teDto = new TestDTO();
		BeanUtils.copyProperties(te,teDto);
		return teDto;
	}

}
