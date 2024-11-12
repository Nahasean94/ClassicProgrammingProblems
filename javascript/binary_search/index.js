function binary_search(arr,target){
    let left=0;
    let right=arr.length-1

    while (left<=right){
        const mid=left+(right-left)/2

        if(target===arr[mid]){
            return true
        }else if(arr[mid]<target){
            right=mid-1
        }else{
            left=mid+1
        }
    }
        return false
}

function conditional_search(arr,target){
    let left=0;
    let right=arr.length-1
    while (left<right){
        const mid=Math.floor(left+(right-left)/2)
        if(target===arr[mid]){
            right=mid
        }else{
            left=mid+1
        }
    }
    return left
}

let arrayNum = [1,2,3,4,5];
let targetNum=3
console.log(binary_search(arrayNum,targetNum));

let booArray=[false,false,false,false,true,true]
let boolTarget=false

console.log(conditional_search(booArray,boolTarget));
