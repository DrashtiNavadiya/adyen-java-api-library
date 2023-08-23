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
import com.adyen.model.balanceplatform.TransactionRuleEntityKey;
import com.adyen.model.balanceplatform.TransactionRuleInterval;
import com.adyen.model.balanceplatform.TransactionRuleRestrictions;
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
 * TransactionRule
 */
@JsonPropertyOrder({
  TransactionRule.JSON_PROPERTY_AGGREGATION_LEVEL,
  TransactionRule.JSON_PROPERTY_DESCRIPTION,
  TransactionRule.JSON_PROPERTY_END_DATE,
  TransactionRule.JSON_PROPERTY_ENTITY_KEY,
  TransactionRule.JSON_PROPERTY_ID,
  TransactionRule.JSON_PROPERTY_INTERVAL,
  TransactionRule.JSON_PROPERTY_OUTCOME_TYPE,
  TransactionRule.JSON_PROPERTY_REFERENCE,
  TransactionRule.JSON_PROPERTY_REQUEST_TYPE,
  TransactionRule.JSON_PROPERTY_RULE_RESTRICTIONS,
  TransactionRule.JSON_PROPERTY_SCORE,
  TransactionRule.JSON_PROPERTY_START_DATE,
  TransactionRule.JSON_PROPERTY_STATUS,
  TransactionRule.JSON_PROPERTY_TYPE
})

public class TransactionRule {
  public static final String JSON_PROPERTY_AGGREGATION_LEVEL = "aggregationLevel";
  private String aggregationLevel;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_ENTITY_KEY = "entityKey";
  private TransactionRuleEntityKey entityKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private TransactionRuleInterval interval;

  /**
   * The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
   */
  public enum OutcomeTypeEnum {
    ENFORCESCA("enforceSCA"),
    
    HARDBLOCK("hardBlock"),
    
    SCOREBASED("scoreBased");

    private String value;

