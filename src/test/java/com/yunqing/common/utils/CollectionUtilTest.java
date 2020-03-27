package com.yunqing.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testHasValue() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("aaa");
		boolean b = CollectionUtil.hasValue(list);
		System.out.println(b);
	}

}
