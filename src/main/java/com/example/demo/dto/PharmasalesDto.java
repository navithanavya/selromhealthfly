package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class PharmasalesDto {

	private int noOfbills;
	private int cash;
	private int card;
	private int upi;
	private int insurance;
	private int others;
	private int total;
	private int expiry;
	private int shortexpiry;
	@Override
	public String toString() {
		return "PharmasalesDto [noOfBills=" + noOfbills + ", cash=" + cash + ", card=" + card + ", upi=" + upi
				+ ", insurance=" + insurance + ", others=" + others + ", total=" + total + ", expiry=" + expiry
				+ ", shortexpiry=" + shortexpiry + "]";
	}
	public PharmasalesDto() {
		super();
	}
	public PharmasalesDto(int noOfBills, int cash, int card, int upi, int insurance, int others, int total, int expiry,
			int shortexpiry) {
		super();
		this.noOfbills = noOfbills;
		this.cash = cash;
		this.card = card;
		this.upi = upi;
		this.insurance = insurance;
		this.others = others;
		this.total = total;
		this.expiry = expiry;
		this.shortexpiry = shortexpiry;
	}
	public int getNoOfBills() {
		return noOfbills;
	}
	public void setNoOfBills(int noOfBills) {
		this.noOfbills = noOfBills;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public int getUpi() {
		return upi;
	}
	public void setUpi(int upi) {
		this.upi = upi;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	public int getShortexpiry() {
		return shortexpiry;
	}
	public void setShortexpiry(int shortexpiry) {
		this.shortexpiry = shortexpiry;
	}
	
}
