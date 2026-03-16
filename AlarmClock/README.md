\# Alarm Clock



A multithreaded Java alarm clock that plays a `.wav` audio file when the set time is reached.



\## What it does

Takes an alarm time in `HH:MM:SS` format, displays a live ticking clock in the terminal, and plays an audio file when the alarm time is reached. The user can stop the alarm by pressing Enter.



\## Concepts Used

\- \*\*Multithreading\*\* — `Runnable` interface, `Thread` class

\- \*\*Date \& Time API\*\* — `LocalTime`, `DateTimeFormatter`, `DateTimeParseException`

\- \*\*Audio playback\*\* — `javax.sound.sampled` (`AudioInputStream`, `Clip`, `AudioSystem`)

\- Exception handling with `try-catch`

\- Input validation loop using `while`



\## How to Run

```bash

javac Main.java AlarmClock.java

java Main

```

> Make sure a `.wav` audio file is present in the project directory and the file path in the code is updated accordingly.

