package com.ad.api.gateway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ad.api.gateway.dao.TaskDAO;

public interface TaskRepository extends JpaRepository<TaskDAO, Long>{

}
