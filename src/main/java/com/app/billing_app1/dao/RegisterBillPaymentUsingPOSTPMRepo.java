package com.app.billing_app1.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app1.model.RegisterBillPaymentUsingPOSTP;
public interface RegisterBillPaymentUsingPOSTPMRepo extends MongoRepository<RegisterBillPaymentUsingPOSTP,String>{

}
