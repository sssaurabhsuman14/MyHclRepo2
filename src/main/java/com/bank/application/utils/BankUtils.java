package com.bank.application.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BankUtils<T> {

	public static List<Object> copyProperties(List<Object> fromObjectList) {

		List<Object> toObjectList = new ArrayList<Object>();
		
		Class<Object> clazz = Object.class;
		

		Object toObj = new Object();
		for (Object fromObj : fromObjectList) {
			Class fromClazz = fromObj.getClass();
			
			fromClazz.get
			BeanUtils.copyProperties(fromObj, toObj);
			toObjectList.add(toObj);
			
		}

		return toObjectList;
	}

}
