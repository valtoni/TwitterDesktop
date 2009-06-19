package com.github.twitterdesktop.stats.linux;

import com.github.twitterdesktop.stats.Stats;

public abstract class AbstractStats implements Stats {

  public abstract String disk();

  public abstract String memory();

  public abstract String pack();
  
  public String info() {
    return String.format("Disk: %s \nMem: %s \nPackage: %s",
            new Object[] {disk(),
            memory(),
            pack()});
  }

}
