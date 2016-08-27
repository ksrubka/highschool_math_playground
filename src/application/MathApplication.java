package application;

import com.google.common.collect.Lists;

import commands.CommandFactory;

import java.util.Collection;

public class MathApplication extends ConsoleApplication {

    @Override
    protected CommandFactory commandFactory() {
        return new MathApplicatonCommandFactory();
    }

    @Override
    protected Collection<String> menuItems() {
        return Lists.newArrayList(
                "1. Solve quadratic equation",
                "2. Calculate Sine",
                "3. Calculate cosine",
                "4. Calculate 2 squared"
        );
    }

    public static void main(String[] args) {
        new MathApplication().run();
    }
}
