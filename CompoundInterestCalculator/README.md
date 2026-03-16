\# Compound Interest Calculator



A Java program that calculates compound interest using the standard financial formula.



\## What it does

Takes principal amount, interest rate, compounding frequency, and number of years as inputs, then calculates and displays the final amount.



\## Formula

```

A = P × (1 + r/n) ^ (n × t)

```

Where:

\- `P` = Principal amount

\- `r` = Annual interest rate (as decimal)

\- `n` = Times compounded per year

\- `t` = Number of years

\- `A` = Final amount



\## Concepts Used

\- `Math.pow()` for exponentiation

\- `printf` for formatted currency output

\- Rate conversion from percentage to decimal (`/ 100`)

\- Mixed `int` and `double` inputs



\## How to Run

```bash

javac CompoundInterestCalculator.java

java Main

```



\## Example

```

Enter the principal amount: 1000

Enter the interest rate (in %): 5

Enter the number of times compounded per year: 12

Enter the # of years: 10

The amount after 10 years is $1647.01

```

