CodeRevisited
=============

Code samples, utils, example code for various problems

[![Build Status](https://travis-ci.org/sureshsajja/CodingProblems.svg?branch=master)](https://travis-ci.org/sureshsajja/CodingProblems)
![Java CI with Gradle](https://github.com/sureshsajja/CodingProblems/workflows/Java%20CI%20with%20Gradle/badge.svg)

## Build Instructions

This project uses Gradle for building and dependency management.

### Prerequisites
- JDK 8 or higher
- No need to install Gradle (uses Gradle Wrapper)

### Building the Project

To compile the project:
```bash
./gradlew clean build
```

To run only compilation:
```bash
./gradlew compileJava
```

To run tests (if any):
```bash
./gradlew test
```

On Windows, use `gradlew.bat` instead of `./gradlew`.

## Continuous Integration

This project uses GitHub Actions for continuous integration. The build automatically runs on:
- Every push to `master` or `main` branches
- Every pull request to `master` or `main` branches

The CI workflow:
1. Checks out the code
2. Sets up JDK 8
3. Makes gradlew executable
4. Compiles the project using Gradle
5. Runs tests (if any exist)

You can view the build status and history in the [Actions tab](../../actions) of this repository.
