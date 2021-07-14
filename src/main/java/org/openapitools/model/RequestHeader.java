package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestHeader should be used to carry meta information about the requests to the server as described in the fields below. All eGov APIs will use requestHeader as a part of the request body to carry this meta information. Some of this information will be returned back from the server as part of the ResponseHeader in the response body to ensure correlation.
 */
@ApiModel(description = "RequestHeader should be used to carry meta information about the requests to the server as described in the fields below. All eGov APIs will use requestHeader as a part of the request body to carry this meta information. Some of this information will be returned back from the server as part of the ResponseHeader in the response body to ensure correlation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class RequestHeader   {
  @JsonProperty("ts")
  private Long ts;

  @JsonProperty("version")
  private String version;

  @JsonProperty("msgId")
  private String msgId;

  @JsonProperty("userInfo")
  private UserInfo userInfo;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("signature")
  private String signature;

  public RequestHeader ts(Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * time in epoch
   * @return ts
  */
  @ApiModelProperty(value = "time in epoch")


  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public RequestHeader version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the API
   * @return version
  */
  @ApiModelProperty(value = "The version of the API")

@Size(min=2,max=64) 
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public RequestHeader msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * Unique request message id from the caller
   * @return msgId
  */
  @ApiModelProperty(value = "Unique request message id from the caller")

@Size(max=256) 
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public RequestHeader userInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * Get userInfo
   * @return userInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserInfo getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  public RequestHeader correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
  */
  @ApiModelProperty(readOnly = true, value = "")


  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public RequestHeader signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Hash describing the current RequestHeader
   * @return signature
  */
  @ApiModelProperty(value = "Hash describing the current RequestHeader")


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.ts, requestHeader.ts) &&
        Objects.equals(this.version, requestHeader.version) &&
        Objects.equals(this.msgId, requestHeader.msgId) &&
        Objects.equals(this.userInfo, requestHeader.userInfo) &&
        Objects.equals(this.correlationId, requestHeader.correlationId) &&
        Objects.equals(this.signature, requestHeader.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, version, msgId, userInfo, correlationId, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

