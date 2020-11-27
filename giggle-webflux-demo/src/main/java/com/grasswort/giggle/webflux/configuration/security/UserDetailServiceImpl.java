package com.grasswort.giggle.webflux.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class UserDetailServiceImpl implements ReactiveUserDetailsService {

    private final String password = "giggle";

    private final static PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    /**
     * Find the {@link UserDetails} by username.
     *
     * @param username the username to look up
     * @return the {@link UserDetails}. Cannot be null
     */
    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return Mono.just(GiggleUser.giggleUserBuilder()
                .setUsername(username)
                .setPassword(passwordEncoder.encode(password))
                .setEnabled(true)
                .setCredentialsNonExpired(true)
                .setAccountNonLocked(true)
                .setAccountNonExpired(true)
                .setAuthorities(Arrays.asList())
                .build());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return passwordEncoder;
    }

}
