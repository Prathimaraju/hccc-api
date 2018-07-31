package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Enrollment;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema of response payload when a list of indemnity information is requested
 */
@ApiModel(description = "This is the schema of response payload when a list of indemnity information is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class EnrollmentsList   {
  @JsonProperty("enrollments")
  @Valid
  private List<Enrollment> enrollments = null;

  public EnrollmentsList enrollments(List<Enrollment> enrollments) {
    this.enrollments = enrollments;
    return this;
  }

  public EnrollmentsList addEnrollmentsItem(Enrollment enrollmentsItem) {
    if (this.enrollments == null) {
      this.enrollments = new ArrayList<Enrollment>();
    }
    this.enrollments.add(enrollmentsItem);
    return this;
  }

  /**
   * List of Enrollments
   * @return enrollments
  **/
  @ApiModelProperty(value = "List of Enrollments")

  @Valid

  public List<Enrollment> getEnrollments() {
    return enrollments;
  }

  public void setEnrollments(List<Enrollment> enrollments) {
    this.enrollments = enrollments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentsList enrollmentsList = (EnrollmentsList) o;
    return Objects.equals(this.enrollments, enrollmentsList.enrollments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentsList {\n");
    
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
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

