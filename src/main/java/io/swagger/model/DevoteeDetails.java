package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FamilyMember;
import io.swagger.model.Name;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Devotee Account Object
 */
@ApiModel(description = "Devotee Account Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class DevoteeDetails   {
  @JsonProperty("devoteeId")
  private String devoteeId = null;

  @JsonProperty("name")
  private Name name = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("familyMembers")
  @Valid
  private List<FamilyMember> familyMembers = null;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public DevoteeDetails devoteeId(String devoteeId) {
    this.devoteeId = devoteeId;
    return this;
  }

  /**
   * Unique userName of the devotee
   * @return devoteeId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique userName of the devotee")


  public String getDevoteeId() {
    return devoteeId;
  }

  public void setDevoteeId(String devoteeId) {
    this.devoteeId = devoteeId;
  }

  public DevoteeDetails name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public DevoteeDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number associated with the devotee's account
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the devotee's account")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public DevoteeDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email Id associated with the devotee's account
   * @return email
  **/
  @ApiModelProperty(value = "Email Id associated with the devotee's account")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DevoteeDetails familyMembers(List<FamilyMember> familyMembers) {
    this.familyMembers = familyMembers;
    return this;
  }

  public DevoteeDetails addFamilyMembersItem(FamilyMember familyMembersItem) {
    if (this.familyMembers == null) {
      this.familyMembers = new ArrayList<FamilyMember>();
    }
    this.familyMembers.add(familyMembersItem);
    return this;
  }

  /**
   * List of family Members
   * @return familyMembers
  **/
  @ApiModelProperty(value = "List of family Members")

  @Valid

  public List<FamilyMember> getFamilyMembers() {
    return familyMembers;
  }

  public void setFamilyMembers(List<FamilyMember> familyMembers) {
    this.familyMembers = familyMembers;
  }

  public DevoteeDetails roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public DevoteeDetails addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * List of roles
   * @return roles
  **/
  @ApiModelProperty(value = "List of roles")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevoteeDetails devoteeDetails = (DevoteeDetails) o;
    return Objects.equals(this.devoteeId, devoteeDetails.devoteeId) &&
        Objects.equals(this.name, devoteeDetails.name) &&
        Objects.equals(this.phoneNumber, devoteeDetails.phoneNumber) &&
        Objects.equals(this.email, devoteeDetails.email) &&
        Objects.equals(this.familyMembers, devoteeDetails.familyMembers) &&
        Objects.equals(this.roles, devoteeDetails.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devoteeId, name, phoneNumber, email, familyMembers, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevoteeDetails {\n");
    
    sb.append("    devoteeId: ").append(toIndentedString(devoteeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    familyMembers: ").append(toIndentedString(familyMembers)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

