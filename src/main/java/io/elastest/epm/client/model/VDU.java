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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A Virtual Deployment Unit (VDU) describes the capabilities of virtualized computing (Containers, VMs) and networking resources.
 */
@ApiModel(description = "A Virtual Deployment Unit (VDU) describes the capabilities of virtualized computing (Containers, VMs) and networking resources.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T16:53:27.371+02:00")
public class VDU {
  @SerializedName("computeId")
  private String computeId = null;

  @SerializedName("events")
  private List<Event> events = new ArrayList<Event>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("imageName")
  private String imageName = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("metadata")
  private List<KeyValuePair> metadata = new ArrayList<KeyValuePair>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("netName")
  private String netName = null;

  @SerializedName("poPName")
  private String poPName = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("initializing")
    INITIALIZING("initializing"),
    
    @SerializedName("initialized")
    INITIALIZED("initialized"),
    
    @SerializedName("deploying")
    DEPLOYING("deploying"),
    
    @SerializedName("deployed")
    DEPLOYED("deployed"),
    
    @SerializedName("running")
    RUNNING("running"),
    
    @SerializedName("undeploying")
    UNDEPLOYING("undeploying"),
    
    @SerializedName("undeployed")
    UNDEPLOYED("undeployed"),
    
    @SerializedName("error")
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public VDU computeId(String computeId) {
    this.computeId = computeId;
    return this;
  }

   /**
   * Get computeId
   * @return computeId
  **/
  @ApiModelProperty(example = "1234-abcd", required = true, value = "")
  public String getComputeId() {
    return computeId;
  }

  public void setComputeId(String computeId) {
    this.computeId = computeId;
  }

  public VDU events(List<Event> events) {
    this.events = events;
    return this;
  }

  public VDU addEventsItem(Event eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

  public VDU id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1234-abcd", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VDU imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @ApiModelProperty(example = "testImage1", required = true, value = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public VDU ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(example = "172.0.0.1", required = true, value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public VDU metadata(List<KeyValuePair> metadata) {
    this.metadata = metadata;
    return this;
  }

  public VDU addMetadataItem(KeyValuePair metadataItem) {
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<KeyValuePair> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<KeyValuePair> metadata) {
    this.metadata = metadata;
  }

  public VDU name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "testVdu1", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VDU netName(String netName) {
    this.netName = netName;
    return this;
  }

   /**
   * Get netName
   * @return netName
  **/
  @ApiModelProperty(example = "testNetworkName", required = true, value = "")
  public String getNetName() {
    return netName;
  }

  public void setNetName(String netName) {
    this.netName = netName;
  }

  public VDU poPName(String poPName) {
    this.poPName = poPName;
    return this;
  }

   /**
   * Get poPName
   * @return poPName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPoPName() {
    return poPName;
  }

  public void setPoPName(String poPName) {
    this.poPName = poPName;
  }

  public VDU status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VDU VDU = (io.elastest.epm.client.model.VDU) o;
    return Objects.equals(this.computeId, VDU.computeId) &&
        Objects.equals(this.events, VDU.events) &&
        Objects.equals(this.id, VDU.id) &&
        Objects.equals(this.imageName, VDU.imageName) &&
        Objects.equals(this.ip, VDU.ip) &&
        Objects.equals(this.metadata, VDU.metadata) &&
        Objects.equals(this.name, VDU.name) &&
        Objects.equals(this.netName, VDU.netName) &&
        Objects.equals(this.poPName, VDU.poPName) &&
        Objects.equals(this.status, VDU.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeId, events, id, imageName, ip, metadata, name, netName, poPName, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VDU {\n");

    sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netName: ").append(toIndentedString(netName)).append("\n");
    sb.append("    poPName: ").append(toIndentedString(poPName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

