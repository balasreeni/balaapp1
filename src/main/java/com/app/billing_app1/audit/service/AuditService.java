package com.app.billing_app1.audit.service;

import org.springframework.stereotype.Service;

import com.app.billing_app1.audit.AuditLog;

@Service
public class AuditService {

	public void execute(AuditLog bean) {
            //TODO: Save the audit data to audit repository
	}
}
