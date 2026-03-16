# Java Mini Projects

A collection of 16 beginner-to-intermediate Java projects built to develop hands-on familiarity with core Java concepts — from basic I/O and control flow to multithreading and file handling.

---

## Projects

| # | Project | Description | Key Concepts |
|---|---------|-------------|--------------|
| 1 | [AlarmClock](./AlarmClock) | A multithreaded alarm clock that plays a `.wav` file at a set time | Multithreading, `Runnable`, `LocalTime`, `javax.sound.sampled` |
| 2 | [BankingProgram](./BankingProgram) | A menu-driven banking app with deposit, withdrawal, and balance check | Static methods, `switch`, input validation |
| 3 | [Calculator](./Calculator) | A command-line calculator supporting 5 arithmetic operations | `switch` expressions, `Math.pow()`, boolean flags |
| 4 | [CompoundInterestCalculator](./CompoundInterestCalculator) | Calculates compound interest using the standard financial formula | `Math.pow()`, `printf`, type conversion |
| 5 | [CountdownTimer](./CountdownTimer) | Counts down from a given number of seconds with a completion message | `Timer`, `TimerTask`, anonymous inner class |
| 6 | [DiceRoller](./DiceRoller) | Rolls multiple dice and displays results as ASCII art | `Random`, text blocks, `switch` expressions |
| 7 | [HangmanGame](./HangmanGame) | Classic word-guessing game with ASCII art — basic and file-based versions | `ArrayList`, `BufferedReader`, File I/O, string manipulation |
| 8 | [MadLibsGame](./MadLibsGame) | Word-substitution story game using user inputs | `String`, `scanner.nextLine()`, string concatenation |
| 9 | [MusicPlayer](./MusicPlayer) | A command-line music player for `.wav` files with play/stop/reset controls | `Clip`, `AudioInputStream`, try-with-resources, `finally` |
| 10 | [NumberGuessingGame](./NumberGuessingGame) | Guess a random number between 1–100 with directional hints | `Random`, `do-while`, attempt tracking |
| 11 | [QuizGame](./QuizGame) | A 5-question multiple-choice computer science quiz | Parallel arrays, nested loops, score tracking |
| 12 | [RockPaperScissors](./RockPaperScissors) | Play Rock Paper Scissors against the computer with replay support | `Random`, `do-while`, string comparison, input validation |
| 13 | [ShoppingCartProgram](./ShoppingCartProgram) | Calculates total purchase cost from item, price, and quantity | Mixed data types, arithmetic, string concatenation |
| 14 | [SlotMachine](./SlotMachine) | A fully functional slot machine with emoji symbols and tiered payouts | Static methods, `switch`, `String.join()`, bet validation |
| 15 | [TemperatureConverter](./TemperatureConverter) | Converts temperatures between Celsius and Fahrenheit | Ternary operator, method chaining, `printf` |
| 16 | [WeightConverter](./WeightConverter) | Converts weight between pounds and kilograms | `if-else`, `printf`, conversion constants |

---

## Concepts Covered

| Category | Topics |
|----------|--------|
| Core Java | Variables, data types, operators, control flow |
| OOP | Static methods, classes, encapsulation |
| Collections | `ArrayList`, arrays, parallel arrays |
| File I/O | `BufferedReader`, `FileReader`, exception handling |
| Multithreading | `Runnable`, `Thread`, `Timer`, `TimerTask` |
| Audio | `javax.sound.sampled`, `Clip`, `AudioInputStream` |
| Date & Time | `LocalTime`, `DateTimeFormatter` |
| Randomization | `java.util.Random` |

---

## Tech Stack

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **JDK:** Java 17+

---

## How to Run

Each project is self-contained inside its own folder.

```bash
# Navigate into any project folder
cd ProjectName

# Compile
javac ProjectName.java

# Run
java Main
```

> Some projects like AlarmClock and MusicPlayer require a `.wav` audio file. Update the file path in the source code before running.

---

## Author

**Anshika Dixit** — [GitHub](https://github.com/anshikadixit1145)
