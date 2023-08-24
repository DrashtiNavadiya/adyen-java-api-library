/*
 * Authentication webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.acswebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.acswebhooks.Amount;
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
 * PurchaseInfo
 */
@JsonPropertyOrder({
  PurchaseInfo.JSON_PROPERTY_DATE,
  PurchaseInfo.JSON_PROPERTY_MERCHANT_NAME,
  PurchaseInfo.JSON_PROPERTY_ORIGINAL_AMOUNT
})

public class PurchaseInfo {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchantName";
  private String merchantName;

  public static final String JSON_PROPERTY_ORIGINAL_AMOUNT = "originalAmount";
  private Amount originalAmount;

  public PurchaseInfo() { 
  }

  public PurchaseInfo date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the purchase.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of the purchase.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public PurchaseInfo merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Name of the merchant.
   * @return merchantName
  **/
  @ApiModelProperty(required = true, value = "Name of the merchant.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantName() {
    return merchantName;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public PurchaseInfo originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getOriginalAmount() {
    return originalAmount;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }


  /**
   * Return true if this PurchaseInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseInfo purchaseInfo = (PurchaseInfo) o;
    return Objects.equals(this.date, purchaseInfo.date) &&
        Objects.equals(this.merchantName, purchaseInfo.merchantName) &&
        Objects.equals(this.originalAmount, purchaseInfo.originalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, merchantName, originalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseInfo {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
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
   * Create an instance of PurchaseInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PurchaseInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to PurchaseInfo
   */
  public static PurchaseInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PurchaseInfo.class);
  }
/**
  * Convert an instance of PurchaseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

