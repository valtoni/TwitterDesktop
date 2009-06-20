package com.github.twitterdesktop.stats.linux;

import java.util.Date;

import com.github.twitterdesktop.command.CommandSender;
import com.github.twitterdesktop.stats.Stats;

public abstract class AbstractStats implements Stats {

  private String processName;
  
  public String disk() {
    return "** not available **"; //CommandSender.execute("atop -d 1 1 | grep '" + processName + "'", false);
  }

  public String memory() {
    return CommandSender.execute("ps waux | grep '" + processName + "'", true);
  }
  
  public String pack() {
    return CommandSender.execute("dpkg -l " + processName + "", false);
  }
  
  protected void setProcessName(String processName) {
    this.processName = processName;
  }
  
  public String info() {
    return String.format("%s stats (on %s): \nDisk: %s \nMem: %s \nPackage: %s",
            new Object[] {processName,
              new Date(),
              disk(),
              memory(),
              pack()});
  }

}
