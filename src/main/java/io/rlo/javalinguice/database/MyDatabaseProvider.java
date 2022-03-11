package io.rlo.javalinguice.database;

import java.util.Map;
import java.util.Optional;

public class MyDatabaseProvider implements IDatabaseProvider {

    Map<String, String> myDatabase = Map.of(
            "key1", "pizza",
            "key2", "soda",
            "key3", "popcorn"
    );

    @Override
    public Optional<String> queryDatabase(String filter) {
        return Optional.ofNullable(myDatabase.get(filter));
    }
}
