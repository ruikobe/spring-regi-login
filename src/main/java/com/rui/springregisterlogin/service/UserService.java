package com.rui.springregisterlogin.service;

import com.rui.springregisterlogin.model.User;
import com.rui.springregisterlogin.controller.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
