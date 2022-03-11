package io.rlo.javalinguice.database;

import java.util.Optional;

public interface IDatabaseProvider {
    Optional<String> queryDatabase(String filter);
}
