package com.rui.springregisterlogin.service;

import com.rui.springregisterlogin.model.User;
import com.rui.springregisterlogin.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);
}
