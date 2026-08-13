package main

import (
	"fmt"
)

func main() {
	i := 0
start:
	if i < 5 {
		fmt.Println(i)
		i++
		if i == 3 {
			goto end
		}
		goto start
	}
end:
	fmt.Println("Hello, World!")
}
