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
 * Error object will be returned as a part of reponse body in conjunction with ResponseHeader as part of ErrorResponse whenever the request processing status in the ResponseHeader is FAILED. HTTP return in this scenario will usually be HTTP 400.
 */
@ApiModel(description = "Error object will be returned as a part of reponse body in conjunction with ResponseHeader as part of ErrorResponse whenever the request processing status in the ResponseHeader is FAILED. HTTP return in this scenario will usually be HTTP 400.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class Error   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("description")
  private String description;

  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error Code will be service specific error label/code to identiffy the error. Example for error code would be User.NotFound to indicate User Not Found by User/Authentication service. All services must declare their possible Error Codes with brief description in the error response section of their API path.
   * @return code
  */
  @ApiModelProperty(required = true, value = "Error Code will be service specific error label/code to identiffy the error. Example for error code would be User.NotFound to indicate User Not Found by User/Authentication service. All services must declare their possible Error Codes with brief description in the error response section of their API path.")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human readable error message
   * @return message
  */
  @ApiModelProperty(required = true, value = "Human readable error message")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * technical description of the error which can help developer to debug the error if error is unexpected.
   * @return description
  */
  @ApiModelProperty(required = true, value = "technical description of the error which can help developer to debug the error if error is unexpected.")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.description, error.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

