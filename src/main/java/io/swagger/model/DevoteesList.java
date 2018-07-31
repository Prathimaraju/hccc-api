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
 * This is the schema of response payload when an account&#39;s information is requested
 */
@ApiModel(description = "This is the schema of response payload when an account's information is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class DevoteesList   {
  @JsonProperty("devotees")
  @Valid
  private List<Devotee> devotees = null;

  public DevoteesList devotees(List<Devotee> devotees) {
    this.devotees = devotees;
    return this;
  }

  public DevoteesList addDevoteesItem(Devotee devoteesItem) {
    if (this.devotees == null) {
      this.devotees = new ArrayList<Devotee>();
    }
    this.devotees.add(devoteesItem);
    return this;
  }

  /**
   * List of Devotee Objects
   * @return devotees
  **/
  @ApiModelProperty(value = "List of Devotee Objects")

  @Valid

  public List<Devotee> getDevotees() {
    return devotees;
  }

  public void setDevotees(List<Devotee> devotees) {
    this.devotees = devotees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevoteesList devoteesList = (DevoteesList) o;
    return Objects.equals(this.devotees, devoteesList.devotees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devotees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevoteesList {\n");
    
    sb.append("    devotees: ").append(toIndentedString(devotees)).append("\n");
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

