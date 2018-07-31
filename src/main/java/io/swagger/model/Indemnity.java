package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indemnity Object
 */
@ApiModel(description = "Indemnity Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class Indemnity   {
  @JsonProperty("indemnityId")
  private String indemnityId = null;

  @JsonProperty("devoteeId")
  private String devoteeId = null;

  @JsonProperty("signedFor")
  private String signedFor = null;

  @JsonProperty("signedBy")
  private String signedBy = null;

  @JsonProperty("signedOn")
  private String signedOn = null;

  @JsonProperty("indemnityFormId")
  private String indemnityFormId = null;

  public Indemnity indemnityId(String indemnityId) {
    this.indemnityId = indemnityId;
    return this;
  }

  /**
   * Unique identifier of the Indemnity.
   * @return indemnityId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique identifier of the Indemnity.")


  public String getIndemnityId() {
    return indemnityId;
  }

  public void setIndemnityId(String indemnityId) {
    this.indemnityId = indemnityId;
  }

  public Indemnity devoteeId(String devoteeId) {
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

  public Indemnity signedFor(String signedFor) {
    this.signedFor = signedFor;
    return this;
  }

  /**
   * Identifier of the Family Member or the devotee Id depending on who the indemnity is signed for
   * @return signedFor
  **/
  @ApiModelProperty(value = "Identifier of the Family Member or the devotee Id depending on who the indemnity is signed for")


  public String getSignedFor() {
    return signedFor;
  }

  public void setSignedFor(String signedFor) {
    this.signedFor = signedFor;
  }

  public Indemnity signedBy(String signedBy) {
    this.signedBy = signedBy;
    return this;
  }

  /**
   * Identifier of the Family Member or the devotee Id depending on who the indemnity is signed by
   * @return signedBy
  **/
  @ApiModelProperty(value = "Identifier of the Family Member or the devotee Id depending on who the indemnity is signed by")


  public String getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }

  public Indemnity signedOn(String signedOn) {
    this.signedOn = signedOn;
    return this;
  }

  /**
   * Datetime when the indemnity was signed in ISO 8612 format. For e.g. 2018-07-10T07:51:25+00:00
   * @return signedOn
  **/
  @ApiModelProperty(value = "Datetime when the indemnity was signed in ISO 8612 format. For e.g. 2018-07-10T07:51:25+00:00")


  public String getSignedOn() {
    return signedOn;
  }

  public void setSignedOn(String signedOn) {
    this.signedOn = signedOn;
  }

  public Indemnity indemnityFormId(String indemnityFormId) {
    this.indemnityFormId = indemnityFormId;
    return this;
  }

  /**
   * Identifier of the Indemnity Form being signed.
   * @return indemnityFormId
  **/
  @ApiModelProperty(value = "Identifier of the Indemnity Form being signed.")


  public String getIndemnityFormId() {
    return indemnityFormId;
  }

  public void setIndemnityFormId(String indemnityFormId) {
    this.indemnityFormId = indemnityFormId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Indemnity indemnity = (Indemnity) o;
    return Objects.equals(this.indemnityId, indemnity.indemnityId) &&
        Objects.equals(this.devoteeId, indemnity.devoteeId) &&
        Objects.equals(this.signedFor, indemnity.signedFor) &&
        Objects.equals(this.signedBy, indemnity.signedBy) &&
        Objects.equals(this.signedOn, indemnity.signedOn) &&
        Objects.equals(this.indemnityFormId, indemnity.indemnityFormId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indemnityId, devoteeId, signedFor, signedBy, signedOn, indemnityFormId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indemnity {\n");
    
    sb.append("    indemnityId: ").append(toIndentedString(indemnityId)).append("\n");
    sb.append("    devoteeId: ").append(toIndentedString(devoteeId)).append("\n");
    sb.append("    signedFor: ").append(toIndentedString(signedFor)).append("\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
    sb.append("    signedOn: ").append(toIndentedString(signedOn)).append("\n");
    sb.append("    indemnityFormId: ").append(toIndentedString(indemnityFormId)).append("\n");
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

