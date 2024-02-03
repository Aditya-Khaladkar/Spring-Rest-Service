package com.example.springrestservice.repository.intern_repository;

import com.example.springrestservice.intern.InternTaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternTaskRepository extends JpaRepository<InternTaskModel, Long> {
}
