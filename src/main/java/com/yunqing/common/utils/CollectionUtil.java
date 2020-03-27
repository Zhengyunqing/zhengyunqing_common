package com.yunqing.common.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtil {
	//判断集和是否有内容
	public static boolean hasValue(Collection<?> collection) {
		return collection==null &&  collection.size()>0 ;
		 
		
	}
}
