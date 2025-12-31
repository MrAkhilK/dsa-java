# DAY 07 — PATTERN RULEBOOK

## TWO POINTERS — RULES

### When to Use
- Comparing two values
- Sorted arrays
- In-place rearrangement

### Core Rules
- Pointers move based on comparison
- Each pointer moves in one direction only
- No window / range tracking

### Special Rule
- Order must be preserved → slow & fast pointers
- Order not required → swapping allowed

### Template
while (condition) {
compare values
move pointer based on result
}
Examples:
- LC 125 (Palindrome)
- LC 167 (Two Sum II)
- LC 283 (Move Zeroes)

---

## SLIDING WINDOW — RULES

### When to Use
- Subarray / substring (contiguous)
- Longest / shortest / min / max
- Window-based condition

### Fixed Window Rules
- Window size = k
- Add index i
- Remove index i - k
- Check only when size == k

### Variable Window Rules
- Expand with right pointer
- Shrink with left pointer
- Maintain window validity

### IMPORTANT RESTRICTION


Sum-based sliding window works ONLY with non-negative numbers


### Template
for right:
add element
while window invalid:
remove left
left++
update answer


Examples:
- LC 643 (Fixed)
- LC 209, LC 3 (Variable)

---

## PREFIX SUM + HASHMAP — RULES

### When to Use
- Exact sum / exact count
- Negative numbers present
- Count of subarrays

### Core Rules
- Maintain running prefix sum
- Store frequency in HashMap
- Check (currentSum - target)
- Always initialize: map.put(0, 1)

### Template
sum = 0
map.put(0,1)
for element:
sum += element
if (sum - k exists):
count += map.get(sum - k)
update map

Examples:
- LC 560
- LC 525
- LC 974

---

## KADANE’S ALGORITHM — RULES

### When to Use
- Maximum subarray sum
- Contiguous
- Negative numbers allowed

### Core Logic
currSum = max(nums[i], currSum + nums[i])
maxSum = max(maxSum, currSum)

### Important
- Kadane ≠ Sliding Window

Example:
- LC 53

---

## PATTERN
Compare values → Two Pointers
Range / window → Sliding Window
Exact equality / negatives → Prefix + HashMap
Max subarray sum → Kadane


---

## LC 424 — LONGEST REPEATING CHARACTER (SHORT)

### Pattern
- Variable Sliding Window + Frequency Array

### Key Rule
replacementsNeeded = windowSize - maxFrequency
### Window Validity
(windowSize - maxFreq) <= k → valid
k → shrink window
### Important Optimization
- Do NOT decrease maxFreq while shrinking
- Keeps time complexity O(n)

Example:
- LC 424