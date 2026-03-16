\# Music Player



A command-line music player in Java that can play, stop, reset, and quit audio playback of `.wav` files.



\## What it does

Loads a `.wav` audio file and gives the user a simple menu to control playback in real time.



\## Controls

\- `P` — Play

\- `S` — Stop

\- `R` — Reset to beginning

\- `Q` — Quit



\## Concepts Used

\- `javax.sound.sampled` — `Clip`, `AudioInputStream`, `AudioSystem`

\- Try-with-resources for safe resource management

\- `switch` expressions for menu control

\- Multiple exception handling (`UnsupportedAudioFileException`, `LineUnavailableException`, `IOException`)

\- `finally` block for guaranteed cleanup



\## How to Run

```bash

javac MusicPlayer.java

java Main

```

> Update the `filePath` variable in the code to point to a valid `.wav` file on your system.

