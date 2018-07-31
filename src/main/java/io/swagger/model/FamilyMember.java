package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Name;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Devotee Object
 */
@ApiModel(description = "Devotee Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class FamilyMember   {
  @JsonProperty("familyMemberId")
  private String familyMemberId = null;

  @JsonProperty("familyMemberName")
  private Name familyMemberName = null;

  public FamilyMember familyMemberId(String familyMemberId) {
    this.familyMemberId = familyMemberId;
    return this;
  }

  /**
   * Unique Identifier of the family member
   * @return familyMemberId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique Identifier of the family member")


  public String getFamilyMemberId() {
    return familyMemberId;
  }

  public void setFamilyMemberId(String familyMemberId) {
    this.familyMemberId = familyMemberId;
  }

  public FamilyMember familyMemberName(Name familyMemberName) {
    this.familyMemberName = familyMemberName;
    return this;
  }

  /**
   * Get familyMemberName
   * @return familyMemberName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Name getFamilyMemberName() {
    return familyMemberName;
  }

  public void setFamilyMemberName(Name familyMemberName) {
    this.familyMemberName = familyMemberName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FamilyMember familyMember = (FamilyMember) o;
    return Objects.equals(this.familyMemberId, familyMember.familyMemberId) &&
        Objects.equals(this.familyMemberName, familyMember.familyMemberName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyMemberId, familyMemberName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FamilyMember {\n");
    
    sb.append("    familyMemberId: ").append(toIndentedString(familyMemberId)).append("\n");
    sb.append("    familyMemberName: ").append(toIndentedString(familyMemberName)).append("\n");
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

