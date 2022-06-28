package com.example.demo.repository;

import com.example.demo.model.ReportPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<ReportPost, Integer> {
}
