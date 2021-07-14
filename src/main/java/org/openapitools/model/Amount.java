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
 * Capture the transaction amount and chart of account corresponding to the transaction amount
 */
@ApiModel(description = "Capture the transaction amount and chart of account corresponding to the transaction amount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class Amount   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("coa")
  private String coa;

  @JsonProperty("fromTime")
  private Long fromTime;

  @JsonProperty("toTime")
  private Long toTime;

  public Amount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * System generated UUID
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "System generated UUID")

@Size(min=1,max=64) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Amount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Transaction Amount
   * @return amount
  */
  @ApiModelProperty(value = "Transaction Amount")

@Size(min=1,max=64) 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Amount coa(String coa) {
    this.coa = coa;
    return this;
  }

  /**
   * Chart of account for the tax head. This is the name spaced field to accommodate hierarchical structure of the COA(eg- majorhead.submajorhead.minorhead...)
   * @return coa
  */
  @ApiModelProperty(readOnly = true, value = "Chart of account for the tax head. This is the name spaced field to accommodate hierarchical structure of the COA(eg- majorhead.submajorhead.minorhead...)")

@Size(min=1,max=64) 
  public String getCoa() {
    return coa;
  }

  public void setCoa(String coa) {
    this.coa = coa;
  }

  public Amount fromTime(Long fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * when the event occured at source system level
   * @return fromTime
  */
  @ApiModelProperty(value = "when the event occured at source system level")


  public Long getFromTime() {
    return fromTime;
  }

  public void setFromTime(Long fromTime) {
    this.fromTime = fromTime;
  }

  public Amount toTime(Long toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * when the event occured at source system level
   * @return toTime
  */
  @ApiModelProperty(value = "when the event occured at source system level")


  public Long getToTime() {
    return toTime;
  }

  public void setToTime(Long toTime) {
    this.toTime = toTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.id, amount.id) &&
        Objects.equals(this.amount, amount.amount) &&
        Objects.equals(this.coa, amount.coa) &&
        Objects.equals(this.fromTime, amount.fromTime) &&
        Objects.equals(this.toTime, amount.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, coa, fromTime, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    coa: ").append(toIndentedString(coa)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

