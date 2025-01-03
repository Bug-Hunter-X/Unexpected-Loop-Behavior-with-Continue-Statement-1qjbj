# Unexpected Loop Behavior with Continue Statement

This repository demonstrates a subtle bug in Java related to the use of the `continue` statement within a `while` loop. The bug causes the loop to skip expected iterations.

## Bug Description
The Java code in `BuggyLoop.java` intends to print numbers 0 through 4. However, due to the placement of the `continue` statement, the loop skips printing 3. This is because the `continue` statement immediately jumps to the next iteration, bypassing the `System.out.println(x);` statement when `x` is 3.

## Solution
The `FixedLoop.java` file provides a corrected version of the code. The solution involves reorganizing the loop's logic to ensure that the `continue` statement is used appropriately, ensuring intended functionality.
