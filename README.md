# Timer example

This example shows how to use the `java.util.Timer` class.

## Maven instructions

To compile and package the source code:

```
mvn install
```

To run using exec plug-in:

```
mvn exec:java
```

NOTE: using the `exec` plug-in to run the code uses the same process as Maven, and the code behavior is modified by Maven's own threads and settings.
To test this program without interference from Maven, use the `appassembler` plugin.

To run using `appassembler` plug-in on **Linux**:

```
./target/appassembler/bin/timer
```

On **Windows**:

```
target\appassembler\bin\timer
```

## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.

----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
