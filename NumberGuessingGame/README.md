\# Number Guessing Game



A classic number guessing game in Java where the player tries to guess a randomly generated number between 1 and 100.



\## What it does

Generates a random number and gives the player directional hints (too high / too low) after each guess. Tracks and displays the total number of attempts on a correct guess.



\## Concepts Used

\- `Random.nextInt()` for number generation

\- `do-while` loop to ensure at least one guess

\- Attempt counter

\- Conditional feedback with `if-else if`



\## How to Run

```bash

javac NumberGuessingGame.java

java Main

```



\## Example

```

Guess a number between 1-100

Enter a guess: 50

TOO LOW! Try again

Enter a guess: 75

TOO HIGH! Try again

Enter a guess: 63

CORRECT! The number was 63

\# of attempts: 3

```

