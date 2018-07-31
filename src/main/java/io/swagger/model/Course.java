package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Course Object
 */
@ApiModel(description = "Course Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class Course   {
  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("courseName")
  private String courseName = null;

  @JsonProperty("ageRestrictions")
  private String ageRestrictions = null;

  @JsonProperty("courseImageURL")
  private String courseImageURL = null;

  @JsonProperty("courseRemarks")
  private String courseRemarks = null;

  @JsonProperty("courseTags")
  @Valid
  private List<String> courseTags = null;

  public Course courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Unique course id
   * @return courseId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique course id")


  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public Course courseName(String courseName) {
    this.courseName = courseName;
    return this;
  }

  /**
   * Unique course id
   * @return courseName
  **/
  @ApiModelProperty(value = "Unique course id")


  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Course ageRestrictions(String ageRestrictions) {
    this.ageRestrictions = ageRestrictions;
    return this;
  }

  /**
   * A String describing any age restrictions
   * @return ageRestrictions
  **/
  @ApiModelProperty(value = "A String describing any age restrictions")


  public String getAgeRestrictions() {
    return ageRestrictions;
  }

  public void setAgeRestrictions(String ageRestrictions) {
    this.ageRestrictions = ageRestrictions;
  }

  public Course courseImageURL(String courseImageURL) {
    this.courseImageURL = courseImageURL;
    return this;
  }

  /**
   * URL of the course's image
   * @return courseImageURL
  **/
  @ApiModelProperty(value = "URL of the course's image")


  public String getCourseImageURL() {
    return courseImageURL;
  }

  public void setCourseImageURL(String courseImageURL) {
    this.courseImageURL = courseImageURL;
  }

  public Course courseRemarks(String courseRemarks) {
    this.courseRemarks = courseRemarks;
    return this;
  }

  /**
   * Any additional notes or remarks about the course
   * @return courseRemarks
  **/
  @ApiModelProperty(value = "Any additional notes or remarks about the course")


  public String getCourseRemarks() {
    return courseRemarks;
  }

  public void setCourseRemarks(String courseRemarks) {
    this.courseRemarks = courseRemarks;
  }

  public Course courseTags(List<String> courseTags) {
    this.courseTags = courseTags;
    return this;
  }

  public Course addCourseTagsItem(String courseTagsItem) {
    if (this.courseTags == null) {
      this.courseTags = new ArrayList<String>();
    }
    this.courseTags.add(courseTagsItem);
    return this;
  }

  /**
   * List of tags associated with the course
   * @return courseTags
  **/
  @ApiModelProperty(value = "List of tags associated with the course")


  public List<String> getCourseTags() {
    return courseTags;
  }

  public void setCourseTags(List<String> courseTags) {
    this.courseTags = courseTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.courseId, course.courseId) &&
        Objects.equals(this.courseName, course.courseName) &&
        Objects.equals(this.ageRestrictions, course.ageRestrictions) &&
        Objects.equals(this.courseImageURL, course.courseImageURL) &&
        Objects.equals(this.courseRemarks, course.courseRemarks) &&
        Objects.equals(this.courseTags, course.courseTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, courseName, ageRestrictions, courseImageURL, courseRemarks, courseTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    ageRestrictions: ").append(toIndentedString(ageRestrictions)).append("\n");
    sb.append("    courseImageURL: ").append(toIndentedString(courseImageURL)).append("\n");
    sb.append("    courseRemarks: ").append(toIndentedString(courseRemarks)).append("\n");
    sb.append("    courseTags: ").append(toIndentedString(courseTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

