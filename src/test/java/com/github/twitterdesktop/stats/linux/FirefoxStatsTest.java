package com.github.twitterdesktop.stats.linux;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirefoxStatsTest {

  @Test
  public void testInfo() {
    String infoFirefox = new FirefoxStats().info();
    assertNotNull(infoFirefox);
    System.out.println(infoFirefox);
  }

}
