/*
package com.grasswort.giggle.webflux.configuration.security;

import com.grasswort.giggle.webflux.model.User;
import com.grasswort.giggle.webflux.service.IUserService;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;

*/
/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 *//*

//@Component
public class UserDetailServiceImpl implements ReactiveUserDetailsService {

    private final IUserService userService;

    public UserDetailServiceImpl(IUserService userService) {
        this.userService = userService;
    }

    */
/**
     * Find the {@link UserDetails} by username.
     *
     * @param username the username to look up
     * @return the {@link UserDetails}. Cannot be null
     *//*

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        User user = userService.selectByUsername(username);
        if (user != null) {
            return Mono.just(GiggleUser.giggleUserBuilder()
                    .setUsername(user.getUsername())
                    .setPassword(user.getPassword())
                    .setEnabled(true)
                    .setCredentialsNonExpired(true)
                    .setAccountNonLocked(true)
                    .setAccountNonExpired(true)
                    .setAuthorities(Arrays.asList())
                    .build());
        }
        return Mono.empty();
    }



}
*/
