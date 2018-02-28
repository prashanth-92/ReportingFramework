package com.prashanth.reporting.demo;

import com.prashanth.reporting.writer.Writer;

public class DemoWriter implements Writer<DemoVO>{

	public void write(DemoVO data) {
		System.out.println(data);
	}

}
