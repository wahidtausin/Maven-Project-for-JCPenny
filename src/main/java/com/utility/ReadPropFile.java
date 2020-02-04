package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {
	public static Properties readFile(String path) throws IOException {
		FileInputStream f = new FileInputStream(new File(path));
		Properties proop = new Properties();
		proop.load(f);
		return proop;
	}

}
