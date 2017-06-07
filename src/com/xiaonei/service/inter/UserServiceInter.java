package com.xiaonei.service.inter;

import com.xiaonei.base.service.BaseServiceInter;
import com.xiaonei.domain.Users;

public interface UserServiceInter extends BaseServiceInter {
	
	//验证用户是否合法，返回一个Users对象，否则返回一个null
	public Users check(Users user);
	
}
