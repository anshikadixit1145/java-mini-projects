\# Slot Machine



A fully functional slot machine game in Java with emoji symbols, betting, and a tiered payout system.



\## What it does

Starts the player with $100. The player places a bet, spins the slot machine, and wins a payout based on matching symbols. The game ends when the balance hits zero or the player quits.



\## Symbols \& Payouts

| Symbol | 3 of a kind | 2 of a kind |

|--------|-------------|-------------|

| 🍒 | 3x bet | 2x bet |

| 🍉 | 4x bet | 3x bet |

| 🍋 | 5x bet | 4x bet |

| 🔔 | 10x bet | 5x bet |

| ⭐ | 20x bet | 10x bet |



\## Concepts Used

\- Static helper methods — `spinRow()`, `printRow()`, `getPayout()`

\- `switch` expressions for tiered payout logic

\- `String.join()` for row display

\- Bet validation (overdraft and negative checks)

\- `while` loop with balance condition



\## How to Run

```bash

javac SlotMachine.java

java Main

```

