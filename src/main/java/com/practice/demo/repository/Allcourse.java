package com.practice.demo.repository;

import com.practice.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Allcourse extends JpaRepository<Course, Long> {


}
