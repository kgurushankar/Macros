package com.kgurushankar.utils;

public class SysProperties {

	public String ListAllSysProperties() {
		String a = System.getProperties().toString().replaceAll(", ", "\n");
		return a.substring(1, a.length() - 1);
	}

	public static String getProperty(String name) {
		return System.getProperty(name);
	}

	public String OSName() {
		return System.getProperty("os.name");
	}

	public static void main(String[] args) {
		SysProperties temp = new SysProperties();
		System.out.println(temp.ListAllSysProperties());
	}
}
