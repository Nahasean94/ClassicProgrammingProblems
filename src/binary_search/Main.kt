package binary_search

fun search(nums: List<Int>, target: Int): Boolean {
    var left=0
    var right=nums.lastIndex
     while(left<=right){
         val middle=left+((right-left)/2)
         if(nums[middle]==target){
             return true
         }else if(target<nums[middle]){
             right=middle-1
         }else{
             left=middle+1
         }
     }
    return false
}

fun conditionalSearch(nums: List<Boolean>,target:Boolean): Int {
    var left=0
    var right=nums.lastIndex
    while(left<right){
        val middle=left+((right-left)/2)
        if(nums[middle]==target){
             right= middle
        }else {
            left=middle+1
        }
    }
    return left
}

fun main(args: Array<String>) {
    val nums= listOf(1,2,3,4,5,6,7,8,9)
    var target=10
    println(search(nums,target))
    val booleans = listOf(true,true,false,false,false,false)
    val targetBoolean=false
    println(conditionalSearch(booleans,targetBoolean))
}