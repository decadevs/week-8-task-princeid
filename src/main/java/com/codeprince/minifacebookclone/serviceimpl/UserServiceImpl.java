package com.codeprince.minifacebookclone.serviceimpl;

import com.codeprince.minifacebookclone.model.User;
import com.codeprince.minifacebookclone.repository.UserRepository;
import com.codeprince.minifacebookclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
