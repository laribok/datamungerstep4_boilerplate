package com.stackroute.datamunger.query;

import java.util.Arrays;

public class DataTypeDefinitions {

	/*
	 * This class should contain a member variable which is a String array, to hold
	 * the data type for all columns for all data types and should override
	 * toString() method as well.
	 */
	private String[] dataTypes;

	public String[] getDataTypes() {
		return dataTypes;
	}

	public void setDataTypes(String[] dataTypes) {
		this.dataTypes = dataTypes;
	}

	@Override
	public String toString() {
		return "DataTypeDefinitions{" +
				"dataTypes=" + Arrays.toString(dataTypes) +
				'}';
	}
}
