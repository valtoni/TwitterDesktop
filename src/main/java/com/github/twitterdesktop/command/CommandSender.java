package com.github.twitterdesktop.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandSender {

  public static final String execute(String command, boolean ignoreError) {
    BufferedReader inErr;
    BufferedReader inOk;
    String ret = "", retFinal = "";
    try {
      Process process = Runtime.getRuntime().exec(command);
      inOk = new BufferedReader(new InputStreamReader(process.getInputStream()));
      inErr = new BufferedReader(new InputStreamReader(process.getInputStream()));
      int signal = process.waitFor();
      if (!ignoreError && signal != 0) {
        System.err.println("Error executing command.");
        System.err.println(inErr);
      }
      else {
        while((ret = inOk.readLine()) != null) {
          retFinal += ret + "\n";
        }
      }
      return retFinal;
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return null;
    }
  }
  
}
