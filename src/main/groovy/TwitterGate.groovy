import com.github.twitterdesktop.stats.linux.FirefoxStatsimport twitter4j.Twitter

println "TwitterGate"

twitter = new Twitter("javaltoni", "")status = twitter.updateStatus(new FirefoxStats().info())println "Status alterado para " + status.text