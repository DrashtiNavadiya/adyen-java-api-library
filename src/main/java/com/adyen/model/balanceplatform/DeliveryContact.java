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
import com.adyen.model.balanceplatform.DeliveryAddress;
import com.adyen.model.balanceplatform.Name;
import com.adyen.model.balanceplatform.PhoneNumber;
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
 * DeliveryContact
 */
@JsonPropertyOrder({
  DeliveryContact.JSON_PROPERTY_ADDRESS,
  DeliveryContact.JSON_PROPERTY_EMAIL,
  DeliveryContact.JSON_PROPERTY_FULL_PHONE_NUMBER,
  DeliveryContact.JSON_PROPERTY_NAME,
  DeliveryContact.JSON_PROPERTY_PHONE_NUMBER,
  DeliveryContact.JSON_PROPERTY_WEB_ADDRESS
})

public class DeliveryContact {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private DeliveryAddress address;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_PHONE_NUMBER = "fullPhoneNumber";
  private String fullPhoneNumber;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private PhoneNumber phoneNumber;

  public static final String JSON_PROPERTY_WEB_ADDRESS = "webAddress";
  private String webAddress;

  public DeliveryContact() { 
  }

  public DeliveryContact address(DeliveryAddress address) {
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

  public DeliveryAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(DeliveryAddress address) {
    this.address = address;
  }


  public DeliveryContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the contact.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the contact.")
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


  public DeliveryContact fullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
    return this;
  }

   /**
   * The full phone number of the contact provided as a single string. It will be handled as a landline phone. **Examples:** \&quot;0031 6 11 22 33 44\&quot;, \&quot;+316/1122-3344\&quot;, \&quot;(0031) 611223344\&quot;
   * @return fullPhoneNumber
  **/
  @ApiModelProperty(value = "The full phone number of the contact provided as a single string. It will be handled as a landline phone. **Examples:** \"0031 6 11 22 33 44\", \"+316/1122-3344\", \"(0031) 611223344\"")
  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullPhoneNumber() {
    return fullPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_FULL_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
  }


  public DeliveryContact name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public DeliveryContact phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public DeliveryContact webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

   /**
   * The URL of the contact&#39;s website.
   * @return webAddress
  **/
  @ApiModelProperty(value = "The URL of the contact's website.")
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
   * Return true if this DeliveryContact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryContact deliveryContact = (DeliveryContact) o;
    return Objects.equals(this.address, deliveryContact.address) &&
        Objects.equals(this.email, deliveryContact.email) &&
        Objects.equals(this.fullPhoneNumber, deliveryContact.fullPhoneNumber) &&
        Objects.equals(this.name, deliveryContact.name) &&
        Objects.equals(this.phoneNumber, deliveryContact.phoneNumber) &&
        Objects.equals(this.webAddress, deliveryContact.webAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, fullPhoneNumber, name, phoneNumber, webAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryContact {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullPhoneNumber: ").append(toIndentedString(fullPhoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
   * Create an instance of DeliveryContact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeliveryContact
   * @throws JsonProcessingException if the JSON string is invalid with respect to DeliveryContact
   */
  public static DeliveryContact fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DeliveryContact.class);
  }
/**
  * Convert an instance of DeliveryContact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

