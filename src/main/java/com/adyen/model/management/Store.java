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
import com.adyen.model.management.Links;
import com.adyen.model.management.StoreLocation;
import com.adyen.model.management.StoreSplitConfiguration;
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
 * Store
 */
@JsonPropertyOrder({
  Store.JSON_PROPERTY_LINKS,
  Store.JSON_PROPERTY_ADDRESS,
  Store.JSON_PROPERTY_BUSINESS_LINE_IDS,
  Store.JSON_PROPERTY_DESCRIPTION,
  Store.JSON_PROPERTY_EXTERNAL_REFERENCE_ID,
  Store.JSON_PROPERTY_ID,
  Store.JSON_PROPERTY_MERCHANT_ID,
  Store.JSON_PROPERTY_PHONE_NUMBER,
  Store.JSON_PROPERTY_REFERENCE,
  Store.JSON_PROPERTY_SHOPPER_STATEMENT,
  Store.JSON_PROPERTY_SPLIT_CONFIGURATION,
  Store.JSON_PROPERTY_STATUS
})

public class Store {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private Links links;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private StoreLocation address;

  public static final String JSON_PROPERTY_BUSINESS_LINE_IDS = "businessLineIds";
  private List<String> businessLineIds = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_REFERENCE_ID = "externalReferenceId";
  private String externalReferenceId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SHOPPER_STATEMENT = "shopperStatement";
  private String shopperStatement;

  public static final String JSON_PROPERTY_SPLIT_CONFIGURATION = "splitConfiguration";
  private StoreSplitConfiguration splitConfiguration;

  /**
   * The status of the store. Possible values are:  - **active**. This value is assigned automatically when a store is created.  - **inactive**. The terminals under the store are blocked from accepting new transactions, but capturing outstanding transactions is still possible. - **closed**. This status is irreversible. The terminals under the store are reassigned to the merchant inventory.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public Store() { 
  }

  public Store links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Links links) {
    this.links = links;
  }


  public Store address(StoreLocation address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoreLocation getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(StoreLocation address) {
    this.address = address;
  }


  public Store businessLineIds(List<String> businessLineIds) {
    this.businessLineIds = businessLineIds;
    return this;
  }

  public Store addBusinessLineIdsItem(String businessLineIdsItem) {
    if (this.businessLineIds == null) {
      this.businessLineIds = new ArrayList<>();
    }
    this.businessLineIds.add(businessLineIdsItem);
    return this;
  }

   /**
   * The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businesslines__resParam_id) that the store is associated with.  If not specified, the business line of the merchant account is used. Required when there are multiple business lines under the merchant account.
   * @return businessLineIds
  **/
  @ApiModelProperty(value = "The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businesslines__resParam_id) that the store is associated with.  If not specified, the business line of the merchant account is used. Required when there are multiple business lines under the merchant account.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBusinessLineIds() {
    return businessLineIds;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLineIds(List<String> businessLineIds) {
    this.businessLineIds = businessLineIds;
  }


  public Store description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the store.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the store.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Store externalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
    return this;
  }

   /**
   * When using the Zip payment method: The location ID that Zip has assigned to your store.
   * @return externalReferenceId
  **/
  @ApiModelProperty(value = "When using the Zip payment method: The location ID that Zip has assigned to your store.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalReferenceId() {
    return externalReferenceId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }


  public Store id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the store. This value is generated by Adyen.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the store. This value is generated by Adyen.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Store merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The unique identifier of the merchant account that the store belongs to.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant account that the store belongs to.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public Store phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the store, including &#39;+&#39; and country code.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the store, including '+' and country code.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Store reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A reference to recognize the store by. Also known as the store code.  Allowed characters: Lowercase and uppercase letters without diacritics, numbers 0 through 9, hyphen (-), and underscore (_)
   * @return reference
  **/
  @ApiModelProperty(value = "A reference to recognize the store by. Also known as the store code.  Allowed characters: Lowercase and uppercase letters without diacritics, numbers 0 through 9, hyphen (-), and underscore (_)")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Store shopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
    return this;
  }

   /**
   * The store name shown on the shopper&#39;s bank or credit card statement and on the shopper receipt.
   * @return shopperStatement
  **/
  @ApiModelProperty(value = "The store name shown on the shopper's bank or credit card statement and on the shopper receipt.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperStatement() {
    return shopperStatement;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_STATEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
  }


  public Store splitConfiguration(StoreSplitConfiguration splitConfiguration) {
    this.splitConfiguration = splitConfiguration;
    return this;
  }

   /**
   * Get splitConfiguration
   * @return splitConfiguration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoreSplitConfiguration getSplitConfiguration() {
    return splitConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitConfiguration(StoreSplitConfiguration splitConfiguration) {
    this.splitConfiguration = splitConfiguration;
  }


  public Store status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the store. Possible values are:  - **active**. This value is assigned automatically when a store is created.  - **inactive**. The terminals under the store are blocked from accepting new transactions, but capturing outstanding transactions is still possible. - **closed**. This status is irreversible. The terminals under the store are reassigned to the merchant inventory.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the store. Possible values are:  - **active**. This value is assigned automatically when a store is created.  - **inactive**. The terminals under the store are blocked from accepting new transactions, but capturing outstanding transactions is still possible. - **closed**. This status is irreversible. The terminals under the store are reassigned to the merchant inventory.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this Store object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.links, store.links) &&
        Objects.equals(this.address, store.address) &&
        Objects.equals(this.businessLineIds, store.businessLineIds) &&
        Objects.equals(this.description, store.description) &&
        Objects.equals(this.externalReferenceId, store.externalReferenceId) &&
        Objects.equals(this.id, store.id) &&
        Objects.equals(this.merchantId, store.merchantId) &&
        Objects.equals(this.phoneNumber, store.phoneNumber) &&
        Objects.equals(this.reference, store.reference) &&
        Objects.equals(this.shopperStatement, store.shopperStatement) &&
        Objects.equals(this.splitConfiguration, store.splitConfiguration) &&
        Objects.equals(this.status, store.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, address, businessLineIds, description, externalReferenceId, id, merchantId, phoneNumber, reference, shopperStatement, splitConfiguration, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    businessLineIds: ").append(toIndentedString(businessLineIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperStatement: ").append(toIndentedString(shopperStatement)).append("\n");
    sb.append("    splitConfiguration: ").append(toIndentedString(splitConfiguration)).append("\n");
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

/**
   * Create an instance of Store given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Store
   * @throws JsonProcessingException if the JSON string is invalid with respect to Store
   */
  public static Store fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Store.class);
  }
/**
  * Convert an instance of Store to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

