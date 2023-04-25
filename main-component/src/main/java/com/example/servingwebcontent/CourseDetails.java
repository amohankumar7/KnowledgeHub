package com.example.servingwebcontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseDetails {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public Integer course_id;
public String cover_image_url;
public String path;
public String learning_objectives;
public String other_details;
public Integer num_reviews;
//public boolean published;

public Integer getCourseId() {
return course_id;
}

public void setCourseId(Integer course_id) {
this.course_id = course_id;
}

public String getCoverImageUrl() {
return cover_image_url;
}

public void setCoverImageUrl(String cover_image_url) {
this.cover_image_url = cover_image_url;
}

public String getPath() {
return path;
}

public void setPath(String path) {
this.path = path;
}

public String getLearningObjectives() {
return learning_objectives;
}

public void setLearningObjectives(String learning_objectives) {
this.learning_objectives = learning_objectives;
}

public String getOtherDetails() {
return other_details;
}

public void setOtherDetails(String other_details) {
this.other_details = other_details;
}

public Integer getNumReviews() {
return num_reviews;
}

public void setNumReviews(Integer num_reviews) {
this.num_reviews = num_reviews;
}
}
