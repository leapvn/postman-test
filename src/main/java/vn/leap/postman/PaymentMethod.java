package vn.leap.postman;

import java.math.BigDecimal;

public class PaymentMethod {
	private Long id;
	private String name;
	private String paymentCode;
	private BigDecimal percentFee;
	private BigDecimal fixedFee;
	private BigDecimal smsFee;
	private Boolean enabled;
	private String bankOrCcCode;

	public PaymentMethod() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public BigDecimal getPercentFee() {
		return percentFee;
	}

	public void setPercentFee(BigDecimal percentFee) {
		this.percentFee = percentFee;
	}

	public BigDecimal getFixedFee() {
		return fixedFee;
	}

	public void setFixedFee(BigDecimal fixedFee) {
		this.fixedFee = fixedFee;
	}

	public BigDecimal getSmsFee() {
		return smsFee;
	}

	public void setSmsFee(BigDecimal smsFee) {
		this.smsFee = smsFee;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getBankOrCcCode() {
		return bankOrCcCode;
	}

	public void setBankOrCcCode(String bankOrCcCode) {
		this.bankOrCcCode = bankOrCcCode;
	}
}
