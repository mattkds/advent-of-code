package dev.mattkds.advent.resolvers;

/**
 * Represents an abstract base class for implementing a Resolver.
 * A Resolver processes specific tasks and returns a string-based result
 * after applying some resolution logic.
 * Subclasses must provide a concrete implementation of the abstract
 * resolve method to define task-specific behavior.
 */
public abstract class Resolver {

    private final String name;
    private String result;

    protected Resolver(String name) {
        this.name = name;
    }

    /**
     * Executes the resolution logic defined by the concrete subclass.
     * This method must be implemented by subclasses to provide the specific
     * resolution behavior for a given task or context.
     *
     * @return a string representing the result of the resolution process
     */
    public abstract String resolve();

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
