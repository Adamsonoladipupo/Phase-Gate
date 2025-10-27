import random
import datetime

docWelcome = """

	Welcome to My Subtraction Arithmetic App
"""
print(docWelcome)
scores = 0
#time = datetime
for count in range (1, 11):
	second_number = random.randrange (1, 9)
	first_number = random.randrange (10, 20)
	doc_question = f"""
-> Question.{count} : {first_number} - {second_number} 
	"""
	print(doc_question)
	user_input = int(input("Enter your answer :"))
	if user_input == first_number - second_number:
		print ("Wow! You are Correct")
		scores +=1
	if user_input != first_number - second_number:
		print("Oops! You are wrong, try again")
		print(f"-> Question.{count} : {first_number} - {second_number}")
		user_input = int(input("Enter your answer :"))
		if user_input == first_number - second_number:
			print ("Wow! You are Correct")
			scores +=1
		else: 
			print("Oops! You are wrong")
doc_result = f"""
	Congartulations! You just completed
	the Arithmetic Fun Game, here is your result.
	-->  You got {scores} out of 10 questions  <--

		[Total time spent ...]
	
"""
print(doc_result)