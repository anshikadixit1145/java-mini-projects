\# Hangman Game



A classic Hangman word-guessing game built in Java — available in both a basic and an advanced version.



\## What it does

The player guesses letters one at a time to reveal a hidden word. Each wrong guess adds a body part to the hangman ASCII art. The game ends on 6 wrong guesses or when the word is fully revealed.



\## Versions Included

\- \*\*Basic version\*\* — hardcoded word (`"pizza"`)

\- \*\*Advanced version\*\* — reads a random word from an external `words.txt` file using `BufferedReader`



\## Concepts Used

\- `ArrayList<Character>` for tracking word state

\- File I/O — `BufferedReader`, `FileReader`

\- ASCII art with text blocks

\- `switch` expressions for hangman stages

\- String and character manipulation



\## How to Run

```bash

javac HangmanGame.java

java Main

```

> For the advanced version, place a `words.txt` file (one word per line) in the project directory and update the file path in the code.

