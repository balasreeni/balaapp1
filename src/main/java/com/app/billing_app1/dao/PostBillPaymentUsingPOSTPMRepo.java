package com.app.billing_app1.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app1.model.PostBillPaymentUsingPOSTP;
public interface PostBillPaymentUsingPOSTPMRepo extends MongoRepository<PostBillPaymentUsingPOSTP,String>{

}
