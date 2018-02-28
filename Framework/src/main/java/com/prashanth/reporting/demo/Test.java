package com.prashanth.reporting.demo;

import com.prashanth.reporting.generator.ReportBuilder;

/**
 * @author Prashanth
 *
 */
public class Test {
	public static void main(String[] args) {
		ReportBuilder<DemoVO> builder = new ReportBuilder<DemoVO>();
		builder.read(new DemoReader())
				.process(new DemoProcessor())
				.listen(new DemoListener())
				.writer(new DemoWriter())
				.build()
				.report();
	}
}
