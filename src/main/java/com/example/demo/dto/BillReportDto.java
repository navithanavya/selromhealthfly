package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BillReportDto {
	private int noOfBills;
	private int cash;
	private int card;
	private int upi;
	private int insurance;
	private int others;
	private int total;
	

}
