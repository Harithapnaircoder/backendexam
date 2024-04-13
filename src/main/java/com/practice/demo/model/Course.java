package com.practice.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "organizational_unit")
    private String organizationalUnit;

    @Column(name = "training_type")
    private String trainingType;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "batch_count")
    private int batchCount;

    @Column(name = "trainer_name")
    private String trainerName;

    @Column(name = "status")
    private String status;

    @Column(name = "feedback")
    private String feedback;


    public Course() {
    }

    public Course(int courseId, String courseName, String organizationalUnit, String trainingType, String startDate, String endDate, int batchCount, String trainerName, String status, String feedback) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.organizationalUnit = organizationalUnit;
        this.trainingType = trainingType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.batchCount = batchCount;
        this.trainerName = trainerName;
        this.status = status;
        this.feedback = feedback;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int batchCount) {
        this.batchCount = batchCount;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
