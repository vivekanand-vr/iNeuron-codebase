package com.getitdone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getitdone.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
