package com.pigeon.module.test.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pigeon.module.test.dao.TestDao;
import com.pigeon.module.test.model.Test;
import com.pigeon.module.test.mapper.TestMapper;

@Component
public class TestDaoImpl implements TestDao {
	
	@Autowired
	private TestMapper testMapper;

	public Test selectByPrimaryKey(Integer id) {
		Test te = testMapper.selectByPrimaryKey(id);
		return te;
	}

}
