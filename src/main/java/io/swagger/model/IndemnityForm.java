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
 * Indemnity Form Object
 */
@ApiModel(description = "Indemnity Form Object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class IndemnityForm   {
  @JsonProperty("indemnityFormId")
  private String indemnityFormId = null;

  @JsonProperty("indemnityFormTitle")
  private String indemnityFormTitle = null;

  @JsonProperty("indemnityFormDescription")
  private String indemnityFormDescription = null;

  @JsonProperty("indemnityFormVersion")
  private String indemnityFormVersion = null;

  @JsonProperty("indemnityFormURL")
  private String indemnityFormURL = null;

  public IndemnityForm indemnityFormId(String indemnityFormId) {
    this.indemnityFormId = indemnityFormId;
    return this;
  }

  /**
   * Unique id of indemnity form
   * @return indemnityFormId
  **/
  @ApiModelProperty(readOnly = true, value = "Unique id of indemnity form")


  public String getIndemnityFormId() {
    return indemnityFormId;
  }

  public void setIndemnityFormId(String indemnityFormId) {
    this.indemnityFormId = indemnityFormId;
  }

  public IndemnityForm indemnityFormTitle(String indemnityFormTitle) {
    this.indemnityFormTitle = indemnityFormTitle;
    return this;
  }

  /**
   * Title of the indemnity Form
   * @return indemnityFormTitle
  **/
  @ApiModelProperty(value = "Title of the indemnity Form")


  public String getIndemnityFormTitle() {
    return indemnityFormTitle;
  }

  public void setIndemnityFormTitle(String indemnityFormTitle) {
    this.indemnityFormTitle = indemnityFormTitle;
  }

  public IndemnityForm indemnityFormDescription(String indemnityFormDescription) {
    this.indemnityFormDescription = indemnityFormDescription;
    return this;
  }

  /**
   * Description of the indemnity Form that explains the purpose and usage of the form
   * @return indemnityFormDescription
  **/
  @ApiModelProperty(value = "Description of the indemnity Form that explains the purpose and usage of the form")


  public String getIndemnityFormDescription() {
    return indemnityFormDescription;
  }

  public void setIndemnityFormDescription(String indemnityFormDescription) {
    this.indemnityFormDescription = indemnityFormDescription;
  }

  public IndemnityForm indemnityFormVersion(String indemnityFormVersion) {
    this.indemnityFormVersion = indemnityFormVersion;
    return this;
  }

  /**
   * Version of the indemnity Form
   * @return indemnityFormVersion
  **/
  @ApiModelProperty(value = "Version of the indemnity Form")


  public String getIndemnityFormVersion() {
    return indemnityFormVersion;
  }

  public void setIndemnityFormVersion(String indemnityFormVersion) {
    this.indemnityFormVersion = indemnityFormVersion;
  }

  public IndemnityForm indemnityFormURL(String indemnityFormURL) {
    this.indemnityFormURL = indemnityFormURL;
    return this;
  }

  /**
   * URL of the indemnity template
   * @return indemnityFormURL
  **/
  @ApiModelProperty(value = "URL of the indemnity template")


  public String getIndemnityFormURL() {
    return indemnityFormURL;
  }

  public void setIndemnityFormURL(String indemnityFormURL) {
    this.indemnityFormURL = indemnityFormURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndemnityForm indemnityForm = (IndemnityForm) o;
    return Objects.equals(this.indemnityFormId, indemnityForm.indemnityFormId) &&
        Objects.equals(this.indemnityFormTitle, indemnityForm.indemnityFormTitle) &&
        Objects.equals(this.indemnityFormDescription, indemnityForm.indemnityFormDescription) &&
        Objects.equals(this.indemnityFormVersion, indemnityForm.indemnityFormVersion) &&
        Objects.equals(this.indemnityFormURL, indemnityForm.indemnityFormURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indemnityFormId, indemnityFormTitle, indemnityFormDescription, indemnityFormVersion, indemnityFormURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndemnityForm {\n");
    
    sb.append("    indemnityFormId: ").append(toIndentedString(indemnityFormId)).append("\n");
    sb.append("    indemnityFormTitle: ").append(toIndentedString(indemnityFormTitle)).append("\n");
    sb.append("    indemnityFormDescription: ").append(toIndentedString(indemnityFormDescription)).append("\n");
    sb.append("    indemnityFormVersion: ").append(toIndentedString(indemnityFormVersion)).append("\n");
    sb.append("    indemnityFormURL: ").append(toIndentedString(indemnityFormURL)).append("\n");
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

