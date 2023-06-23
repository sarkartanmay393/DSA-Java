function runningSum(nums: number[]): number[] {
    let tmp: number[] = [];
    let totalSum = 0;

    for (let i = 0; i < nums.length; i++) { 
        totalSum += nums[i];
        tmp.push(totalSum);
    }

    return tmp;
};