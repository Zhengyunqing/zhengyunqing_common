package com.yunqing.common.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadFile2List() throws IOException {
		//获取资源  并且转换成流
		InputStream in = this.getClass().getResourceAsStream("/data.txt");
		List<String> list = StreamUtil.readFile2List(in);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
