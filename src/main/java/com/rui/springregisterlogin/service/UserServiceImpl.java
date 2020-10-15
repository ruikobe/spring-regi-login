package com.rui.springregisterlogin.service;

import com.rui.springregisterlogin.model.Role;
import com.rui.springregisterlogin.model.User;
import com.rui.springregisterlogin.repository.UserRepository;
import com.rui.springregisterlogin.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(), registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
