package com.grasswort.giggle.webflux.configuration.security;

import com.grasswort.giggle.webflux.model.User;
import com.grasswort.giggle.webflux.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import reactor.core.publisher.Mono;

import java.util.Arrays;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
@Configuration
@EnableWebFluxSecurity
public class UserDetailServiceImpl implements ReactiveUserDetailsService {

    private final static PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Autowired
    private IUserService userService;


    /**
     * Find the {@link UserDetails} by username.
     *
     * @param username the username to look up
     * @return the {@link UserDetails}. Cannot be null
     */
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

    @Bean
    public PasswordEncoder passwordEncoder() {
        return passwordEncoder;
    }

}
