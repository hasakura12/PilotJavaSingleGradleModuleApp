# Pilot Java Single Gradle Module App

## How to build and package the project, and create binary distributions (zip and tar)
`./gradlew build`

This will compile the project and run tests.

Following files will be created:

-`Zip` and `tar`  under `build/distributions`. 

-Executable `jar` under `build/libs`.


## How to run only tests
`gradle test`


## How to run the application
just execute

`./gradlew run`

or

`cd build/lib`

then,

`java -jar PilotJavaSingleGradleModuleApp-1.0.jar`

