package com.github.twitterdesktop.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandSenderTest {

  @Test
  public void testExecute() {
    String lista = CommandSender.execute("ls -la", false);
    System.out.println(lista);
    assertNotNull(lista);
  }

}
