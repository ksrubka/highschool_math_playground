package commands;

public class UnknownCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Sorry, I don't understand ;(");
    }
}
