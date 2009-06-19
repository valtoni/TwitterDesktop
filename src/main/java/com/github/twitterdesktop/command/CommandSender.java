package com.github.twitterdesktop.command;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CommandSender {

  public static final String execute(String command) {
    byte[] lido;
    try {
      ByteArrayInputStream is = (ByteArrayInputStream) Runtime.getRuntime().exec(command).getInputStream();
      lido = new byte[is.available()];
      return new String(lido);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
  }
  
}
