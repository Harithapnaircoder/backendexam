package com.practice.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="feedback_table")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Long feedbackId;
    @Column(name = "courseId")
    private int courseId;
    @Column(name = "feedbackText")
    private String feedbackText;


    // Constructors
    public Feedback() {
    }

    public Feedback(Long feedbackId, int courseId, String feedbackText) {
        this.feedbackId = feedbackId;
        this.courseId = courseId;
        this.feedbackText = feedbackText;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
}