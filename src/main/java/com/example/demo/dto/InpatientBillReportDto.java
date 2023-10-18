package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@ToString
@Builder
public class InpatientBillReportDto {
	private int noOfBills;
	private int cash;
	private int card;
	private int upi;
	private int insurance;
	private int others;
	private int total;
	@Override
	public String toString() {
		return "InpatientBillReportDto [noOfBills=" + noOfBills + ", cash=" + cash + ", card=" + card + ", upi=" + upi
				+ ", insurance=" + insurance + ", others=" + others + ", total=" + total + "]";
	}
	public InpatientBillReportDto() {
		super();
	}
	public InpatientBillReportDto(int noOfBills, int cash, int card, int upi, int insurance, int others, int total) {
		super();
		this.noOfBills = noOfBills;
		this.cash = cash;
		this.card = card;
		this.upi = upi;
		this.insurance = insurance;
		this.others = others;
		this.total = total;
	}
	public int getNoOfBills() {
		return noOfBills;
	}
	public void setNoOfBills(int noOfBills) {
		this.noOfBills = noOfBills;
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
	
}
