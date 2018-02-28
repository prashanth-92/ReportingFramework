package com.prashanth.reporting.demo;

import com.prashanth.reporting.listener.Listener;

public class DemoListener implements Listener<DemoVO> {

	public void before() {
		System.out.println("in---before");
	}

	public void after() {
		System.out.println("in---after");
	}

}
