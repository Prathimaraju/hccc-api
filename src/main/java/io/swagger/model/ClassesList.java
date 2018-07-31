package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ModelClass;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the schema of response payload when a list of classes is requested
 */
@ApiModel(description = "This is the schema of response payload when a list of classes is requested")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

public class ClassesList   {
  @JsonProperty("classes")
  @Valid
  private List<ModelClass> classes = null;

  public ClassesList classes(List<ModelClass> classes) {
    this.classes = classes;
    return this;
  }

  public ClassesList addClassesItem(ModelClass classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<ModelClass>();
    }
    this.classes.add(classesItem);
    return this;
  }

  /**
   * List of Courses
   * @return classes
  **/
  @ApiModelProperty(value = "List of Courses")

  @Valid

  public List<ModelClass> getClasses() {
    return classes;
  }

  public void setClasses(List<ModelClass> classes) {
    this.classes = classes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassesList classesList = (ClassesList) o;
    return Objects.equals(this.classes, classesList.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassesList {\n");
    
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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

