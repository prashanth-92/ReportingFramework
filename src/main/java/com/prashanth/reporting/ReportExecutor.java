package com.prashanth.reporting;

import com.prashanth.reporting.listener.Listener;
import com.prashanth.reporting.processor.Processor;
import com.prashanth.reporting.reader.Reader;
import com.prashanth.reporting.writer.Writer;

/**
 * @author Prashanth
 *
 * @param <Type>
 */
public class ReportExecutor<Type> {
	Type data = null;
	Reader<Type> reader;
	Processor<Type> processor;
	Writer<Type> writer;
	Listener<Type> listener;
	
	public void report(){
		if(null!=listener)
			listener.before();
		if(null!=reader)
			data = reader.read();
		if(null!=processor)
			data = processor.process(data);
		if(null!=writer)
			writer.write(data);
		if(null!=listener)
			listener.after();
	}
	
}
