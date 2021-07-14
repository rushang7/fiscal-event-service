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
 * Event type is master data
 */
@ApiModel(description = "Event type is master data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class EventType   {
  @JsonProperty("ts")
  private Long ts;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("msgId")
  private String msgId;

  @JsonProperty("signature")
  private String signature;

  @JsonProperty("version")
  private String version;

  public EventType ts(Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * response time in epoch
   * @return ts
  */
  @ApiModelProperty(value = "response time in epoch")


  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public EventType correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * unique response message id (UUID) - will usually be the correlation id from the server
   * @return correlationId
  */
  @ApiModelProperty(value = "unique response message id (UUID) - will usually be the correlation id from the server")

@Size(max=256) 
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public EventType msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * message id of the request
   * @return msgId
  */
  @ApiModelProperty(value = "message id of the request")

@Size(max=256) 
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public EventType signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Hash describing the current Request
   * @return signature
  */
  @ApiModelProperty(value = "Hash describing the current Request")


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public EventType version(String version) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventType eventType = (EventType) o;
    return Objects.equals(this.ts, eventType.ts) &&
        Objects.equals(this.correlationId, eventType.correlationId) &&
        Objects.equals(this.msgId, eventType.msgId) &&
        Objects.equals(this.signature, eventType.signature) &&
        Objects.equals(this.version, eventType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, correlationId, msgId, signature, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventType {\n");
    
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

