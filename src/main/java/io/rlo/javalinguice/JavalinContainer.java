package io.rlo.javalinguice;

import io.javalin.Javalin;
import io.javalin.core.plugin.Plugin;

import javax.inject.Inject;
import java.util.Set;

public class JavalinContainer {

    private final Javalin app;

    @Inject
    public JavalinContainer(Set<Plugin> controllers) {
        app = Javalin.create(config -> controllers.forEach(config::registerPlugin)).start(7000);
    }

    public void stop() {
        app.stop();
    }

}
