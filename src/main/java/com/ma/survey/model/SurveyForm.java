package com.ma.survey.model;

import java.util.List;

/**
 * created by <a href="mailto:18045142590@163.com" > mameng </a>
 */
public class SurveyForm {

    private String name;
    private String course;
    private List<Integer> purpose;
    private Delivery delivery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Integer> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<Integer> purpose) {
        this.purpose = purpose;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "SurveyForm{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", purpose=" + purpose +
                ", delivery=" + delivery +
                '}';
    }
}
