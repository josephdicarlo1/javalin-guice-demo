package io.rlo.javalinguice.controllers;

import io.javalin.Javalin;
import io.javalin.core.plugin.Plugin;
import io.javalin.http.NotFoundResponse;
import io.rlo.javalinguice.database.IDatabaseProvider;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class MyController implements Plugin {

    private final IDatabaseProvider database;

    @Inject
    public MyController(IDatabaseProvider database) {
        this.database = database;
    }

    @Override
    public void apply(@NotNull Javalin app) {
        app.get("/snacks/{key}", ctx -> {
            var snack = database.queryDatabase(ctx.pathParam("key"));
            ctx.result(snack.orElseThrow(() -> new NotFoundResponse("Snack not found :(")));
        });
    }
}
