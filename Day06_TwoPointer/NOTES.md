# DAY 06 — TWO POINTERS

## Two Pointers
Two Pointers uses **two indices** to traverse data from one or both ends.
Pointers move **based on comparison**, not window rules.

Key point:
- Pointers move **independently**
- No fixed window required

---

## Two Pointers vs Sliding Window

Two Pointers:
- Compare TWO elements
- Often used on sorted arrays
- Pointer movement depends on comparison

Sliding Window:
- Manage a RANGE (window)
- Window must stay valid
- Expand & shrink logic

Rule:
Compare values → Two Pointers
Manage range → Sliding Window
---

## Two Pointers Time Complexity Insight

Even with nested while loops:
- Each pointer moves in ONE direction only
- Each character/element is processed at most once

Therefore:
Time Complexity = O(n)

Nested loops ≠ O(n²) if pointers don’t reset.

---

## LC 125 — Valid Palindrome

Pattern:
- Two Pointers (left & right)

Important rules:
- Skip non-alphanumeric characters
- Ignore case
- Compare one pair per iteration

Why inner while loops exist:
- Pointers can land on invalid characters AFTER every move
- So we sanitize pointers before comparison EVERY iteration

Flow:
Clean left → Clean right → Compare → Move inward

---

## LC 167 — Two Sum II (Sorted Array)

Pattern:
- Two Pointers (NOT Sliding Window)

Critical logic:
sum = numbers[left] + numbers[right]

if sum < target → left++
if sum > target → right--
if sum == target → answer found

Why this works:
- Array is sorted
- Pointer movement reduces search space

Mistake to avoid:
- Moving pointers without comparison logic
- Simulating brute force using loops

---

## What Two Pointers Is NOT

- Not window-based
- Not used for counting subarrays
- Not used when exact sum with negatives is needed

---

## Pattern Recognition Shortcut 

comparing two values?
Is the array sorted or traversable from both ends?

If YES → Two Pointers

---

## Problems Practiced Today

- LC 125 — Valid Palindrome (Two Pointers)
- LC 167 — Two Sum II (Two Pointers)