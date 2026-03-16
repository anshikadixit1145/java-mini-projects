\# Countdown Timer



A Java countdown timer that ticks down from a user-defined number of seconds and prints a message when it reaches zero.



\## What it does

Takes a number of seconds as input and counts down to zero at one-second intervals using Java's `Timer` and `TimerTask`.



\## Concepts Used

\- `java.util.Timer` and `TimerTask` for scheduled execution

\- Anonymous inner class to define task behavior

\- `timer.scheduleAtFixedRate()` for fixed interval execution

\- `timer.cancel()` to stop execution programmatically



\## How to Run

```bash

javac CountdownTimer.java

java Main

```



\## Example

```

Enter # of seconds to countdown from: 5

5

4

3

2

1

0

HAPPY NEW YEAR!

```

