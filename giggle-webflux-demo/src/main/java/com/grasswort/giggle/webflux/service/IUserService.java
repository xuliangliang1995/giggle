package com.grasswort.giggle.webflux.service;


import com.grasswort.giggle.webflux.model.User;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
public interface IUserService {
    /**
     * 根据用户名称查询用户
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
