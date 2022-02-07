package com.vamk.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vamk.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
