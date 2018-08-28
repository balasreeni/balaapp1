package com.app.billing_app1.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.billing_app1.model.GetPayeeListUsingGETP;
public interface GetPayeeListUsingGETPMRepo extends MongoRepository<GetPayeeListUsingGETP,String>{

}
