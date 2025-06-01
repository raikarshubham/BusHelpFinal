package com.project.dbms_mini_project_backend.repository;

import com.project.dbms_mini_project_backend.entity.BusPass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusPassRepository extends JpaRepository<BusPass, Long> {

    BusPass findByUserId(Long userId);

}
