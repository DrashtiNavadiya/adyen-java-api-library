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
 * CancelOrderResponse
 */
@JsonPropertyOrder({
  CancelOrderResponse.JSON_PROPERTY_PSP_REFERENCE,
  CancelOrderResponse.JSON_PROPERTY_RESULT_CODE
})

public class CancelOrderResponse {
  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  /**
   * The result of the cancellation request.  Possible values:  * **Received** – Indicates the cancellation has successfully been received by Adyen, and will be processed.
   */
  public enum ResultCodeEnum {
    RECEIVED("Received");

    private String value;

    ResultCodeEnum(String value) {
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
    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private ResultCodeEnum resultCode;

  public CancelOrderResponse() { 
  }

  public CancelOrderResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * A unique reference of the cancellation request.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "A unique reference of the cancellation request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public CancelOrderResponse resultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the cancellation request.  Possible values:  * **Received** – Indicates the cancellation has successfully been received by Adyen, and will be processed.
   * @return resultCode
  **/
  @ApiModelProperty(required = true, value = "The result of the cancellation request.  Possible values:  * **Received** – Indicates the cancellation has successfully been received by Adyen, and will be processed.")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  /**
   * Return true if this CancelOrderResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelOrderResponse cancelOrderResponse = (CancelOrderResponse) o;
    return Objects.equals(this.pspReference, cancelOrderResponse.pspReference) &&
        Objects.equals(this.resultCode, cancelOrderResponse.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pspReference, resultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelOrderResponse {\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
   * Create an instance of CancelOrderResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CancelOrderResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CancelOrderResponse
   */
  public static CancelOrderResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CancelOrderResponse.class);
  }
/**
  * Convert an instance of CancelOrderResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

