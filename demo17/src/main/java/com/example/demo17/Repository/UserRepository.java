package com.example.demo17.Repository;

import java.util.List;

import com.example.demo17.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email);

    @Query("SELECT u FROM User u WHERE u.role = :role")
    List<User> findByRole(@Param("role") String role);

    @Query("SELECT u FROM User u WHERE u.age >= :age")
    List<User> findByAgeGreaterThanEqual(@Param("age") Integer age);
}