questions = [
["What is the Capital of Oyo?","a. Ibadan","b. Ilorin","c. Ikeja", "d. Lekki"],
["Which of the follow in not a fruit ?","a. Apple","b. Orange","c. Milk","d. Kuli-Kuli"],
["Which of these is a Country?","a. Oyo","b. Nigeria","c. Sokoto","d. Sabo-Yaba"],
["'print' is use to print on a terminal on ______.","a. Java","b. Python","c. JavaScript","d. C++"],
["A Bread is a ___ ?","a. Food","b. Food","c. Ask your father","d. All of the above"],
]

answers = "acbba"
attempted = 0
score = 0
correct = questions[4]

for question in questions:
	print(question[0], question[1], question[2], question[3], question[4])
	user_input = input("Make a selction: ")
	match user_input:
		case "correct":
			print("correct")
			score += 1
		case _: print("Wrong") 
	attempted += 1
	print("You got ", score ,"out of", attempted )

final_message = f"""
	Game Completed!
	You got {score} out of {attempted}

"""
print(final_message)
