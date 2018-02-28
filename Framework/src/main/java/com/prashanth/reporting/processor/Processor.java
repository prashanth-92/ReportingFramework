package com.prashanth.reporting.processor;

/**
 * @author Prashanth
 *
 * @param <Type>
 */
public interface Processor<Type> {
	/**
	 * @param data
	 * @return Type
	 */
	public Type process(Type data);
}
