package com.mannghi.learning.service;

import com.mannghi.learning.entity.User;
import com.mannghi.learning.entity.UserRequest;

import java.util.List;
import java.util.Optional;

/**
 * @author ManNghi
 * @since 15/11/2024 - 21:41
 */
public interface IUserService {

    /*
    * Lấy danh sách tất cả user
     */
    List<User> getAllUser();

    /*
    * Tạo mới một user
     */
    User createUser(User user);

    /*
    * Delete user by id
     */
    void deleteUserById(long id);

    /*
    * Get user by id
     */
    Optional<User> getUserById(long id);

    /*
    * Update user by id
     */
    void updateJobById(long id, String job);

    /*
    *Update name by id
     */
     void updateNameById(long id, String name);

     /*
     * Update user by id
      */
    void updateUserById(long id, UserRequest req);
}
