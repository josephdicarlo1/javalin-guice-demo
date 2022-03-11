package io.rlo.javalinguice.database;

import com.google.inject.AbstractModule;

public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IDatabaseProvider.class).to(MyDatabaseProvider.class);
    }
}
