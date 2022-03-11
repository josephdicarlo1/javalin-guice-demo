package io.rlo.javalinguice.controllers;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import io.javalin.core.plugin.Plugin;

public class ControllerModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder.newSetBinder(binder(), Plugin.class)
                .addBinding()
                .to(MyController.class);
    }
}
