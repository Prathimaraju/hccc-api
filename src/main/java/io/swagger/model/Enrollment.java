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
 * Enrollment Object
 */
@ApiModel(description = "Enrollment Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class Enrollment   {
  @JsonProperty("enrollmentId")
  private String enrollmentId = null;

  @JsonProperty("devoteeId")
  private String devoteeId = null;

  @JsonProperty("familyMemberId")
  private String familyMemberId = null;

  @JsonProperty("ClassId")
  private String classId = null;

  @JsonProperty("isParticipantUnder18")
  private Boolean isParticipantUnder18 = null;

  @JsonProperty("indemnityIds")
  @Valid
  private List<String> indemnityIds = null;

  public Enrollment enrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
    return this;
  }

  /**
   * Unique enrollment id
   * @return enrollmentId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique enrollment id")


  public String getEnrollmentId() {
    return enrollmentId;
  }

  public void setEnrollmentId(String enrollmentId) {
    this.enrollmentId = enrollmentId;
  }

  public Enrollment devoteeId(String devoteeId) {
    this.devoteeId = devoteeId;
    return this;
  }

  /**
   * Identifier of the Devotee
   * @return devoteeId
  **/
  @ApiModelProperty(value = "Identifier of the Devotee")


  public String getDevoteeId() {
    return devoteeId;
  }

  public void setDevoteeId(String devoteeId) {
    this.devoteeId = devoteeId;
  }

  public Enrollment familyMemberId(String familyMemberId) {
    this.familyMemberId = familyMemberId;
    return this;
  }

  /**
   * Identifier of the Family Member
   * @return familyMemberId
  **/
  @ApiModelProperty(value = "Identifier of the Family Member")


  public String getFamilyMemberId() {
    return familyMemberId;
  }

  public void setFamilyMemberId(String familyMemberId) {
    this.familyMemberId = familyMemberId;
  }

  public Enrollment classId(String classId) {
    this.classId = classId;
    return this;
  }

  /**
   * Identifier of the class being enrolled to
   * @return classId
  **/
  @ApiModelProperty(value = "Identifier of the class being enrolled to")


  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public Enrollment isParticipantUnder18(Boolean isParticipantUnder18) {
    this.isParticipantUnder18 = isParticipantUnder18;
    return this;
  }

  /**
   * true if participant age is under 18, else false
   * @return isParticipantUnder18
  **/
  @ApiModelProperty(value = "true if participant age is under 18, else false")


  public Boolean isIsParticipantUnder18() {
    return isParticipantUnder18;
  }

  public void setIsParticipantUnder18(Boolean isParticipantUnder18) {
    this.isParticipantUnder18 = isParticipantUnder18;
  }

  public Enrollment indemnityIds(List<String> indemnityIds) {
    this.indemnityIds = indemnityIds;
    return this;
  }

  public Enrollment addIndemnityIdsItem(String indemnityIdsItem) {
    if (this.indemnityIds == null) {
      this.indemnityIds = new ArrayList<String>();
    }
    this.indemnityIds.add(indemnityIdsItem);
    return this;
  }

  /**
   * List of Indemnity Ids signed in association with this enrollment
   * @return indemnityIds
  **/
  @ApiModelProperty(value = "List of Indemnity Ids signed in association with this enrollment")


  public List<String> getIndemnityIds() {
    return indemnityIds;
  }

  public void setIndemnityIds(List<String> indemnityIds) {
    this.indemnityIds = indemnityIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrollment enrollment = (Enrollment) o;
    return Objects.equals(this.enrollmentId, enrollment.enrollmentId) &&
        Objects.equals(this.devoteeId, enrollment.devoteeId) &&
        Objects.equals(this.familyMemberId, enrollment.familyMemberId) &&
        Objects.equals(this.classId, enrollment.classId) &&
        Objects.equals(this.isParticipantUnder18, enrollment.isParticipantUnder18) &&
        Objects.equals(this.indemnityIds, enrollment.indemnityIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentId, devoteeId, familyMemberId, classId, isParticipantUnder18, indemnityIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrollment {\n");
    
    sb.append("    enrollmentId: ").append(toIndentedString(enrollmentId)).append("\n");
    sb.append("    devoteeId: ").append(toIndentedString(devoteeId)).append("\n");
    sb.append("    familyMemberId: ").append(toIndentedString(familyMemberId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    isParticipantUnder18: ").append(toIndentedString(isParticipantUnder18)).append("\n");
    sb.append("    indemnityIds: ").append(toIndentedString(indemnityIds)).append("\n");
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

