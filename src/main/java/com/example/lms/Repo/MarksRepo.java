package com.example.lms.Repo;

import com.example.lms.Entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MarksRepo extends JpaRepository<Marks,Long> {
}
