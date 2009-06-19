package com.github.twitterdesktop.stats.linux;

import com.github.twitterdesktop.command.CommandSender;
import com.github.twitterdesktop.stats.Stats;

public class FirefoxStats implements Stats {

  public String disk() {
    return CommandSender.execute("atop -d 1 1 | grep 'eclipse'");
  }

  public String memory() {
    return CommandSender.execute()
  }

  
  
}
