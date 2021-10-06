package org.base;

import java.io.File;
import java.io.IOException;

public class Fileoperation {

	public static void main(String[] args)  {
		
	File f = new File("C:\\Users\\Mary");	
	
	//boolean mkdir = f.mkdir();
	
	//System.out.println(mkdir);
	
	//boolean createNewFile = f.createNewFile();
	
	//System.out.println(createNewFile);
	
	//boolean canRead = f.canRead();
	
	//System.out.println(canRead);
	
	//boolean canWrite = f.canWrite();
	//System.out.println(canWrite);
	
	//boolean exists = f.exists();
	//System.out.println(exists);
	
	//boolean file = f.isFile();
	//System.out.println(file);
	
	//boolean directory = f.isDirectory();
	//.System.out.println(directory);
	
	String[] list = f.list();
	System.out.println(list);
	for (String  file: list) {
		System.out.println(file);
		
	}
	
	File[] listFiles = f.listFiles();
	System.out.println(listFiles);
	
	for (File files : listFiles) {
		
		System.out.println(files);
		
	}
	
	}
	
	
	
	
			
		}
	


