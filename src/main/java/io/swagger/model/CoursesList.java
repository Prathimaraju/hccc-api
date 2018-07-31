package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Course;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema of response payload when a list of course information is requested
 */
@ApiModel(description = "This is the schema of response payload when a list of course information is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class CoursesList   {
  @JsonProperty("courses")
  @Valid
  private List<Course> courses = null;

  public CoursesList courses(List<Course> courses) {
    this.courses = courses;
    return this;
  }

  public CoursesList addCoursesItem(Course coursesItem) {
    if (this.courses == null) {
      this.courses = new ArrayList<Course>();
    }
    this.courses.add(coursesItem);
    return this;
  }

  /**
   * List of Courses
   * @return courses
  **/
  @ApiModelProperty(value = "List of Courses")

  @Valid

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoursesList coursesList = (CoursesList) o;
    return Objects.equals(this.courses, coursesList.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoursesList {\n");
    
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
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

