package io.rlo.javalinguice;

import com.google.inject.Guice;
import io.rlo.javalinguice.controllers.ControllerModule;
import io.rlo.javalinguice.database.DatabaseModule;

public class Main {

    public static void main(String[] args) {
        var injector = Guice.createInjector(
                new DatabaseModule(),
                new ControllerModule()
        );

        var container = injector.getInstance(JavalinContainer.class);

        Runtime.getRuntime().addShutdownHook(new Thread(container::stop));
    }

}
