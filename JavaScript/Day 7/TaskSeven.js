let multiple = 1
let sumMultiples = 0
for (let count = 0; count < 5; count++){
	multiple *= 4;
	sumMultiples += multiple
} 
console.log(sumMultiples);

multiple = 1
sumMultiples = 0

for (let count = 0; count < 5; count++){
	multiple *= 8;
	sumMultiples += multiple
}
console.log(sumMultiples);