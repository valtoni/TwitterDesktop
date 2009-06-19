import twitter4j.Twitter

println "TwitterGate"

twitter = new Twitter("javaltoni", "")status = twitter.updateStatus("Um post do groovy! Muito legal. Tempo: " + new Date())println "Status alterado para " + status.text