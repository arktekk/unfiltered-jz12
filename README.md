# Getting started #

run the `sbt` or `sbt.bat` script to start sbt (our build tool)

Eclipse users: run the `eclipse` command, 
IntelliJ users: run the `gen-idea` command and import your project  

# Exercises #
The goal of this exercise is to write an application showing the various JavaZone events, complete with sessions and speakers.
A template application is available at `src/main/scala/jz/Jz.scala`

To start the application either call `test:run` from sbt, or run `src/test/scala/jz/Run.scala` directly from your IDE. 
Compilation (without running the application) can be done either from your IDE or with the `compile` command in sbt.

The application comes with a library found at `src/main/scala/jz/Incogito.scala` for accessing [Incogito](http://javazone.no/incogito10/events) - the official program.

1. show a list of all the events
2. show information about a single event listing the sessions
3. show information about a single session
4. show a list of all the speakers
5. filter sessions based on labels and levels
6. group the sessions by day, timeslot and room (just like in incogito)
7. make it pretty, add more features or whatever you feel like