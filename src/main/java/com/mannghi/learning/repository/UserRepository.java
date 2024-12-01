package com.mannghi.learning.repository;

import com.mannghi.learning.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 15/11/2024 - 21:37
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.job = :job WHERE u.id = :id")
    void updateUserById(@Param("id") Long id, @Param("job") String job);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.name = :name WHERE u.id = :id")
    void updateNameById(@Param("id") Long id, @Param("name") String name);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.name = :name, u.job = :job, u.email = :email WHERE u.id = :id")
    void updateUserById(@Param("id") Long id,
                        @Param("name") String name,
                        @Param("job") String job,
                        @Param("email") String email);
}
