package com.pigeon.module.test.service;

import com.pigeon.module.test.dto.TestDTO;

public interface TestService {
	TestDTO selectByPrimaryKey(Integer id);
}
