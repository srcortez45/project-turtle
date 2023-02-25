package com.project.turtle.core.users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>  {
    
    @Query("SELECT 1 FROM UserModel u WHERE u.email=:email AND u.rawPass=:pass")
    Optional<Integer> findByEmail(String email, String pass);
}
