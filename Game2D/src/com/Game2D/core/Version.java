package com.Game2D.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Version {

	public static final String VERSION = "";
	public static final String REMOTE_FILE = "";
	
	public void versionCheck() {
		try {
		
			String loc = REMOTE_FILE;
			HttpURLConnection conn = null;
			while(loc != null && !loc.isEmpty()) {
				URL url = new URL(loc);
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestProperty("User-Agent",
						"Mozilla/5.0 (Windows; U; Windows NT 6.0; ru; rv:1.9.0.11) Gecko/2009060215 Firefox/3.0.11 (.NET CLR 3.5.30729)");
				conn.connect();
				loc = conn.getHeaderField("Location");
			}
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				if(line.startsWith(VERSION)) {
					//Then this is the correct version
				} else {
					//Then this is not the correct version
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
	}
	
}
