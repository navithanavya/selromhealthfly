package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class AttendanceDto {
	private int totalstaff;
	private String present;
	private String absent;
	private double percentage;
	@Override
	public String toString() {
		return "AttendanceDto [totalstaff=" + totalstaff + ", present=" + present + ", absent=" + absent
				+ ", percentage=" + percentage + "]";
	}
	public AttendanceDto() {
		super();
	}
	public AttendanceDto(int totalstaff, String present, String absent, double percentage) {
		super();
		this.totalstaff = totalstaff;
		this.present = present;
		this.absent = absent;
		this.percentage = percentage;
	}
	public int getTotalstaff() {
		return totalstaff;
	}
	public void setTotalstaff(int totalstaff) {
		this.totalstaff = totalstaff;
	}
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public String getAbsent() {
		return absent;
	}
	public void setAbsent(String absent) {
		this.absent = absent;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
