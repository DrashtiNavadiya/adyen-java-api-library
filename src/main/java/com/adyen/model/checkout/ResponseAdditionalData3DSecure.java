/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * ResponseAdditionalData3DSecure
 */
@JsonPropertyOrder({
  ResponseAdditionalData3DSecure.JSON_PROPERTY_CARD_HOLDER_INFO,
  ResponseAdditionalData3DSecure.JSON_PROPERTY_CAVV,
  ResponseAdditionalData3DSecure.JSON_PROPERTY_CAVV_ALGORITHM,
  ResponseAdditionalData3DSecure.JSON_PROPERTY_SCA_EXEMPTION_REQUESTED,
  ResponseAdditionalData3DSecure.JSON_PROPERTY_THREEDS2_CARD_ENROLLED
})

public class ResponseAdditionalData3DSecure {
  public static final String JSON_PROPERTY_CARD_HOLDER_INFO = "cardHolderInfo";
  private String cardHolderInfo;

  public static final String JSON_PROPERTY_CAVV = "cavv";
  private String cavv;

  public static final String JSON_PROPERTY_CAVV_ALGORITHM = "cavvAlgorithm";
  private String cavvAlgorithm;

  public static final String JSON_PROPERTY_SCA_EXEMPTION_REQUESTED = "scaExemptionRequested";
  private String scaExemptionRequested;

  public static final String JSON_PROPERTY_THREEDS2_CARD_ENROLLED = "threeds2.cardEnrolled";
  private Boolean threeds2CardEnrolled;

  public ResponseAdditionalData3DSecure() { 
  }

  public ResponseAdditionalData3DSecure cardHolderInfo(String cardHolderInfo) {
    this.cardHolderInfo = cardHolderInfo;
    return this;
  }

   /**
   * Information provided by the issuer to the cardholder. If this field is present, you need to display this information to the cardholder. 
   * @return cardHolderInfo
  **/
  @ApiModelProperty(value = "Information provided by the issuer to the cardholder. If this field is present, you need to display this information to the cardholder. ")
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardHolderInfo() {
    return cardHolderInfo;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolderInfo(String cardHolderInfo) {
    this.cardHolderInfo = cardHolderInfo;
  }


  public ResponseAdditionalData3DSecure cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * The Cardholder Authentication Verification Value (CAVV) for the 3D Secure authentication session, as a Base64-encoded 20-byte array.
   * @return cavv
  **/
  @ApiModelProperty(value = "The Cardholder Authentication Verification Value (CAVV) for the 3D Secure authentication session, as a Base64-encoded 20-byte array.")
  @JsonProperty(JSON_PROPERTY_CAVV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCavv() {
    return cavv;
  }


  @JsonProperty(JSON_PROPERTY_CAVV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ResponseAdditionalData3DSecure cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * The CAVV algorithm used.
   * @return cavvAlgorithm
  **/
  @ApiModelProperty(value = "The CAVV algorithm used.")
  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ResponseAdditionalData3DSecure scaExemptionRequested(String scaExemptionRequested) {
    this.scaExemptionRequested = scaExemptionRequested;
    return this;
  }

   /**
   * Shows the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that Adyen requested for the payment.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** 
   * @return scaExemptionRequested
  **/
  @ApiModelProperty(value = "Shows the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that Adyen requested for the payment.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** ")
  @JsonProperty(JSON_PROPERTY_SCA_EXEMPTION_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScaExemptionRequested() {
    return scaExemptionRequested;
  }


  @JsonProperty(JSON_PROPERTY_SCA_EXEMPTION_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScaExemptionRequested(String scaExemptionRequested) {
    this.scaExemptionRequested = scaExemptionRequested;
  }


  public ResponseAdditionalData3DSecure threeds2CardEnrolled(Boolean threeds2CardEnrolled) {
    this.threeds2CardEnrolled = threeds2CardEnrolled;
    return this;
  }

   /**
   * Indicates whether a card is enrolled for 3D Secure 2.
   * @return threeds2CardEnrolled
  **/
  @ApiModelProperty(value = "Indicates whether a card is enrolled for 3D Secure 2.")
  @JsonProperty(JSON_PROPERTY_THREEDS2_CARD_ENROLLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThreeds2CardEnrolled() {
    return threeds2CardEnrolled;
  }


  @JsonProperty(JSON_PROPERTY_THREEDS2_CARD_ENROLLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeds2CardEnrolled(Boolean threeds2CardEnrolled) {
    this.threeds2CardEnrolled = threeds2CardEnrolled;
  }


  /**
   * Return true if this ResponseAdditionalData3DSecure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalData3DSecure responseAdditionalData3DSecure = (ResponseAdditionalData3DSecure) o;
    return Objects.equals(this.cardHolderInfo, responseAdditionalData3DSecure.cardHolderInfo) &&
        Objects.equals(this.cavv, responseAdditionalData3DSecure.cavv) &&
        Objects.equals(this.cavvAlgorithm, responseAdditionalData3DSecure.cavvAlgorithm) &&
        Objects.equals(this.scaExemptionRequested, responseAdditionalData3DSecure.scaExemptionRequested) &&
        Objects.equals(this.threeds2CardEnrolled, responseAdditionalData3DSecure.threeds2CardEnrolled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderInfo, cavv, cavvAlgorithm, scaExemptionRequested, threeds2CardEnrolled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalData3DSecure {\n");
    sb.append("    cardHolderInfo: ").append(toIndentedString(cardHolderInfo)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    scaExemptionRequested: ").append(toIndentedString(scaExemptionRequested)).append("\n");
    sb.append("    threeds2CardEnrolled: ").append(toIndentedString(threeds2CardEnrolled)).append("\n");
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
   * Create an instance of ResponseAdditionalData3DSecure given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseAdditionalData3DSecure
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResponseAdditionalData3DSecure
   */
  public static ResponseAdditionalData3DSecure fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResponseAdditionalData3DSecure.class);
  }
/**
  * Convert an instance of ResponseAdditionalData3DSecure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

