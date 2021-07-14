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
 * Captures the hierarchical COA data in recursively
 */
@ApiModel(description = "Captures the hierarchical COA data in recursively")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class ChartOfAccount   {
  @JsonProperty("headCodeCategory")
  private String headCodeCategory;

  @JsonProperty("headCode")
  private String headCode;

  @JsonProperty("child")
  private ChartOfAccount child;

  public ChartOfAccount headCodeCategory(String headCodeCategory) {
    this.headCodeCategory = headCodeCategory;
    return this;
  }

  /**
   * Capture the head code category
   * @return headCodeCategory
  */
  @ApiModelProperty(value = "Capture the head code category")


  public String getHeadCodeCategory() {
    return headCodeCategory;
  }

  public void setHeadCodeCategory(String headCodeCategory) {
    this.headCodeCategory = headCodeCategory;
  }

  public ChartOfAccount headCode(String headCode) {
    this.headCode = headCode;
    return this;
  }

  /**
   * Capture the actual COA code for head code category
   * @return headCode
  */
  @ApiModelProperty(value = "Capture the actual COA code for head code category")

@Size(max=6) 
  public String getHeadCode() {
    return headCode;
  }

  public void setHeadCode(String headCode) {
    this.headCode = headCode;
  }

  public ChartOfAccount child(ChartOfAccount child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  */
  @ApiModelProperty(value = "")

  @Valid

  public ChartOfAccount getChild() {
    return child;
  }

  public void setChild(ChartOfAccount child) {
    this.child = child;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartOfAccount chartOfAccount = (ChartOfAccount) o;
    return Objects.equals(this.headCodeCategory, chartOfAccount.headCodeCategory) &&
        Objects.equals(this.headCode, chartOfAccount.headCode) &&
        Objects.equals(this.child, chartOfAccount.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headCodeCategory, headCode, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartOfAccount {\n");
    
    sb.append("    headCodeCategory: ").append(toIndentedString(headCodeCategory)).append("\n");
    sb.append("    headCode: ").append(toIndentedString(headCode)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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

