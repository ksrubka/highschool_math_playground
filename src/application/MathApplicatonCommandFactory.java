package application;

import commands.*;

class MathApplicatonCommandFactory implements CommandFactory {

    @Override
    public Command createCommand(String cmd) {
        switch (cmd) {
            case "1":
                return new QuadraticEquationCommand();
            case "2":
                return new SineCommand();
            case "3":
                return new CosineCommand();
            case "4":
                return new ExponentiationCommand();
            default:
                return new UnknownCommand();
        }
    }
}
