package com.xiaonei.service.inter;

import com.xiaonei.base.service.BaseServiceInter;
import com.xiaonei.domain.Users;

public interface UserServiceInter extends BaseServiceInter {
	
	//��֤�û��Ƿ�Ϸ�������һ��Users���󣬷��򷵻�һ��null
	public Users check(Users user);
	
}
