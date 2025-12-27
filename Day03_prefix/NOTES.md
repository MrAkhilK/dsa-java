# PREFIX SUM
Prefix Sum stores the sum of the elements from index 0 to i at pf[i].

# Create PF Sum
- Same size as input array
- pf[0]=arr[0] or create pf sum arr.size+1
- loop from 1 to n-1 / 0 to n-1
- pf[i]=pf[i-1]+arr[i]; / pf[i+1]=pf[i]+arr[i];

# Range Sum Formulas
- sum(left,right) = pf[right]-pf[left-1];
- if left=0 = pf[right]
- if we take one pf[size+1] : pf[right+1]-pf[left];

# Why PF
- pf is used to reduce TC from O(N) to O(1) per query.

SC : O(N) --> due to extra Array.
TC : 
build=O(N)
query = O(N)


# Pattern Recognition
- Multiple range sum queries
- Subarray sum problems
- Sum between i and j
- Fixed sum subarrays
- Divisible by k
- Zero sum subarray
- Equal 0s and 1s

# Prefix + HashMap (MOST IMPORTANT)

Core Rules:
- If two prefix sums are equal → subarray sum = 0
- If prefix[j] - prefix[i] = k → valid subarray
- For divisible by k:
  same remainder ⇒ valid subarray

Always do:
map.put(0,1)  // to count subarrays starting at index 0

Handle negatives:
rem = (sum % k + k) % k

# Prefix Sum Without Extra Array
- Sometimes only running sum is needed
- Used in subarray problems

# Problems
- range-sum-query-immutable LC-303
- subarray-sum-equals-k LC-560
- contiguous-array LC-525
- subarray-sums-divisible-by-k LC-974