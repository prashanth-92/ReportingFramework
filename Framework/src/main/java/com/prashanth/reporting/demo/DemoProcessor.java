package com.prashanth.reporting.demo;

import com.prashanth.reporting.processor.Processor;

public class DemoProcessor implements Processor<DemoVO> {

	public DemoVO process(DemoVO data) {
		data.id++;
		return data;
	}

}
