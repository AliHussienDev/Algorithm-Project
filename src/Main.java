# Diagonal Difference - Algorithm Project

## Project Overview
This project is a technical implementation designed to calculate the absolute difference between the sums of a square matrix's two primary diagonals. The project explores two fundamental programming paradigms: **Iteration** and **Recursion**, providing a detailed comparison of their performance and memory usage.

## Features
* **Iterative Solution:** Uses a high-performance single-loop approach with constant memory usage.
* **Recursive Solution:** Demonstrates a functional approach using the system call stack.
* **Constraint Safety:** Built-in validation to enforce the `-100 < value < 100` requirement, ensuring data integrity.
* **Complexity Analysis:** Detailed documentation on Time and Space complexity for both methods.

---
## 📊 Algorithmic Comparison

| Metric | Iterative Approach | Recursive Approach |
| :--- | :--- | :--- |
| **Time Complexity** | O(N) | O(N) |
| **Space Complexity** | **O(1)** (Constant) | **O(N)** (Linear) |
| **Memory Tool** | Reusable Variables | System Call Stack |
| **Stability** | Highly Stable | Risk of StackOverflow |

### Key Insight
While both algorithms complete the task in the same amount of time, the **Iterative** method is the professional standard for this problem because it does not consume additional memory as the matrix size increases.

---

## 🛠 Sample Input/Output
**Input:**
```text
3
11 2 4
4 5 6
