package com.mannghi.learning.service.impl;

import com.mannghi.learning.entity.User;
import com.mannghi.learning.entity.UserRequest;
import com.mannghi.learning.repository.UserRepository;
import com.mannghi.learning.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ManNghi
 * @since 15/11/2024 - 21:41
 */
@Service
public class UserService implements IUserService {

    // inject UserRepository vao UserService để call db
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateJobById(long id, String job) {
         userRepository.updateUserById(id, job);
    }

    @Override
    public void updateNameById(long id, String name) {
        userRepository.updateNameById(id, name);
    }

    @Override
    public void updateUserById(long id, UserRequest req) {
        userRepository.updateUserById(
                id,
                req.getName(),
                req.getJob(),
                req.getEmail())
        ;
    }

}
