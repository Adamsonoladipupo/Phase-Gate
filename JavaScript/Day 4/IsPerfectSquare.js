function IsPerfectSquare(input){
	let check = (input**0.5)%1 == 0;
	return check
}

let test_list = [4, 9, 25, 49]

for (let count = 0; count < test_list.length; count++){
	let check = IsPerfectSquare(test_list[count]);
	test_list[count] = check;
}

console.log(test_list)