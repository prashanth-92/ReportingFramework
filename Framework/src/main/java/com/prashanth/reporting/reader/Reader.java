package com.prashanth.reporting.reader;

/**
 * @author Prashanth
 *
 * @param <Type>
 */
public interface Reader<Type> {
	/**
	 * @return Type
	 */
	public Type read();
}
