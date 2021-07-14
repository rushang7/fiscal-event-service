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
 * Capture the user information
 */
@ApiModel(description = "Capture the user information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
public class UserInfo   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  @JsonProperty("tenants")
  @Valid
  private List<String> tenants = null;

  @JsonProperty("attributes")
  private Object attributes;

  public UserInfo uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * System Generated User id of the authenticated user.
   * @return uuid
  */
  @ApiModelProperty(value = "System Generated User id of the authenticated user.")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public UserInfo roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UserInfo addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * List of roles assigned to a user
   * @return roles
  */
  @ApiModelProperty(value = "List of roles assigned to a user")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public UserInfo tenants(List<String> tenants) {
    this.tenants = tenants;
    return this;
  }

  public UserInfo addTenantsItem(String tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

  /**
   * List of tenants assigned to a user
   * @return tenants
  */
  @ApiModelProperty(value = "List of tenants assigned to a user")


  public List<String> getTenants() {
    return tenants;
  }

  public void setTenants(List<String> tenants) {
    this.tenants = tenants;
  }

  public UserInfo attributes(Object attributes) {
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
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.uuid, userInfo.uuid) &&
        Objects.equals(this.roles, userInfo.roles) &&
        Objects.equals(this.tenants, userInfo.tenants) &&
        Objects.equals(this.attributes, userInfo.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, roles, tenants, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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

