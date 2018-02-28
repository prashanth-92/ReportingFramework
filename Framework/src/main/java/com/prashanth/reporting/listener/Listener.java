package com.prashanth.reporting.listener;

/**
 * @author Prashanth
 *
 * @param <Type>
 */
public interface Listener<Type> {
	public void before();
	public void after();
}