    OutcomeTypeEnum(String value) {
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
    public static OutcomeTypeEnum fromValue(String value) {
      for (OutcomeTypeEnum b : OutcomeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTCOME_TYPE = "outcomeType";
  private OutcomeTypeEnum outcomeType;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.
   */
  public enum RequestTypeEnum {
    AUTHENTICATION("authentication"),
    
    AUTHORIZATION("authorization"),
    
    BANKTRANSFER("bankTransfer"),
    
    TOKENIZATION("tokenization");

    private String value;

    RequestTypeEnum(String value) {
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
    public static RequestTypeEnum fromValue(String value) {
      for (RequestTypeEnum b : RequestTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUEST_TYPE = "requestType";
  private RequestTypeEnum requestType;

  public static final String JSON_PROPERTY_RULE_RESTRICTIONS = "ruleRestrictions";
  private TransactionRuleRestrictions ruleRestrictions;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Integer score;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
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

  /**
   * The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
   */
  public enum TypeEnum {
    ALLOWLIST("allowList"),
    
    BLOCKLIST("blockList"),
    
    MAXUSAGE("maxUsage"),
    
    VELOCITY("velocity");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public TransactionRule() { 
  }

  public TransactionRule aggregationLevel(String aggregationLevel) {
    this.aggregationLevel = aggregationLevel;
    return this;
  }

   /**
   * The level at which data must be accumulated, used in rules with &#x60;type&#x60; **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the &#x60;entityKey&#x60;.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**.
   * @return aggregationLevel
  **/
  @ApiModelProperty(value = "The level at which data must be accumulated, used in rules with `type` **velocity** or **maxUsage**. The level must be the [same or lower in hierarchy](https://docs.adyen.com/issuing/transaction-rules#accumulate-data) than the `entityKey`.  If not provided, by default, the rule will accumulate data at the **paymentInstrument** level.  Possible values: **paymentInstrument**, **paymentInstrumentGroup**, **balanceAccount**, **accountHolder**, **balancePlatform**.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAggregationLevel() {
    return aggregationLevel;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationLevel(String aggregationLevel) {
    this.aggregationLevel = aggregationLevel;
  }


  public TransactionRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the transaction rule, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Your description for the transaction rule, maximum 300 characters.")
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


  public TransactionRule endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.
   * @return endDate
  **/
  @ApiModelProperty(value = "The date when the rule will stop being evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided, the rule will be evaluated until the rule status is set to **inactive**.")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TransactionRule entityKey(TransactionRuleEntityKey entityKey) {
    this.entityKey = entityKey;
    return this;
  }

   /**
   * Get entityKey
   * @return entityKey
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRuleEntityKey getEntityKey() {
    return entityKey;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKey(TransactionRuleEntityKey entityKey) {
    this.entityKey = entityKey;
  }


  public TransactionRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the transaction rule.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the transaction rule.")
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


  public TransactionRule interval(TransactionRuleInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRuleInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(TransactionRuleInterval interval) {
    this.interval = interval;
  }


  public TransactionRule outcomeType(OutcomeTypeEnum outcomeType) {
    this.outcomeType = outcomeType;
    return this;
  }

   /**
   * The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the &#x60;score&#x60; you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.
   * @return outcomeType
  **/
  @ApiModelProperty(value = "The [outcome](https://docs.adyen.com/issuing/transaction-rules#outcome) that will be applied when a transaction meets the conditions of the rule. If not provided, by default, this is set to **hardBlock**.  Possible values:   * **hardBlock**: the transaction is declined.  * **scoreBased**: the transaction is assigned the `score` you specified. Adyen calculates the total score and if it exceeds 100, the transaction is declined.")
  @JsonProperty(JSON_PROPERTY_OUTCOME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutcomeTypeEnum getOutcomeType() {
    return outcomeType;
  }


  @JsonProperty(JSON_PROPERTY_OUTCOME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutcomeType(OutcomeTypeEnum outcomeType) {
    this.outcomeType = outcomeType;
  }


  public TransactionRule reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the transaction rule, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "Your reference for the transaction rule, maximum 150 characters.")
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


  public TransactionRule requestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.
   * @return requestType
  **/
  @ApiModelProperty(value = "Indicates the type of request to which the rule applies.  Possible values: **authorization**, **authentication**, **tokenization**.")
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequestTypeEnum getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
  }


  public TransactionRule ruleRestrictions(TransactionRuleRestrictions ruleRestrictions) {
    this.ruleRestrictions = ruleRestrictions;
    return this;
  }

   /**
   * Get ruleRestrictions
   * @return ruleRestrictions
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RULE_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRuleRestrictions getRuleRestrictions() {
    return ruleRestrictions;
  }


  @JsonProperty(JSON_PROPERTY_RULE_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleRestrictions(TransactionRuleRestrictions ruleRestrictions) {
    this.ruleRestrictions = ruleRestrictions;
  }


  public TransactionRule score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when &#x60;outcomeType&#x60; is **scoreBased**.  The value must be between **-100** and **100**.
   * @return score
  **/
  @ApiModelProperty(value = "A positive or negative score applied to the transaction if it meets the conditions of the rule. Required when `outcomeType` is **scoreBased**.  The value must be between **-100** and **100**.")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Integer score) {
    this.score = score;
  }


  public TransactionRule startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the &#x60;startDate&#x60; is set to the date when the rule status is set to **active**.   
   * @return startDate
  **/
  @ApiModelProperty(value = "The date when the rule will start to be evaluated, in ISO 8601 extended offset date-time format. For example, **2020-12-18T10:15:30+01:00**.  If not provided when creating a transaction rule, the `startDate` is set to the date when the rule status is set to **active**.   ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TransactionRule status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction rule. If you provide a &#x60;startDate&#x60; in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the transaction rule. If you provide a `startDate` in the request, the rule is automatically created  with an **active** status.   Possible values: **active**, **inactive**.")
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


  public TransactionRule type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The [type of rule](https://docs.adyen.com/issuing/transaction-rules#rule-types), which defines if a rule blocks transactions based on individual characteristics or accumulates data.  Possible values:  * **blockList**: decline a transaction when the conditions are met.  * **maxUsage**: add the amount or number of transactions for the lifetime of a payment instrument, and then decline a transaction when the specified limits are met.  * **velocity**: add the amount or number of transactions based on a specified time interval, and then decline a transaction when the specified limits are met. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this TransactionRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRule transactionRule = (TransactionRule) o;
    return Objects.equals(this.aggregationLevel, transactionRule.aggregationLevel) &&
        Objects.equals(this.description, transactionRule.description) &&
        Objects.equals(this.endDate, transactionRule.endDate) &&
        Objects.equals(this.entityKey, transactionRule.entityKey) &&
        Objects.equals(this.id, transactionRule.id) &&
        Objects.equals(this.interval, transactionRule.interval) &&
        Objects.equals(this.outcomeType, transactionRule.outcomeType) &&
        Objects.equals(this.reference, transactionRule.reference) &&
        Objects.equals(this.requestType, transactionRule.requestType) &&
        Objects.equals(this.ruleRestrictions, transactionRule.ruleRestrictions) &&
        Objects.equals(this.score, transactionRule.score) &&
        Objects.equals(this.startDate, transactionRule.startDate) &&
        Objects.equals(this.status, transactionRule.status) &&
        Objects.equals(this.type, transactionRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationLevel, description, endDate, entityKey, id, interval, outcomeType, reference, requestType, ruleRestrictions, score, startDate, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRule {\n");
    sb.append("    aggregationLevel: ").append(toIndentedString(aggregationLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    outcomeType: ").append(toIndentedString(outcomeType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    ruleRestrictions: ").append(toIndentedString(ruleRestrictions)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of TransactionRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRule
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionRule
   */
  public static TransactionRule fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionRule.class);
  }
/**
  * Convert an instance of TransactionRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

