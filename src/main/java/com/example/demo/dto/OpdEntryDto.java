package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class OpdEntryDto {
 private String newpatients;
 private String reviewpatients;
 private String patientsin;
 private String patientsout;
 private String waiting;
 private int total;
@Override
public String toString() {
	return "OpdEntryDto [newpatients=" + newpatients + ", reviewpatients=" + reviewpatients + ", patientsin="
			+ patientsin + ", patientsout=" + patientsout + ", waiting=" + waiting + ", total=" + total + "]";
}
public OpdEntryDto() {
	super();
}
public OpdEntryDto(String newpatients, String reviewpatients, String patientsin, String patientsout, String waiting,
		int total) {
	super();
	this.newpatients = newpatients;
	this.reviewpatients = reviewpatients;
	this.patientsin = patientsin;
	this.patientsout = patientsout;
	this.waiting = waiting;
	this.total = total;
}
public String getNewpatients() {
	return newpatients;
}
public void setNewpatients(String newpatients) {
	this.newpatients = newpatients;
}
public String getReviewpatients() {
	return reviewpatients;
}
public void setReviewpatients(String reviewpatients) {
	this.reviewpatients = reviewpatients;
}
public String getPatientsin() {
	return patientsin;
}
public void setPatientsin(String patientsin) {
	this.patientsin = patientsin;
}
public String getPatientsout() {
	return patientsout;
}
public void setPatientsout(String patientsout) {
	this.patientsout = patientsout;
}
public String getWaiting() {
	return waiting;
}
public void setWaiting(String waiting) {
	this.waiting = waiting;
}
public int getTotal() {
	return total;
}
public void setTotal(int Total) {
	this.total = Total;
}
 

}
