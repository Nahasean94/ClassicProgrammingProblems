function fibonacciSequence(num)  {
    if(num < 2){
        return num;
    }
    return fibonacciSequence(num - 1)+fibonacciSequence(num - 2);
}

console.log(fibonacciSequence(400))
