package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Criteria;
import org.openapitools.model.RequestHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fiscal event request along with request metadata
 */
@ApiModel(description = "Fiscal event request along with request metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class FiscalEventGetRequest   {
  @JsonProperty("requestHeader")
  private RequestHeader requestHeader;

  @JsonProperty("criteria")
  private Criteria criteria;

  public FiscalEventGetRequest requestHeader(RequestHeader requestHeader) {
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

  public FiscalEventGetRequest criteria(Criteria criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Get criteria
   * @return criteria
  */
  @ApiModelProperty(value = "")

  @Valid

  public Criteria getCriteria() {
    return criteria;
  }

  public void setCriteria(Criteria criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalEventGetRequest fiscalEventGetRequest = (FiscalEventGetRequest) o;
    return Objects.equals(this.requestHeader, fiscalEventGetRequest.requestHeader) &&
        Objects.equals(this.criteria, fiscalEventGetRequest.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalEventGetRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

