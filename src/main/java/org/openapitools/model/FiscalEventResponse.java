package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FiscalInfo;
import org.openapitools.model.ResponseHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the ResponseHeader and the enriched fiscal information
 */
@ApiModel(description = "Contains the ResponseHeader and the enriched fiscal information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class FiscalEventResponse   {
  @JsonProperty("responseInfo")
  private ResponseHeader responseInfo;

  @JsonProperty("fiscalInfo")
  private FiscalInfo fiscalInfo;

  public FiscalEventResponse responseInfo(ResponseHeader responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

  /**
   * Get responseInfo
   * @return responseInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponseHeader getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(ResponseHeader responseInfo) {
    this.responseInfo = responseInfo;
  }

  public FiscalEventResponse fiscalInfo(FiscalInfo fiscalInfo) {
    this.fiscalInfo = fiscalInfo;
    return this;
  }

  /**
   * Get fiscalInfo
   * @return fiscalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FiscalInfo getFiscalInfo() {
    return fiscalInfo;
  }

  public void setFiscalInfo(FiscalInfo fiscalInfo) {
    this.fiscalInfo = fiscalInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalEventResponse fiscalEventResponse = (FiscalEventResponse) o;
    return Objects.equals(this.responseInfo, fiscalEventResponse.responseInfo) &&
        Objects.equals(this.fiscalInfo, fiscalEventResponse.fiscalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, fiscalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalEventResponse {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    fiscalInfo: ").append(toIndentedString(fiscalInfo)).append("\n");
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

