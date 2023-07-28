/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.BalanceAccount;
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
 * BalanceAccountNotificationData
 */
@JsonPropertyOrder({
  BalanceAccountNotificationData.JSON_PROPERTY_BALANCE_ACCOUNT,
  BalanceAccountNotificationData.JSON_PROPERTY_BALANCE_PLATFORM
})

public class BalanceAccountNotificationData {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT = "balanceAccount";
  private BalanceAccount balanceAccount;

  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  public BalanceAccountNotificationData() { 
  }

  public BalanceAccountNotificationData balanceAccount(BalanceAccount balanceAccount) {
    this.balanceAccount = balanceAccount;
    return this;
  }

   /**
   * Get balanceAccount
   * @return balanceAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BalanceAccount getBalanceAccount() {
    return balanceAccount;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccount(BalanceAccount balanceAccount) {
    this.balanceAccount = balanceAccount;
  }


  public BalanceAccountNotificationData balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
  **/
  @ApiModelProperty(value = "The unique identifier of the balance platform.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalancePlatform() {
    return balancePlatform;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  /**
   * Return true if this BalanceAccountNotificationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountNotificationData balanceAccountNotificationData = (BalanceAccountNotificationData) o;
    return Objects.equals(this.balanceAccount, balanceAccountNotificationData.balanceAccount) &&
        Objects.equals(this.balancePlatform, balanceAccountNotificationData.balancePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccount, balancePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountNotificationData {\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
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
   * Create an instance of BalanceAccountNotificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountNotificationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceAccountNotificationData
   */
  public static BalanceAccountNotificationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceAccountNotificationData.class);
  }
/**
  * Convert an instance of BalanceAccountNotificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

