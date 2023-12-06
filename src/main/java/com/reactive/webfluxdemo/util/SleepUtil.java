package com.reactive.webfluxdemo.util;

public class SleepUtil {
	public static void sleepSec(int val) {
		try {
			Thread.sleep(val);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
