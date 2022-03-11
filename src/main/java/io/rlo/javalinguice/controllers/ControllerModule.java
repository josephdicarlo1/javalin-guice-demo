package io.rlo.javalinguice.controllers;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;
import io.javalin.core.plugin.Plugin;

public class ControllerModule extends AbstractModule {

    private static void bindController(Binder binder, Class<? extends Plugin> pluginClass) {
        Multibinder.newSetBinder(binder, Plugin.class)
                .addBinding()
                .to(pluginClass);
    }

    @Override
    protected void configure() {
        bindController(binder(), MyController.class);
    }
}
