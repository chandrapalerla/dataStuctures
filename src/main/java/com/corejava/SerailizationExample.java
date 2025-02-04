package com.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerailizationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		StudentAddress s1 = new StudentAddress();
		File f = new File("demo.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		
		//File f1 = new File("demo.ser"); 2. Use CatchedRowSetImpl class which is provided by Sun :
		StudentAddress s2 = new StudentAddress();
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		s2 = (StudentAddress)ois.readObject();
		
		System.out.println("id:::"+s2.studentId+"....." +"name:::::"+s2.StudentName+"..."+""
				+ "pwd:::::"+s2.StudentPwd+"......"+"StudentAddress:::::" +s2.studentAdd);
		

	}

}
