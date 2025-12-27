# Problems
1. Maximum Subarray
2. Maximum Sum Circular Subarray

# Understanding
KADANE LOGIC : It works by deciding at each index whether to start a new subarray or extend the previous one, based on which gives better Sum.

## For MAX:
curr = Math.max(currentElement, curr + currentElement)

# For MIN:
curr = Math.min(currentElement, curr + currentElement)

# For circular
Math.max(normal, total - min)

# points
i) A subarray must be contiguous
ii) If previous sum is hurting you, drop it
iii) If previous sum is helping you, keep it

Array next element : A[(i+1)%n]
Array previous element : A[(i-1+n)%n]
