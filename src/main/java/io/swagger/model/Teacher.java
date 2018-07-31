package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Devotee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Teacher Object
 */
@ApiModel(description = "Teacher Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class Teacher   {
  @JsonProperty("account")
  private Devotee account = null;

  @JsonProperty("salutation")
  private String salutation = null;

  @JsonProperty("profilePictureURL")
  private String profilePictureURL = null;

  @JsonProperty("skillSet")
  @Valid
  private List<String> skillSet = null;

  @JsonProperty("indemnitySigned")
  private Boolean indemnitySigned = null;

  @JsonProperty("backgroundVerified")
  private Boolean backgroundVerified = null;

  @JsonProperty("identityVerified")
  private Boolean identityVerified = null;

  public Teacher account(Devotee account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Devotee getAccount() {
    return account;
  }

  public void setAccount(Devotee account) {
    this.account = account;
  }

  public Teacher salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * Salutation or title. For e.g. Mrs, Dr, Shri, Pandit, etc.
   * @return salutation
  **/
  @ApiModelProperty(value = "Salutation or title. For e.g. Mrs, Dr, Shri, Pandit, etc.")


  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public Teacher profilePictureURL(String profilePictureURL) {
    this.profilePictureURL = profilePictureURL;
    return this;
  }

  /**
   * URL of the teachers profile picture
   * @return profilePictureURL
  **/
  @ApiModelProperty(value = "URL of the teachers profile picture")


  public String getProfilePictureURL() {
    return profilePictureURL;
  }

  public void setProfilePictureURL(String profilePictureURL) {
    this.profilePictureURL = profilePictureURL;
  }

  public Teacher skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public Teacher addSkillSetItem(String skillSetItem) {
    if (this.skillSet == null) {
      this.skillSet = new ArrayList<String>();
    }
    this.skillSet.add(skillSetItem);
    return this;
  }

  /**
   * Teacher's skill set
   * @return skillSet
  **/
  @ApiModelProperty(value = "Teacher's skill set")


  public List<String> getSkillSet() {
    return skillSet;
  }

  public void setSkillSet(List<String> skillSet) {
    this.skillSet = skillSet;
  }

  public Teacher indemnitySigned(Boolean indemnitySigned) {
    this.indemnitySigned = indemnitySigned;
    return this;
  }

  /**
   * Boolean indicating if the teacher has signed an indemnity
   * @return indemnitySigned
  **/
  @ApiModelProperty(value = "Boolean indicating if the teacher has signed an indemnity")


  public Boolean isIndemnitySigned() {
    return indemnitySigned;
  }

  public void setIndemnitySigned(Boolean indemnitySigned) {
    this.indemnitySigned = indemnitySigned;
  }

  public Teacher backgroundVerified(Boolean backgroundVerified) {
    this.backgroundVerified = backgroundVerified;
    return this;
  }

  /**
   * Boolean indicating if the teacher's background check has been complete
   * @return backgroundVerified
  **/
  @ApiModelProperty(value = "Boolean indicating if the teacher's background check has been complete")


  public Boolean isBackgroundVerified() {
    return backgroundVerified;
  }

  public void setBackgroundVerified(Boolean backgroundVerified) {
    this.backgroundVerified = backgroundVerified;
  }

  public Teacher identityVerified(Boolean identityVerified) {
    this.identityVerified = identityVerified;
    return this;
  }

  /**
   * Boolean indicating if the teacher's identity verified
   * @return identityVerified
  **/
  @ApiModelProperty(value = "Boolean indicating if the teacher's identity verified")


  public Boolean isIdentityVerified() {
    return identityVerified;
  }

  public void setIdentityVerified(Boolean identityVerified) {
    this.identityVerified = identityVerified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teacher teacher = (Teacher) o;
    return Objects.equals(this.account, teacher.account) &&
        Objects.equals(this.salutation, teacher.salutation) &&
        Objects.equals(this.profilePictureURL, teacher.profilePictureURL) &&
        Objects.equals(this.skillSet, teacher.skillSet) &&
        Objects.equals(this.indemnitySigned, teacher.indemnitySigned) &&
        Objects.equals(this.backgroundVerified, teacher.backgroundVerified) &&
        Objects.equals(this.identityVerified, teacher.identityVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, salutation, profilePictureURL, skillSet, indemnitySigned, backgroundVerified, identityVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teacher {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    profilePictureURL: ").append(toIndentedString(profilePictureURL)).append("\n");
    sb.append("    skillSet: ").append(toIndentedString(skillSet)).append("\n");
    sb.append("    indemnitySigned: ").append(toIndentedString(indemnitySigned)).append("\n");
    sb.append("    backgroundVerified: ").append(toIndentedString(backgroundVerified)).append("\n");
    sb.append("    identityVerified: ").append(toIndentedString(identityVerified)).append("\n");
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

