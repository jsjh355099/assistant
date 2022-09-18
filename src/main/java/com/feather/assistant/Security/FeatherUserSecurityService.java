package com.feather.assistant.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class FeatherUserSecurityService implements UserDetailsService {
    @Autowired
    private AppUserService appUserService;
}
