package com.grasswort.giggle.webflux.configuration.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author xuliangliang
 * @Description
 * @Date 2020/11/27
 */
public class GiggleUserBuilder {
    private String username;
    private String password;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean accountNonLocked;
    private Collection<? extends GrantedAuthority> authorities;

    public GiggleUser build() {
        return new GiggleUser(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public GiggleUserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public GiggleUserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public GiggleUserBuilder setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public GiggleUserBuilder setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
        return this;
    }

    public GiggleUserBuilder setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
        return this;
    }

    public GiggleUserBuilder setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
        return this;
    }

    public GiggleUserBuilder setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
        return this;
    }
}
