package com.vit.ride.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.ride.model.User;
import com.vit.ride.repository.UserRepository;

@Service

public class UserService {
	 @Autowired
	    private UserRepository userRepository;

	    public User registerUser(User user) {
	        return userRepository.save(user);
	    }

	    public void removeUser(String userId) {
	        userRepository.deleteById(userId);
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }
}
