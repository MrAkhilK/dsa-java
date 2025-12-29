# Day04 - Sliding window

## Fixed length + frequency patteren
sed when:
- substring
- window size is FIXED
- order does NOT matter
- frequency matters (anagram / permutation)

Examples:
- LC 438 — Find All Anagrams in a String
- LC 567 — Permutation in String

Tool:
- int[26] frequency array (preferred)
- NOT HashSet

---
## Fixed Window Index Rule (MOST IMPORTANT)

ADD    → s.charAt(i)  
REMOVE → s.charAt(i - k)

(k = window size)
Never remove using `i`

---
## When to Compare Frequencies
Only compare with i>=k-1
Do NOT compare on every iteration blindly.
---

## What to Push to Result

- For LC 438 → push **starting index**
  i - k + 1
- For LC 567 → return **true immediately**

---
##  HashSet vs Frequency (Clear Rule)

- Uniqueness only → HashSet (LC 3)
- Count matters → Frequency array (LC 438, LC 567)
---

## shortcuts
Permutation / Anagram problem ⇒  
**Fixed Sliding Window + Frequency**

No new logic invention needed.
