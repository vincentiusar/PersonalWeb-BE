package com.web.personalweb.service.impl;

import com.web.personalweb.entity.User;
import com.web.personalweb.repository.UserRepository;
import com.web.personalweb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id);
    }
}
