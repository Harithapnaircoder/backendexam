package com.practice.demo.repository;


import com.practice.demo.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {



}
