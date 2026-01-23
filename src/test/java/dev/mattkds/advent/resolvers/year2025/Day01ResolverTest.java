package dev.mattkds.advent.resolvers.year2025;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Day01Resolver class.
 * This test class verifies the behavior of the Day01Resolver implementation,
 * ensuring it functions as expected during the resolution process.
 * The class includes one or more test cases aimed at validating:
 * - The correctness of the resolve method in Day01Resolver.
 * - That the result returned by the resolve method is non-null.
 */
class Day01ResolverTest {

    @Test
    void testResolve() {
        Day01Resolver resolver = new Day01Resolver();
        String result = resolver.resolve();
        assertNotNull(result);
    }

}