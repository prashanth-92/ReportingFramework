package com.prashanth.reporting.demo;

import com.prashanth.reporting.reader.Reader;

public class DemoReader implements Reader<DemoVO> {

	public DemoVO read() {
		DemoVO demo = new DemoVO();
		demo.id = 5;
		demo.name = "Prashanth";
		return demo;
	}

}
