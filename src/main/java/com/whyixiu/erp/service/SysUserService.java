package com.whyixiu.erp.service;

import org.springframework.stereotype.Service;

import com.whyixiu.erp.model.SysUser;

@Service
public interface SysUserService {

	SysUser getByName(String name);
}
