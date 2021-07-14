package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FiscalInfo;
import org.openapitools.model.RequestHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fiscal event request along with request metadata
 */
@ApiModel(description = "Fiscal event request along with request metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class FiscalEventRequest   {
  @JsonProperty("requestHeader")
  private RequestHeader requestHeader;

  @JsonProperty("fiscalInfo")
  private FiscalInfo fiscalInfo;

  public FiscalEventRequest requestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public FiscalEventRequest fiscalInfo(FiscalInfo fiscalInfo) {
    this.fiscalInfo = fiscalInfo;
    return this;
  }

  /**
   * Get fiscalInfo
   * @return fiscalInfo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
    FiscalEventRequest fiscalEventRequest = (FiscalEventRequest) o;
    return Objects.equals(this.requestHeader, fiscalEventRequest.requestHeader) &&
        Objects.equals(this.fiscalInfo, fiscalEventRequest.fiscalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, fiscalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalEventRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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

