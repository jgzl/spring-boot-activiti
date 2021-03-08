package com.github.jgzl.mapper;

import com.github.jgzl.po.PurchaseApply;

public interface PurchaseApplyMapper {
	void save(PurchaseApply apply);
	
	PurchaseApply getPurchaseApply(int id);
	
	void updateByPrimaryKeySelective(PurchaseApply apply);
}
