\# Dice Roller



A Java dice roller that simulates rolling multiple dice and displays each result as ASCII art.



\## What it does

Asks the user how many dice to roll, generates a random value (1–6) for each die, displays the corresponding ASCII art representation, and prints the total.



\## Concepts Used

\- `Random.nextInt()` for random number generation

\- ASCII art using \*\*text blocks\*\* (Java 15+ `"""` syntax)

\- `switch` expressions with arrow syntax

\- Loops for multiple dice rolls

\- Input validation (must be greater than 0)



\## How to Run

```bash

javac DiceRoller.java

java Main

```



\## Example

```

Enter the # of dice to roll: 2

&nbsp;-------

| ●   ● |

|        |

| ●   ● |

&nbsp;-------

You rolled: 4

Total: 4

```

