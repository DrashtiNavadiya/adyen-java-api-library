/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.CapitalGrant;
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
 * CapitalGrants
 */
@JsonPropertyOrder({
  CapitalGrants.JSON_PROPERTY_GRANTS
})

public class CapitalGrants {
  public static final String JSON_PROPERTY_GRANTS = "grants";
  private List<CapitalGrant> grants = new ArrayList<>();

  public CapitalGrants() { 
  }

  public CapitalGrants grants(List<CapitalGrant> grants) {
    this.grants = grants;
    return this;
  }

  public CapitalGrants addGrantsItem(CapitalGrant grantsItem) {
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * The unique identifier of the grant.
   * @return grants
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the grant.")
  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CapitalGrant> getGrants() {
    return grants;
  }


  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrants(List<CapitalGrant> grants) {
    this.grants = grants;
  }


  /**
   * Return true if this CapitalGrants object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalGrants capitalGrants = (CapitalGrants) o;
    return Objects.equals(this.grants, capitalGrants.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalGrants {\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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
   * Create an instance of CapitalGrants given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapitalGrants
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapitalGrants
   */
  public static CapitalGrants fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapitalGrants.class);
  }
/**
  * Convert an instance of CapitalGrants to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

