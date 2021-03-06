/*
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.elastest.epm.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Adapter */
@javax.annotation.Generated(
  value = "io.swagger.codegen.languages.JavaClientCodegen",
  date = "2018-04-26T12:04:20.987+02:00"
)
public class Adapter {
  @SerializedName("id")
  private String id = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("type")
  private String type = null;

  public Adapter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Adapter endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   *
   * @return endpoint
   */
  @ApiModelProperty(required = true, value = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Adapter type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adapter adapter = (Adapter) o;
    return Objects.equals(this.id, adapter.id)
        && Objects.equals(this.endpoint, adapter.endpoint)
        && Objects.equals(this.type, adapter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endpoint, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adapter {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
