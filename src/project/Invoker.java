
package project;

/**
 *
 
 */
public class Invoker {
    /* Tema değiştirmek için kullanılan decorator pattern'deki invoker görevini üstlenen class
     Command fonksiyonunu çalıştırır.
    */
    public  Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void execute(){
	this.command.execute();
	}
}
