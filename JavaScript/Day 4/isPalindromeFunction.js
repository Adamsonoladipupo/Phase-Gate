function IsPerfectSquareFunction(testList){

	for (let count = 0; count < testList.length; count++){
		let wordInList = testList[count]
		let newWord = ""
		for (let counter = wordInList.length-1; counter >= 0; counter--){
			newWord += wordInList[counter];
		}
		//console.log(newWord);
		testList[count] = wordInList==newWord;
	}
	return testList
}