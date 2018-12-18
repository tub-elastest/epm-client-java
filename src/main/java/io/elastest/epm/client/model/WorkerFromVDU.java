/**
 * EPM REST API
 * REST API description of the ElasTest Platform Manager Module.
 *
 * OpenAPI spec version: 0.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.elastest.epm.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * WorkerFromVDU
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-17T11:20:22.580+01:00")
public class WorkerFromVDU   {
  @SerializedName("type")
  private List<String> type = new ArrayList<String>();

  @SerializedName("vduId")
  private String vduId = null;

  public WorkerFromVDU type(List<String> type) {
    this.type = type;
    return this;
  }

  public WorkerFromVDU addTypeItem(String typeItem) {
    this.type.add(typeItem);
    return this;
  }

   /**
   * The types of the worker.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The types of the worker.")
  public List<String> getType() {
    return type;
  }

  public void setType(List<String> type) {
    this.type = type;
  }

  public WorkerFromVDU vduId(String vduId) {
    this.vduId = vduId;
    return this;
  }

   /**
   * The id of vdu from which to create the worker.
   * @return vduId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of vdu from which to create the worker.")
  public String getVduId() {
    return vduId;
  }

  public void setVduId(String vduId) {
    this.vduId = vduId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerFromVDU workerFromVDU = (WorkerFromVDU) o;
    return Objects.equals(this.type, workerFromVDU.type) &&
        Objects.equals(this.vduId, workerFromVDU.vduId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, vduId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerFromVDU {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vduId: ").append(toIndentedString(vduId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

