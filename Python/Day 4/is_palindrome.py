test_list = ["abcde", "racecar", "hello", "noon"]

new_word = ""
for word in test_list:
	#for letter in word:
	for count in range(len(word)-1, -1, -1):
		print(word[count])
		#word[count] += new_word 
	print(new_word)