package com.pigeon.module.test.dao;

import com.pigeon.module.test.model.Test;

public interface TestDao {
	
	Test selectByPrimaryKey(Integer id);
}
