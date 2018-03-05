## Beginning a Java Application with Gradle

Install - https://gradle.org/install/

Documentation - https://gradle.org/docs/


1. Creating a Gradle based Java Application

    `gradle init --type java-application`

2. Some useful commands for Unix based systems

    `./gradlew tasks`

    `./gradlew build`

    `./gradlew run`

    Add `-q` to the `build` and `run` commands to avoid the verbose.

NOTE: To understand the packages, I've created a package `pkg` in `src/main/java`
along with two subpackages and used the subpackages in App.java
file.

The following link will be useful.

https://stackoverflow.com/questions/29805622/could-not-find-or-load-main-class-org-gradle-wrapper-gradlewrappermain
