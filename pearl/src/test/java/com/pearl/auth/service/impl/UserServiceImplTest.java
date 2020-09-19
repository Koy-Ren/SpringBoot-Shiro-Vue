package com.pearl.auth.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.pearl.auth.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * <b>System：</b> AR Management Platform<br/>
 * <b>Title：</b> SpringBoot-Shiro-Vue<br/>
 * <b>Description：</b> 功能描述<br/>
 * <b>@author：</b> renkeyu<br/>
 * <b>@date：</b> 2020年09月19日 11:05<br/>
 * <b>@version：</b> 1.0.0.0<br/>
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserDao userDao;

    @Test
    public void addUser() {
        Mockito.when(userDao.queryExistUsername(Mockito.any())).thenReturn(0);
        JSONObject result = userService.addUser(new JSONObject());
        System.out.println(result);
    }
}