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
console.log(sumMultiples**2);