const inputCollector = require("prompt-sync")({sigint:true});

console.log("Welcome to My Subtraction Arithmetic App")
let firstNumber = 10;
let secondNumber = 5;
let scores = 0;

for (let count = 1; count <= 10; count+=1){
	console.log("-> Question.%d %d - %d : ", count, firstNumber, secondNumber)
	let userInput = inputCollector("Enter your answer: ");
	if (firstNumber - secondNumber == userInput){
		console.log("Wow! You are correct");
		scores+=1;
	}
	if (firstNumber - secondNumber != userInput){
		console.log("Oops! You are wrong, try again");
		console.log("-> Question.%d  %d - %d : ", firstNumber, secondNumber, count)
		userInput = inputCollector("Enter your answer: ");
		if (firstNumber - secondNumber == userInput){
			console.log("Wow! You are correct");
			scores+=1;
		}
		else{
			console.log("Oops! You are wrong");
		}
	}
}// end of for loop
console.log("");
console.log("Congratulation! You just completed \nthe Arithmetic Fun Game, here is your result. \n--->  You got %d out of 10 questions  <--- \n \n[Total time spent ...]", scores);