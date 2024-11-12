package main

func main() {
	print(fibonacci(400))
}

func fibonacci(number int) int {
	if number < 2 {
		return number
	}
	return fibonacci(number-1) + fibonacci(number-2)
}
