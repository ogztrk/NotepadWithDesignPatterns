package project;

/**
 *

 */
public class Context {
    // Strategy pattern'ındeki context görevinde kullanılan class.
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public String execute(String word){
        return strategy.changeWord(word);
    }
}
