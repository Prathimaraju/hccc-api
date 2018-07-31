package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Teacher;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema of response payload when a list of teacher information is requested
 */
@ApiModel(description = "This is the schema of response payload when a list of teacher information is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class TeachersList   {
  @JsonProperty("teachers")
  @Valid
  private List<Teacher> teachers = null;

  public TeachersList teachers(List<Teacher> teachers) {
    this.teachers = teachers;
    return this;
  }

  public TeachersList addTeachersItem(Teacher teachersItem) {
    if (this.teachers == null) {
      this.teachers = new ArrayList<Teacher>();
    }
    this.teachers.add(teachersItem);
    return this;
  }

  /**
   * List of Teachers
   * @return teachers
  **/
  @ApiModelProperty(value = "List of Teachers")

  @Valid

  public List<Teacher> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<Teacher> teachers) {
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
    TeachersList teachersList = (TeachersList) o;
    return Objects.equals(this.teachers, teachersList.teachers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teachers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeachersList {\n");
    
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

