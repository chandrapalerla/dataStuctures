package com.corejava;

import java.io.IOException;

public class RunningExeFile {

	public static void main(String[] args) {
		String command = "C:/MagicDraw/bin/magicdraw.exe";
		
		// Running the above command 
        Runtime run  = Runtime.getRuntime(); 
        try {
			Process proc = run.exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
