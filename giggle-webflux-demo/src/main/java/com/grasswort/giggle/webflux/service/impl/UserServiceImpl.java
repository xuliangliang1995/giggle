package com.grasswort.giggle.webflux.service.impl;

import com.grasswort.giggle.webflux.dao.UserRepository;
import com.grasswort.giggle.webflux.model.User;
import com.grasswort.giggle.webflux.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 根据用户名称查询用户
     *
     * @param username
     * @return
     */
    @Override
    public User selectByUsername(String username) {
        return userRepository.selectByUsername(username);
    }
}
