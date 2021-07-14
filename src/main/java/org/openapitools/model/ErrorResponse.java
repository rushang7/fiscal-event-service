package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Error;
import org.openapitools.model.ResponseHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All APIs will return ErrorRes in case of failure which will carry ResponseHeader as metadata and Error object as actual representation of error.
 */
@ApiModel(description = "All APIs will return ErrorRes in case of failure which will carry ResponseHeader as metadata and Error object as actual representation of error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class ErrorResponse   {
  @JsonProperty("ResponseHeader")
  private ResponseHeader responseHeader;

  @JsonProperty("Errors")
  @Valid
  private List<Error> errors = null;

  public ErrorResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public ErrorResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error response array to return multiple error for single request
   * @return errors
  */
  @ApiModelProperty(value = "Error response array to return multiple error for single request")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.responseHeader, errorResponse.responseHeader) &&
        Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

