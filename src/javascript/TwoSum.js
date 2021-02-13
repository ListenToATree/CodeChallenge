var twoSum = function(nums, target) {
    const values = new Map()

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i]
        const matchingValue = values.get(complement)
        if (matchingValue !== undefined) {
            return [matchingValue, i]
        }
        values.set(nums[i], i)
    }
}

const arr = [2, 7, 11, 15];
console.log(twoSum(arr, 9));
