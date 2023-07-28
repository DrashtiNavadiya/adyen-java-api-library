/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.TerminalProduct;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TerminalProductsResponse
 */
@JsonPropertyOrder({
  TerminalProductsResponse.JSON_PROPERTY_DATA
})

public class TerminalProductsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TerminalProduct> data = null;

  public TerminalProductsResponse() { 
  }

  public TerminalProductsResponse data(List<TerminalProduct> data) {
    this.data = data;
    return this;
  }

  public TerminalProductsResponse addDataItem(TerminalProduct dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Terminal products that can be ordered.
   * @return data
  **/
  @ApiModelProperty(value = "Terminal products that can be ordered.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TerminalProduct> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TerminalProduct> data) {
    this.data = data;
  }


  /**
   * Return true if this TerminalProductsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalProductsResponse terminalProductsResponse = (TerminalProductsResponse) o;
    return Objects.equals(this.data, terminalProductsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalProductsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

/**
   * Create an instance of TerminalProductsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalProductsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalProductsResponse
   */
  public static TerminalProductsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalProductsResponse.class);
  }
/**
  * Convert an instance of TerminalProductsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

