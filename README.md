# 🎄Advent of Code

A Java-based solution framework for [Advent of Code](https://adventofcode.com/) challenges, built with Spring Boot.

## Overview

This project provides a structured approach to solving Advent of Code puzzles using a resolver pattern. Each day's
challenge is implemented as a separate `Resolver` class that extends the base `Resolver` abstract class.

## Project Structure

The project is organized into the following components:
- `src/main/java/dev/mattkds/advent/resolvers`: Contains the resolver classes for each day's challenge.
- `src/test/java/dev/mattkds/advent/resolvers`: Includes unit tests for the resolver classes.
- `README.md`: Provides an overview of the project and its structure.

## Getting Started

To get started with this project, follow these steps:
1. Clone the repository: `git clone https://github.com/mattkds/advent-of-code.git`
2. Navigate to the project directory: `cd advent-of-code`
3. Build and run the application: `./mvnw spring-boot:run`
4. Explore the resolver classes in `src/main/java/dev/mattkds/advent/resolvers` and write your own solutions.
5. Run unit tests to verify your implementations: `./mvnw test`

## Adding New Resolvers

To add a new resolver for a specific day's challenge:
1. Create a new class in the `dev.mattkds.advent.resolvers` package.
2. Extend the base `Resolver` abstract class.
3. Implement the required methods to solve the challenge.
4. Write unit tests for your resolver in the corresponding test package.