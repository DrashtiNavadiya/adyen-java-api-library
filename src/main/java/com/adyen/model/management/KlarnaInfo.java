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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * KlarnaInfo
 */
@JsonPropertyOrder({
  KlarnaInfo.JSON_PROPERTY_AUTO_CAPTURE,
  KlarnaInfo.JSON_PROPERTY_DISPUTE_EMAIL,
  KlarnaInfo.JSON_PROPERTY_REGION,
  KlarnaInfo.JSON_PROPERTY_SUPPORT_EMAIL
})

public class KlarnaInfo {
  public static final String JSON_PROPERTY_AUTO_CAPTURE = "autoCapture";
  private Boolean autoCapture;

  public static final String JSON_PROPERTY_DISPUTE_EMAIL = "disputeEmail";
  private String disputeEmail;

  /**
   * The region of operation. For example, **NA**, **EU**, **CH**, **AU**.
   */
  public enum RegionEnum {
    NA("NA"),
    
    EU("EU"),
    
    CH("CH"),
    
    AU("AU");

    private String value;

    RegionEnum(String value) {
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
    public static RegionEnum fromValue(String value) {
      for (RegionEnum b : RegionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REGION = "region";
  private RegionEnum region;

  public static final String JSON_PROPERTY_SUPPORT_EMAIL = "supportEmail";
  private String supportEmail;

  public KlarnaInfo() { 
  }

  public KlarnaInfo autoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
    return this;
  }

   /**
   * Indicates the status of [Automatic capture](https://docs.adyen.com/online-payments/capture#automatic-capture). Default value: **false**.
   * @return autoCapture
  **/
  @ApiModelProperty(value = "Indicates the status of [Automatic capture](https://docs.adyen.com/online-payments/capture#automatic-capture). Default value: **false**.")
  @JsonProperty(JSON_PROPERTY_AUTO_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoCapture() {
    return autoCapture;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
  }


  public KlarnaInfo disputeEmail(String disputeEmail) {
    this.disputeEmail = disputeEmail;
    return this;
  }

   /**
   * The email address for disputes.
   * @return disputeEmail
  **/
  @ApiModelProperty(required = true, value = "The email address for disputes.")
  @JsonProperty(JSON_PROPERTY_DISPUTE_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisputeEmail() {
    return disputeEmail;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputeEmail(String disputeEmail) {
    this.disputeEmail = disputeEmail;
  }


  public KlarnaInfo region(RegionEnum region) {
    this.region = region;
    return this;
  }

   /**
   * The region of operation. For example, **NA**, **EU**, **CH**, **AU**.
   * @return region
  **/
  @ApiModelProperty(value = "The region of operation. For example, **NA**, **EU**, **CH**, **AU**.")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegionEnum getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(RegionEnum region) {
    this.region = region;
  }


  public KlarnaInfo supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * The email address of merchant support.
   * @return supportEmail
  **/
  @ApiModelProperty(required = true, value = "The email address of merchant support.")
  @JsonProperty(JSON_PROPERTY_SUPPORT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupportEmail() {
    return supportEmail;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }


  /**
   * Return true if this KlarnaInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KlarnaInfo klarnaInfo = (KlarnaInfo) o;
    return Objects.equals(this.autoCapture, klarnaInfo.autoCapture) &&
        Objects.equals(this.disputeEmail, klarnaInfo.disputeEmail) &&
        Objects.equals(this.region, klarnaInfo.region) &&
        Objects.equals(this.supportEmail, klarnaInfo.supportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCapture, disputeEmail, region, supportEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlarnaInfo {\n");
    sb.append("    autoCapture: ").append(toIndentedString(autoCapture)).append("\n");
    sb.append("    disputeEmail: ").append(toIndentedString(disputeEmail)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
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
   * Create an instance of KlarnaInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of KlarnaInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to KlarnaInfo
   */
  public static KlarnaInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, KlarnaInfo.class);
  }
/**
  * Convert an instance of KlarnaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

