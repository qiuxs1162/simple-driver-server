package com.qiuxs.salbum.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qiuxs.salbum.biz.dao.UserDao;
import com.qiuxs.salbum.biz.entity.User;
import com.qiuxs.salbum.frm.persistent.service.AbstractDataService;

@Service
public class UserService extends AbstractDataService<Long, User, UserDao> {

	public UserService() {
		super(Long.class, User.class);
	}

	@Resource
	private UserDao userDao;

	@Override
	protected UserDao getDao() {
		return this.userDao;
	}

}