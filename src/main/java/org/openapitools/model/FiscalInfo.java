package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Amount;
import org.openapitools.model.AuditDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This object captures the fiscal information of external systems.
 */
@ApiModel(description = "This object captures the fiscal information of external systems.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class FiscalInfo   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("tenantId")
  private String tenantId;

  /**
   * Captures the event type(eg- bill, receipt, expenditure)
   */
  public enum EventTypeEnum {
    REVENUE_DEMAND("revenue_demand"),
    
    REVENUE_BILL("revenue_bill"),
    
    REVENUE_RECEIPT("revenue_receipt"),
    
    EXPENDITURE_DEMAND("expenditure_demand"),
    
    EXPENDITURE_BILL("expenditure_bill"),
    
    EXPENDITURE_RECEIPT("expenditure_receipt");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("eventType")
  private EventTypeEnum eventType;

  @JsonProperty("transactionTime")
  private Long transactionTime;

  @JsonProperty("referenceId")
  private String referenceId;

  @JsonProperty("parentEventId")
  private String parentEventId;

  @JsonProperty("amountDetails")
  @Valid
  private List<Amount> amountDetails = null;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("attributes")
  private Object attributes;

  public FiscalInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * System generated UUID.
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "System generated UUID.")

@Size(min=1,max=64) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FiscalInfo tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant Id
   * @return tenantId
  */
  @ApiModelProperty(value = "Tenant Id")

@Size(min=2,max=256) 
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public FiscalInfo eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Captures the event type(eg- bill, receipt, expenditure)
   * @return eventType
  */
  @ApiModelProperty(value = "Captures the event type(eg- bill, receipt, expenditure)")

@Size(min=1,max=64) 
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public FiscalInfo transactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
    return this;
  }

  /**
   * when the event occured at source system level
   * @return transactionTime
  */
  @ApiModelProperty(value = "when the event occured at source system level")


  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }

  public FiscalInfo referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * reference unique id(transaction id) of the caller system
   * @return referenceId
  */
  @ApiModelProperty(value = "reference unique id(transaction id) of the caller system")

@Size(min=1,max=64) 
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public FiscalInfo parentEventId(String parentEventId) {
    this.parentEventId = parentEventId;
    return this;
  }

  /**
   * System generated UUID.
   * @return parentEventId
  */
  @ApiModelProperty(readOnly = true, value = "System generated UUID.")

@Size(min=1,max=64) 
  public String getParentEventId() {
    return parentEventId;
  }

  public void setParentEventId(String parentEventId) {
    this.parentEventId = parentEventId;
  }

  public FiscalInfo amountDetails(List<Amount> amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

  public FiscalInfo addAmountDetailsItem(Amount amountDetailsItem) {
    if (this.amountDetails == null) {
      this.amountDetails = new ArrayList<>();
    }
    this.amountDetails.add(amountDetailsItem);
    return this;
  }

  /**
   * Get amountDetails
   * @return amountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Amount> getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(List<Amount> amountDetails) {
    this.amountDetails = amountDetails;
  }

  public FiscalInfo auditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    return this;
  }

  /**
   * Get auditDetails
   * @return auditDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }

  public FiscalInfo attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @ApiModelProperty(value = "")


  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalInfo fiscalInfo = (FiscalInfo) o;
    return Objects.equals(this.id, fiscalInfo.id) &&
        Objects.equals(this.tenantId, fiscalInfo.tenantId) &&
        Objects.equals(this.eventType, fiscalInfo.eventType) &&
        Objects.equals(this.transactionTime, fiscalInfo.transactionTime) &&
        Objects.equals(this.referenceId, fiscalInfo.referenceId) &&
        Objects.equals(this.parentEventId, fiscalInfo.parentEventId) &&
        Objects.equals(this.amountDetails, fiscalInfo.amountDetails) &&
        Objects.equals(this.auditDetails, fiscalInfo.auditDetails) &&
        Objects.equals(this.attributes, fiscalInfo.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, eventType, transactionTime, referenceId, parentEventId, amountDetails, auditDetails, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    parentEventId: ").append(toIndentedString(parentEventId)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

