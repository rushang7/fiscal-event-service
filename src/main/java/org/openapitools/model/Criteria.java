package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The object contains all the search criteria of the fiscal events
 */
@ApiModel(description = "The object contains all the search criteria of the fiscal events")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class Criteria   {
  @JsonProperty("ids")
  @Valid
  private List<String> ids = null;

  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("fromTransactionTime")
  private Long fromTransactionTime;

  @JsonProperty("toTransactionTime")
  private Long toTransactionTime;

  @JsonProperty("referenceId")
  @Valid
  private List<String> referenceId = null;

  public Criteria ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public Criteria addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * List of event ids
   * @return ids
  */
  @ApiModelProperty(value = "List of event ids")


  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public Criteria tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant Id
   * @return tenantId
  */
  @ApiModelProperty(required = true, value = "Tenant Id")
  @NotNull

@Size(min=2,max=256) 
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Criteria eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Captures the event type(eg- bill, receipt, expenditure)
   * @return eventType
  */
  @ApiModelProperty(required = true, value = "Captures the event type(eg- bill, receipt, expenditure)")
  @NotNull

@Size(min=1,max=64) 
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Criteria fromTransactionTime(Long fromTransactionTime) {
    this.fromTransactionTime = fromTransactionTime;
    return this;
  }

  /**
   * Search events b/w transaction time(Start date)
   * @return fromTransactionTime
  */
  @ApiModelProperty(value = "Search events b/w transaction time(Start date)")


  public Long getFromTransactionTime() {
    return fromTransactionTime;
  }

  public void setFromTransactionTime(Long fromTransactionTime) {
    this.fromTransactionTime = fromTransactionTime;
  }

  public Criteria toTransactionTime(Long toTransactionTime) {
    this.toTransactionTime = toTransactionTime;
    return this;
  }

  /**
   * Search events b/w transaction time(End date)
   * @return toTransactionTime
  */
  @ApiModelProperty(value = "Search events b/w transaction time(End date)")


  public Long getToTransactionTime() {
    return toTransactionTime;
  }

  public void setToTransactionTime(Long toTransactionTime) {
    this.toTransactionTime = toTransactionTime;
  }

  public Criteria referenceId(List<String> referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  public Criteria addReferenceIdItem(String referenceIdItem) {
    if (this.referenceId == null) {
      this.referenceId = new ArrayList<>();
    }
    this.referenceId.add(referenceIdItem);
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  */
  @ApiModelProperty(value = "")


  public List<String> getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(List<String> referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria criteria = (Criteria) o;
    return Objects.equals(this.ids, criteria.ids) &&
        Objects.equals(this.tenantId, criteria.tenantId) &&
        Objects.equals(this.eventType, criteria.eventType) &&
        Objects.equals(this.fromTransactionTime, criteria.fromTransactionTime) &&
        Objects.equals(this.toTransactionTime, criteria.toTransactionTime) &&
        Objects.equals(this.referenceId, criteria.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, tenantId, eventType, fromTransactionTime, toTransactionTime, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    fromTransactionTime: ").append(toIndentedString(fromTransactionTime)).append("\n");
    sb.append("    toTransactionTime: ").append(toIndentedString(toTransactionTime)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

