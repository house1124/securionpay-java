package com.securionpay.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {

	CHARGE_SUCCEEDED("CHARGE_SUCCEEDED"),
	CHARGE_FAILED("CHARGE_FAILED"),
	CHARGE_UPDATED("CHARGE_UPDATED"),
	CHARGE_CAPTURED("CHARGE_CAPTURED"),
	CHARGE_REFUNDED("CHARGE_REFUNDED"),

	CHARGE_DISPUTE_CREATED("CHARGE_DISPUTE_CREATED"),
	CHARGE_DISPUTE_UPDATED("CHARGE_DISPUTE_UPDATED"),
	CHARGE_DISPUTE_WON("CHARGE_DISPUTE_WON"),
	CHARGE_DISPUTE_LOST("CHARGE_DISPUTE_LOST"),

	CHARGE_DISPUTE_FUNDS_WITHDRAWN("CHARGE_DISPUTE_FUNDS_WITHDRAWN"),
	CHARGE_DISPUTE_FUNDS_RESTORED("CHARGE_DISPUTE_FUNDS_RESTORED"),

	CUSTOMER_CARD_CREATED("CUSTOMER_CARD_CREATED"),
	CUSTOMER_CARD_UPDATED("CUSTOMER_CARD_UPDATED"),
	CUSTOMER_CARD_DELETED("CUSTOMER_CARD_DELETED"),
	CUSTOMER_CREATED("CUSTOMER_CREATED"),
	CUSTOMER_UPDATED("CUSTOMER_UPDATED"),
	CUSTOMER_DELETED("CUSTOMER_DELETED"),
	CUSTOMER_SUBSCRIPTION_CREATED("CUSTOMER_SUBSCRIPTION_CREATED"),
	CUSTOMER_SUBSCRIPTION_UPDATED("CUSTOMER_SUBSCRIPTION_UPDATED"),
	CUSTOMER_SUBSCRIPTION_DELETED("CUSTOMER_SUBSCRIPTION_DELETED"),

	PLAN_CREATED("PLAN_CREATED"),
	PLAN_UPDATED("PLAN_UPDATED"),
	PLAN_DELETED("PLAN_DELETED"),

	CROSS_SALE_OFFER_CREATED("CROSS_SALE_OFFER_CREATED"),
	CROSS_SALE_OFFER_UPDATED("CROSS_SALE_OFFER_UPDATED"),
	CROSS_SALE_OFFER_DELETED("CROSS_SALE_OFFER_DELETED"),

	CREDIT_SUCCEEDED("CREDIT_SUCCEEDED"),
	CREDIT_FAILED("CREDIT_FAILED"),
	CREDIT_UPDATED("CREDIT_UPDATED"),

	FRAUD_WARNING_CREATED("FRAUD_WARNING_CREATED"),
	FRAUD_WARNING_UPDATED("FRAUD_WARNING_UPDATED"),

	PAYOUT_CREATED("PAYOUT_CREATED"),
	PAYOUT_UPDATED("PAYOUT_UPDATED"),
	/**
	 * Used when received value can't be mapped to this enumeration.
	 */
	UNRECOGNIZED("unrecognized");

	private final String value;

	EventType(String value) {
		this.value = value;
	}

	@JsonCreator
	public static EventType fromValue(String value) {
		for (EventType eventType : values()) {
			if (eventType.value.equalsIgnoreCase(value)) {
				return eventType;
			}
		}

		return UNRECOGNIZED;
	}

	@JsonValue
	public String getValue() {
		return value;
	}
}
