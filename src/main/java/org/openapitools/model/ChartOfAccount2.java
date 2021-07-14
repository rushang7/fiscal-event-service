package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Captures the COA data as map
 */
@ApiModel(description = "Captures the COA data as map")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class ChartOfAccount2   {
  @JsonProperty("majorHead")
  private String majorHead;

  @JsonProperty("subMajorHead")
  private String subMajorHead;

  @JsonProperty("minorHead")
  private String minorHead;

  @JsonProperty("subHead")
  private String subHead;

  @JsonProperty("groupHead")
  private String groupHead;

  @JsonProperty("objectHead")
  private String objectHead;

  public ChartOfAccount2 majorHead(String majorHead) {
    this.majorHead = majorHead;
    return this;
  }

  /**
   * Capture the major head code
   * @return majorHead
  */
  @ApiModelProperty(required = true, value = "Capture the major head code")
  @NotNull

@Size(min=4,max=4) 
  public String getMajorHead() {
    return majorHead;
  }

  public void setMajorHead(String majorHead) {
    this.majorHead = majorHead;
  }

  public ChartOfAccount2 subMajorHead(String subMajorHead) {
    this.subMajorHead = subMajorHead;
    return this;
  }

  /**
   * Capture the sub major head code
   * @return subMajorHead
  */
  @ApiModelProperty(required = true, value = "Capture the sub major head code")
  @NotNull

@Size(min=2,max=2) 
  public String getSubMajorHead() {
    return subMajorHead;
  }

  public void setSubMajorHead(String subMajorHead) {
    this.subMajorHead = subMajorHead;
  }

  public ChartOfAccount2 minorHead(String minorHead) {
    this.minorHead = minorHead;
    return this;
  }

  /**
   * Capture the minor head code
   * @return minorHead
  */
  @ApiModelProperty(required = true, value = "Capture the minor head code")
  @NotNull

@Size(min=3,max=3) 
  public String getMinorHead() {
    return minorHead;
  }

  public void setMinorHead(String minorHead) {
    this.minorHead = minorHead;
  }

  public ChartOfAccount2 subHead(String subHead) {
    this.subHead = subHead;
    return this;
  }

  /**
   * Capture the sub head code
   * @return subHead
  */
  @ApiModelProperty(value = "Capture the sub head code")

@Size(min=2,max=2) 
  public String getSubHead() {
    return subHead;
  }

  public void setSubHead(String subHead) {
    this.subHead = subHead;
  }

  public ChartOfAccount2 groupHead(String groupHead) {
    this.groupHead = groupHead;
    return this;
  }

  /**
   * Capture the group head code
   * @return groupHead
  */
  @ApiModelProperty(value = "Capture the group head code")

@Size(min=2,max=2) 
  public String getGroupHead() {
    return groupHead;
  }

  public void setGroupHead(String groupHead) {
    this.groupHead = groupHead;
  }

  public ChartOfAccount2 objectHead(String objectHead) {
    this.objectHead = objectHead;
    return this;
  }

  /**
   * Capture the object head code
   * @return objectHead
  */
  @ApiModelProperty(value = "Capture the object head code")

@Size(min=2,max=2) 
  public String getObjectHead() {
    return objectHead;
  }

  public void setObjectHead(String objectHead) {
    this.objectHead = objectHead;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartOfAccount2 chartOfAccount2 = (ChartOfAccount2) o;
    return Objects.equals(this.majorHead, chartOfAccount2.majorHead) &&
        Objects.equals(this.subMajorHead, chartOfAccount2.subMajorHead) &&
        Objects.equals(this.minorHead, chartOfAccount2.minorHead) &&
        Objects.equals(this.subHead, chartOfAccount2.subHead) &&
        Objects.equals(this.groupHead, chartOfAccount2.groupHead) &&
        Objects.equals(this.objectHead, chartOfAccount2.objectHead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(majorHead, subMajorHead, minorHead, subHead, groupHead, objectHead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartOfAccount2 {\n");
    
    sb.append("    majorHead: ").append(toIndentedString(majorHead)).append("\n");
    sb.append("    subMajorHead: ").append(toIndentedString(subMajorHead)).append("\n");
    sb.append("    minorHead: ").append(toIndentedString(minorHead)).append("\n");
    sb.append("    subHead: ").append(toIndentedString(subHead)).append("\n");
    sb.append("    groupHead: ").append(toIndentedString(groupHead)).append("\n");
    sb.append("    objectHead: ").append(toIndentedString(objectHead)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

