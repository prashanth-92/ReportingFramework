package com.prashanth.reporting.generator;

import com.prashanth.reporting.listener.Listener;
import com.prashanth.reporting.processor.Processor;
import com.prashanth.reporting.reader.Reader;
import com.prashanth.reporting.writer.Writer;

/**
 * @author Prashanth
 * Built in builder pattern
 *
 * @param <Type>
 */
public class ReportBuilder<Type> extends ReportExecutor<Type> {
	ReportExecutor<Type> reportExecutor;
	
	public ReportBuilder() {
		reportExecutor = new ReportExecutor<Type>();
	}
	
	public ReportBuilder<Type> listen(Listener<Type> listener){
		reportExecutor.listener = listener;
		return this;
	}
	
	public ReportBuilder<Type> read(Reader<Type> reader){
		reportExecutor.reader = reader;
		return this;
	}
	
	public ReportBuilder<Type> process(Processor<Type> processor){
		reportExecutor.processor = processor;
		return this;
	}
	
	public ReportBuilder<Type> writer(Writer<Type> writer){
		reportExecutor.writer = writer;
		return this;
	}
	
	public ReportExecutor<Type> build(){
		return reportExecutor;
	}
}
