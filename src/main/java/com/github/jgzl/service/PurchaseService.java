package com.github.jgzl.service;

import java.util.Map;

import com.github.jgzl.po.PurchaseApply;
import org.activiti.engine.runtime.ProcessInstance;

public interface PurchaseService {
	public ProcessInstance startWorkflow(PurchaseApply apply, String userid, Map<String,Object> variables);
	PurchaseApply getPurchase(int id);
	void updatePurchase(PurchaseApply a);
}
