package com.grasswort.giggle.webflux.dao;

import com.grasswort.giggle.webflux.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@Repository
public class UserRepository {

    private final static List<User> users = new LinkedList<>();

   /* private final PasswordEncoder passwordEncoder;

    public UserRepository(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }*/

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    public User selectByUsername(String username) {
        return users.stream()
                .filter(u -> Objects.equals(u.getUsername(), username))
                .findFirst().orElse(null);
    }

    /*@PostConstruct
    public void initUserPool() {
        users.add(new User(1L,"jerry", passwordEncoder.encode("giggle")));
        users.add(new User(2L,"tom", passwordEncoder.encode("giggle")));
    }*/

}
