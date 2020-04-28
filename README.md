# Timer example

This example shows how to use the `java.util.Timer` class.


## Maven instructions

To compile and package the source code:

```
mvn install
```

To run using exec plugin:

```
mvn exec:java
```

NOTE: using the exec plugin to run the code uses the same process as Maven, and
  On Windows:
    target\appassembler\bin\timer
  On Linux:
    ./target/appassembler/bin/timer the code behavior is modified by Maven's own threads and settings.
To test this program without interference from Maven, use the appassembler plugin.

To run using appassembler plugin on Linux:

```
./target/appassembler/bin/timer
```

On Windows:

```
target\appassembler\bin\timer
```


## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.


----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
