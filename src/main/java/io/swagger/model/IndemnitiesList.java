package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Indemnity;
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

public class IndemnitiesList   {
  @JsonProperty("indemnities")
  @Valid
  private List<Indemnity> indemnities = null;

  public IndemnitiesList indemnities(List<Indemnity> indemnities) {
    this.indemnities = indemnities;
    return this;
  }

  public IndemnitiesList addIndemnitiesItem(Indemnity indemnitiesItem) {
    if (this.indemnities == null) {
      this.indemnities = new ArrayList<Indemnity>();
    }
    this.indemnities.add(indemnitiesItem);
    return this;
  }

  /**
   * List of Indemnities
   * @return indemnities
  **/
  @ApiModelProperty(value = "List of Indemnities")

  @Valid

  public List<Indemnity> getIndemnities() {
    return indemnities;
  }

  public void setIndemnities(List<Indemnity> indemnities) {
    this.indemnities = indemnities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndemnitiesList indemnitiesList = (IndemnitiesList) o;
    return Objects.equals(this.indemnities, indemnitiesList.indemnities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indemnities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndemnitiesList {\n");
    
    sb.append("    indemnities: ").append(toIndentedString(indemnities)).append("\n");
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

