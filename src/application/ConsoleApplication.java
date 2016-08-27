package application;

import commands.Command;
import commands.CommandFactory;

import java.util.Collection;
import java.util.Scanner;

abstract class ConsoleApplication {

    protected Scanner scanner = new Scanner(System.in);

    public void run() {
        while(true) {
            printMenu();
            String cmd = getCommand();
            if(cmd.equals("quit"))
                return;
            execute(cmd);
        }
    }

    private void printMenu() {
        Collection<String> menuItems = menuItems();
        for(String item : menuItems)
            System.out.println(item);
    }

    public String getCommand() {
        return scanner.nextLine();
    }

    private void execute(String cmd) {
        CommandFactory commandFactory = commandFactory();
        Command command = commandFactory.createCommand(cmd);
        command.execute();
    }

    protected abstract CommandFactory commandFactory();

    protected abstract Collection<String> menuItems();
}
