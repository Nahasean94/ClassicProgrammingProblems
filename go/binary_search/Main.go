package main

//Look up if a number is in an array

func binarySearch(nums []int, target int) bool {
	left := 0
	right := len(nums) - 1
	for left <= right {
		mid := left + (right-left)/2
		if nums[mid] == target {
			return true
		} else if target < nums[mid] {
			right = mid - 1
		} else {
			left = mid + 1
		}
	}
	return false

}

//Look up the first index that contains the value

func conditionalSearch(booleans []bool, target bool) int {
	left := 0
	right := len(booleans) - 1
	for left < right {
		mid := left + (right-left)/2
		if booleans[mid] == target {
			right = mid
		} else {
			left = mid + 1
		}
	}
	return left
}
func main() {
	nums := []int{1, 2, 3, 4, 5}
	target := 5
	println(binarySearch(nums, target))

	booleans := []bool{true, true, true, false, false, false}
	println(conditionalSearch(booleans, false))
}
