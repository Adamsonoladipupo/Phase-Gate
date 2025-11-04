let number = 0
let multiplesOfNumbers = 1;
let sumOfMultiples = 0
for (let count = 1; count <= 10; count++){
	if (count % 4 == 0){
		number = count
		for (let count = 0; count < 5; count++){
			multiplesOfNumbers *= number;
			sumOfMultiples +=  multiplesOfNumbers
		} 
		console.log(sumOfMultiples);
		multiplesOfNumbers = 1
		sumOfMultiples = 0

	}
}