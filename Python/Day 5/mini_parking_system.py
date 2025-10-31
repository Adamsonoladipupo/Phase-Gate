from mini_parking_system_function import *

while True:
	print(display_main_menu())
	user_input = input("Make a selection: ")
	match user_input:
		case "1": 
			print("Slot Numbers: ", slot_number, "\n","Car slots:	 ",car_slots)
			user_input = int(input("Select from the available slot numbers: "))
			
			if user_input == slot_number[user_input] and car_slots[user_input] == 0:
				car_slots = add_car(user_input)
				print("Car parked successfully")
			else:
				print("Oops! Slot occupied")
			print(car_slots)
			
		case "2":
			print(car_slots)
			user_input = int(input("Select the slot your car was parked"))
			if user_input == slot_number[user_input] and car_slots[user_input] == 1:
				car_slots = remove_car(user_input)
				print("Car taken successfully")
			else:
				print("Oops! slot is empty")
			print(car_slots)
		case "3":
			print(car_slots)
		case "4": 
			print("Thank you for using our App!")
		case _:
			print("Invalid input!")