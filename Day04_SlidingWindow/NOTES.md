# DAY 04 — SLIDING WINDOW

Sliding Window is an optimization technique used for
**contiguous subarray / substring problems**
to reduce time complexity from O(N²) to O(N).

---

## What is Sliding Window?

Sliding Window maintains a **window (range)** using two pointers:
- left
- right

The window slides over the array/string instead of recomputing values.

---

## Why Sliding Window Exists?

Brute force checks all subarrays → O(N²)

Sliding Window:
- Reuses previous computation
- Moves left & right pointers intelligently
- Solves problems in O(N)

---

## When Sliding Window Works

Use Sliding Window when:
- Problem involves **subarray / substring**
- Elements are **contiguous**
- Window size is **fixed or variable**
- For sum problems → **all numbers are non-negative**

---

## When Sliding Window FAILS

Do NOT use Sliding Window when:
- Array contains **negative numbers** (sum problems)
- Need to **count subarrays** with sum = k
- Condition depends on past prefix differences

👉 Use **Prefix Sum + HashMap** instead

---

## Types of Sliding Window

### 1️.Fixed Size Sliding Window
- Window size is constant
- Move left & right together

Template:
- Build first window
- Slide window:
    - add incoming element
    - remove outgoing element

Used in:
- Maximum sum of subarray of size k

---

### 2️.Variable Size Sliding Window
- Window size changes
- Expand and shrink based on condition

Core Rule:
> Expand until condition is met  
> Shrink while condition remains valid

---

## CORE MENTAL RULE (VERY IMPORTANT)

Expand → include more elements  
Shrink → remove unnecessary elements

---

## Problems Solved Today (with LC Numbers)

### LC 643 — Maximum Average Subarray I
Pattern:
- Fixed Size Sliding Window
- Window size = k

Key Idea:
- Maintain running sum
- Add right, remove left
- Track maximum sum

---

### LC 209 — Minimum Size Subarray Sum
Pattern:
- Variable Size Sliding Window
- All numbers are positive

Key Idea:
- Expand until sum ≥ target
- Shrink to minimize window
- Track minimum length

Return Rule:
- If no valid window → return 0

---

### LC 3 — Longest Substring Without Repeating Characters
Pattern:
- Variable Size Sliding Window (String)
- Use HashSet / HashMap

Key Idea:
- Maintain window with unique characters
- If duplicate → shrink from left
- Track maximum window length

---
## Sliding Window vs Prefix Sum

| Situation | Technique |
|---------|----------|
| Fixed window size | Sliding Window |
| Variable window, positive numbers | Sliding Window |
| Count subarrays | Prefix + HashMap |
| Sum = k with negatives | Prefix + HashMap |
| Divisible by k | Prefix + HashMap |

