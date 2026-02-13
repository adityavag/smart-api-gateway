package com.ad.api.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ad.api.gateway.dao.UserDAO;

public interface UserRepository extends JpaRepository<UserDAO, Long> {

}
