package com.prashanth.reporting.writer;

/**
 * @author Prashanth
 *
 * @param <Type>
 */
public interface Writer<Type> {
	/**
	 * @return Type
	 */
	public void write(Type data);
}
