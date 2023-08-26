class Solution {
public void moveZeroes(int[] nums) {
        // Initialize a variable 'i' to keep track of the position where non-zero elements should be placed.
        int i = 0;

        // Loop through each element 'num' in the 'nums' array.
        for (int num : nums) {
        // If the current element is not zero, move it to the position 'i' and increment 'i'.
        if (num != 0) {
        nums[i] = num;
        i++;
        }
        }

        // After all non-zero elements have been moved to the front, fill the remaining positions with zeros.
        while (i < nums.length) {
        nums[i] = 0;
        i++;
        }
        }
        }
