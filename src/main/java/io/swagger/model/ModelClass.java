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

public class ModelClass   {
  @JsonProperty("classId")
  private String classId = null;

  @JsonProperty("courseId")
  private String courseId = null;

  @JsonProperty("courseStartTime")
  private String courseStartTime = null;

  @JsonProperty("courseEndTime")
  private String courseEndTime = null;

  @JsonProperty("courseStartDate")
  private String courseStartDate = null;

  @JsonProperty("courseEndDate")
  private String courseEndDate = null;

  @JsonProperty("courseDays")
  private String courseDays = null;

  @JsonProperty("courseVenue")
  private String courseVenue = null;

  @JsonProperty("flyerURL")
  private String flyerURL = null;

  @JsonProperty("slots")
  private Integer slots = null;

  @JsonProperty("teachers")
  @Valid
  private List<String> teachers = null;

  public ModelClass classId(String classId) {
    this.classId = classId;
    return this;
  }

  /**
   * Unique class id
   * @return classId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique class id")


  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public ModelClass courseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Unique course id
   * @return courseId
  **/
  @ApiModelProperty(value = "Unique course id")


  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }

  public ModelClass courseStartTime(String courseStartTime) {
    this.courseStartTime = courseStartTime;
    return this;
  }

  /**
   * Course start time represented as a string in pacific time in the format hh:mm
   * @return courseStartTime
  **/
  @ApiModelProperty(value = "Course start time represented as a string in pacific time in the format hh:mm")


  public String getCourseStartTime() {
    return courseStartTime;
  }

  public void setCourseStartTime(String courseStartTime) {
    this.courseStartTime = courseStartTime;
  }

  public ModelClass courseEndTime(String courseEndTime) {
    this.courseEndTime = courseEndTime;
    return this;
  }

  /**
   * Course end time represented as a string in pacific time in the format hh:mm
   * @return courseEndTime
  **/
  @ApiModelProperty(value = "Course end time represented as a string in pacific time in the format hh:mm")


  public String getCourseEndTime() {
    return courseEndTime;
  }

  public void setCourseEndTime(String courseEndTime) {
    this.courseEndTime = courseEndTime;
  }

  public ModelClass courseStartDate(String courseStartDate) {
    this.courseStartDate = courseStartDate;
    return this;
  }

  /**
   * Course start date represented as a string in pacific time in the format yyyy-mm-dd
   * @return courseStartDate
  **/
  @ApiModelProperty(value = "Course start date represented as a string in pacific time in the format yyyy-mm-dd")


  public String getCourseStartDate() {
    return courseStartDate;
  }

  public void setCourseStartDate(String courseStartDate) {
    this.courseStartDate = courseStartDate;
  }

  public ModelClass courseEndDate(String courseEndDate) {
    this.courseEndDate = courseEndDate;
    return this;
  }

  /**
   * Course end date represented as a string in pacific time in the format yyyy-mm-dd
   * @return courseEndDate
  **/
  @ApiModelProperty(value = "Course end date represented as a string in pacific time in the format yyyy-mm-dd")


  public String getCourseEndDate() {
    return courseEndDate;
  }

  public void setCourseEndDate(String courseEndDate) {
    this.courseEndDate = courseEndDate;
  }

  public ModelClass courseDays(String courseDays) {
    this.courseDays = courseDays;
    return this;
  }

  /**
   * Course days or String describing the frequency/recurrence of the course
   * @return courseDays
  **/
  @ApiModelProperty(value = "Course days or String describing the frequency/recurrence of the course")


  public String getCourseDays() {
    return courseDays;
  }

  public void setCourseDays(String courseDays) {
    this.courseDays = courseDays;
  }

  public ModelClass courseVenue(String courseVenue) {
    this.courseVenue = courseVenue;
    return this;
  }

  /**
   * Facility where the course will be taught
   * @return courseVenue
  **/
  @ApiModelProperty(value = "Facility where the course will be taught")


  public String getCourseVenue() {
    return courseVenue;
  }

  public void setCourseVenue(String courseVenue) {
    this.courseVenue = courseVenue;
  }

  public ModelClass flyerURL(String flyerURL) {
    this.flyerURL = flyerURL;
    return this;
  }

  /**
   * URL of the course's flyer
   * @return flyerURL
  **/
  @ApiModelProperty(value = "URL of the course's flyer")


  public String getFlyerURL() {
    return flyerURL;
  }

  public void setFlyerURL(String flyerURL) {
    this.flyerURL = flyerURL;
  }

  public ModelClass slots(Integer slots) {
    this.slots = slots;
    return this;
  }

  /**
   * Class size or total number of slots in the course
   * @return slots
  **/
  @ApiModelProperty(value = "Class size or total number of slots in the course")


  public Integer getSlots() {
    return slots;
  }

  public void setSlots(Integer slots) {
    this.slots = slots;
  }

  public ModelClass teachers(List<String> teachers) {
    this.teachers = teachers;
    return this;
  }

  public ModelClass addTeachersItem(String teachersItem) {
    if (this.teachers == null) {
      this.teachers = new ArrayList<String>();
    }
    this.teachers.add(teachersItem);
    return this;
  }

  /**
   * List of teacher (or coordinator) ids of the course
   * @return teachers
  **/
  @ApiModelProperty(value = "List of teacher (or coordinator) ids of the course")


  public List<String> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<String> teachers) {
    this.teachers = teachers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelClass propertyClass = (ModelClass) o;
    return Objects.equals(this.classId, propertyClass.classId) &&
        Objects.equals(this.courseId, propertyClass.courseId) &&
        Objects.equals(this.courseStartTime, propertyClass.courseStartTime) &&
        Objects.equals(this.courseEndTime, propertyClass.courseEndTime) &&
        Objects.equals(this.courseStartDate, propertyClass.courseStartDate) &&
        Objects.equals(this.courseEndDate, propertyClass.courseEndDate) &&
        Objects.equals(this.courseDays, propertyClass.courseDays) &&
        Objects.equals(this.courseVenue, propertyClass.courseVenue) &&
        Objects.equals(this.flyerURL, propertyClass.flyerURL) &&
        Objects.equals(this.slots, propertyClass.slots) &&
        Objects.equals(this.teachers, propertyClass.teachers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, courseId, courseStartTime, courseEndTime, courseStartDate, courseEndDate, courseDays, courseVenue, flyerURL, slots, teachers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelClass {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
    sb.append("    courseStartTime: ").append(toIndentedString(courseStartTime)).append("\n");
    sb.append("    courseEndTime: ").append(toIndentedString(courseEndTime)).append("\n");
    sb.append("    courseStartDate: ").append(toIndentedString(courseStartDate)).append("\n");
    sb.append("    courseEndDate: ").append(toIndentedString(courseEndDate)).append("\n");
    sb.append("    courseDays: ").append(toIndentedString(courseDays)).append("\n");
    sb.append("    courseVenue: ").append(toIndentedString(courseVenue)).append("\n");
    sb.append("    flyerURL: ").append(toIndentedString(flyerURL)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
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

