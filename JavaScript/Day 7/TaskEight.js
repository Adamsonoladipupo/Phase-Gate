let multiple = 1
let sumMultiples = 0
for (let count = 0; count < 5; count++){
	multiple *= 4;
	sumMultiples += multiple
} 

multiple = 1

for (let count = 0; count < 5; count++){
	multiple *= 8;
	sumMultiples += multiple
}
console.log(sumMultiples);

let number = 0
let multiplesOfNumbers = 1;
let sumOfMultiples = 0
let sumOfPairs = 0;
for (let count = 1; count <= 10; count++){
	if (count % 4 == 0){
		number = count
		for (let count = 0; count < 5; count++){
			multiplesOfNumbers *= number;
			sumOfMultiples +=  multiplesOfNumbers
		} 
		sumOfPairs += sumOfMultiples
		multiplesOfNumbers = 1
		sumOfMultiples = 0

	}
}
console.log(sumOfPairs);