package com.whyixiu.erp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.whyixiu.erp.dao.SysUserMapper;
import com.whyixiu.erp.model.SysUser;
import com.whyixiu.erp.service.SysUserService;

@Service(value="sysUserService")
public class SysUserServiceImpl implements SysUserService{
	
	@Resource
	SysUserMapper sysUserMapper;

	@Override
	public SysUser getByName(String name) {
		return sysUserMapper.selectByName(name);
	}

}
