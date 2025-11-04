
let number = 0
let multiplesOfNumbers = 1;
for (let count = 1; count <= 10; count++){
	if (count % 4 == 0){
		number = count
		console.log(number)
		for (let count = 0; count < 5; count++){
			multiplesOfNumbers *= number;
			console.log(multiplesOfNumbers);
		} 
		multiplesOfNumbers = 1
	}
}