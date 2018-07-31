package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IndemnityForm;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema of response payload when a list of indemnity forms is requested
 */
@ApiModel(description = "This is the schema of response payload when a list of indemnity forms is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class IndemnityFormsList   {
  @JsonProperty("indemnityForms")
  @Valid
  private List<IndemnityForm> indemnityForms = null;

  public IndemnityFormsList indemnityForms(List<IndemnityForm> indemnityForms) {
    this.indemnityForms = indemnityForms;
    return this;
  }

  public IndemnityFormsList addIndemnityFormsItem(IndemnityForm indemnityFormsItem) {
    if (this.indemnityForms == null) {
      this.indemnityForms = new ArrayList<IndemnityForm>();
    }
    this.indemnityForms.add(indemnityFormsItem);
    return this;
  }

  /**
   * List of Indemnity Forms
   * @return indemnityForms
  **/
  @ApiModelProperty(value = "List of Indemnity Forms")

  @Valid

  public List<IndemnityForm> getIndemnityForms() {
    return indemnityForms;
  }

  public void setIndemnityForms(List<IndemnityForm> indemnityForms) {
    this.indemnityForms = indemnityForms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndemnityFormsList indemnityFormsList = (IndemnityFormsList) o;
    return Objects.equals(this.indemnityForms, indemnityFormsList.indemnityForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indemnityForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndemnityFormsList {\n");
    
    sb.append("    indemnityForms: ").append(toIndentedString(indemnityForms)).append("\n");
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

