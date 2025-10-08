CodeRevisited
=============

Code samples, utils, example code for various problems


![Java CI with Gradle](https://github.com/suresh-sajja/CodingProblems/workflows/Java%20CI%20with%20Gradle/badge.svg)
![Java](https://img.shields.io/badge/Java-8+-orange.svg)
![Gradle](https://img.shields.io/badge/Gradle-8.5-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)
![GitHub stars](https://img.shields.io/github/stars/suresh-sajja/CodingProblems?style=social)
![GitHub forks](https://img.shields.io/github/forks/suresh-sajja/CodingProblems?style=social)
![GitHub issues](https://img.shields.io/github/issues/suresh-sajja/CodingProblems)
![GitHub last commit](https://img.shields.io/github/last-commit/suresh-sajja/CodingProblems)

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

To run tests:
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
5. Runs tests

You can view the build status and history in the [Actions tab](../../actions) of this repository.
