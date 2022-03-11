# javalin-guice-demo

This is a simple demo project of how one may use Guice with Javalin.

In this example, I use a [Multibinder](https://github.com/google/guice/wiki/Multibindings) to bind a "controller", which is really a class implementing the Javalin `Plugin` interface.

This controller class asks to be injected with an `IDatabaseProvider` class, which Guice provides as the `MyDatabaseProvider` implementation. 

Finally, the `JavalinContainer` class receives all `Plugin` classes bound by the Multibinder in a set, and registers them on the Javalin instance.

To see the final product in action, simply run the project using `gradle run`, then navigate to `http://localhost:7000/snacks/{key}` where `{key}` is any of `[key1, key2, key3]`, corresponding to the map in the `MyDatabaseProvider` class.

![Project class diagram](/diagram.png)