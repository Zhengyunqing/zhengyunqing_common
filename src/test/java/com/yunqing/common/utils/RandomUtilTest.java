package com.yunqing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		RandomUtil.random(5, 7);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1,10,3);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(3);
	}

}
