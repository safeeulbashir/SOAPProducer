package com.concretepage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.concretepage.soap.GetEmployeeRequest;
import com.concretepage.soap.GetEmployeeResponse;
import com.concretepage.soap.Student;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://concretepage.com/soap";
	private Student student= new Student();

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getCountry(@RequestPayload GetEmployeeRequest request) {
		GetEmployeeResponse response = new GetEmployeeResponse();
		student.setAmount(request.getAmount());
		student.setAnualSalary(request.getAnualSalary());
		student.setDob(request.getDob());
		if (calculateAge(student.getDob()) < 20) {
			response.setEligibilityCode(0);
			response.setEligibilityMessage("No");
		} else if ((calculateAge(student.getDob()) >= 25 && (calculateAge(student.getDob()) <= 30))
				&& request.getAnualSalary() > 60000 && request.getAmount() < 20000) {
			response.setEligibilityCode(1);
			response.setEligibilityMessage("Yes");
		} else if ((calculateAge(student.getDob()) >= 30 && (calculateAge(student.getDob()) <= 50))
				&& request.getAnualSalary() > 100000 && request.getAmount() < 50000) {
			response.setEligibilityCode(1);
			response.setEligibilityMessage("Yes");
		} else {
			response.setEligibilityCode(0);
			response.setEligibilityMessage("No");
		}

		return response;
	}

	private int calculateAge(String dob) {
		String sDate1 = dob;
		try {
			Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
			LocalDate now = LocalDate.of(2017, Month.OCTOBER, 20);
			LocalDate localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			Period period = Period.between(localDate, now);
			return period.getYears();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
