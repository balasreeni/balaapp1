package com.app.billing_app1.services.impl;

import java.util.*;

import com.app.billing_app1.model.*;

import com.app.billing_app1.dao.*;
import com.app.billing_app1.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class GetBillPayEligibleAccountsUsingGETImpl implements GetBillPayEligibleAccountsUsingGETI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public GetBillPayEligibleAccountsUsingGETResponseWrapper execute(GetBillPayEligibleAccountsUsingGETP pojo){
		//TODO
		return new GetBillPayEligibleAccountsUsingGETResponseWrapper();
	}

	public GetBillPayEligibleAccountsUsingGETResponseWrapper reliable(GetBillPayEligibleAccountsUsingGETP pojo){
		//TODO
		return new GetBillPayEligibleAccountsUsingGETResponseWrapper();
	}
}