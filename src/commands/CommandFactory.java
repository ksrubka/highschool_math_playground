package commands;

public interface CommandFactory {

    Command createCommand(String cmd);
}
