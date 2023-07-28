/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.Address;
import com.adyen.model.balanceplatform.Phone;
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
 * ContactDetails
 */
@JsonPropertyOrder({
  ContactDetails.JSON_PROPERTY_ADDRESS,
  ContactDetails.JSON_PROPERTY_EMAIL,
  ContactDetails.JSON_PROPERTY_PHONE,
  ContactDetails.JSON_PROPERTY_WEB_ADDRESS
})

public class ContactDetails {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_WEB_ADDRESS = "webAddress";
  private String webAddress;

  public ContactDetails() { 
  }

  public ContactDetails address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public ContactDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the account holder.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address of the account holder.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public ContactDetails phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public ContactDetails webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

   /**
   * The URL of the account holder&#39;s website.
   * @return webAddress
  **/
  @ApiModelProperty(value = "The URL of the account holder's website.")
  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebAddress() {
    return webAddress;
  }


  @JsonProperty(JSON_PROPERTY_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }


  /**
   * Return true if this ContactDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.address, contactDetails.address) &&
        Objects.equals(this.email, contactDetails.email) &&
        Objects.equals(this.phone, contactDetails.phone) &&
        Objects.equals(this.webAddress, contactDetails.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, phone, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
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
   * Create an instance of ContactDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContactDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to ContactDetails
   */
  public static ContactDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ContactDetails.class);
  }
/**
  * Convert an instance of ContactDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

