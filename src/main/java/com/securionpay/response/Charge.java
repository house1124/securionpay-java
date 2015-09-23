package com.securionpay.response;

import static com.securionpay.util.SecurionPayUtils.toStringNullSafe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.securionpay.enums.ErrorCode;

public class Charge {

	private String id;
	private Long created;
	private Integer amount;
	private String currency;
	private String description;
	private Card card;
	private String customerId;
	private String subscriptionId;
	private Boolean captured;
	private Boolean refunded;
	private List<Refund> refunds;
	private Boolean disputed;
	private FraudDetails fraudDetails;

	private FromCrossSale fromCrossSale;
	private List<WithCrossSale> withCrossSales;

	private Map<String, String> metadata;

	private ErrorCode failureCode;
	private String failureMessage;

	@JsonIgnore
	private Map<String, Object> other = new HashMap<String, Object>();

	public String getId() {
		return id;
	}

	public Long getCreated() {
		return created;
	}

	public Integer getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public String getDescription() {
		return description;
	}

	public Card getCard() {
		return card;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public Boolean getCaptured() {
		return captured;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public List<Refund> getRefunds() {
		return refunds;
	}

	public Boolean getDisputed() {
		return disputed;
	}

	public FraudDetails getFraudDetails() {
		return fraudDetails;
	}

	public FromCrossSale getFromCrossSale() {
		return fromCrossSale;
	}

	public List<WithCrossSale> getWithCrossSales() {
		return withCrossSales;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

	public ErrorCode getFailureCode() {
		return failureCode;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public String get(String name) {
		return toStringNullSafe(other.get(name));
	}

	@JsonAnySetter
	private void set(String name, Object value) {
		other.put(name, value);
	}

	public static class FromCrossSale {
		private String offerId;
		private String partnerId;

		@JsonIgnore
		private Map<String, Object> other = new HashMap<String, Object>();

		public String getOfferId() {
			return offerId;
		}

		public String getPartnerId() {
			return partnerId;
		}

		public String get(String name) {
			return toStringNullSafe(other.get(name));
		}

		@JsonAnySetter
		private void set(String name, Object value) {
			other.put(name, value);
		}
	}

	public static class WithCrossSale {
		private String offerId;
		private String partnerId;

		private String chargeId;
		private Integer amount;
		private String currency;

		@JsonIgnore
		private Map<String, Object> other = new HashMap<String, Object>();

		public String getOfferId() {
			return offerId;
		}

		public String getPartnerId() {
			return partnerId;
		}

		public String getChargeId() {
			return chargeId;
		}

		public Integer getAmount() {
			return amount;
		}

		public String getCurrency() {
			return currency;
		}

		public String get(String name) {
			return toStringNullSafe(other.get(name));
		}

		@JsonAnySetter
		private void set(String name, Object value) {
			other.put(name, value);
		}
	}
}
