car_slots = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
slot_number = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

def add_car(input):
	input = input-1
	car_slots[input] = 1;
	return car_slots

def remove_car(input):
	input = input-1
	car_slots[input] = 0;
	return car_slots

def display_main_menu():
	main_menu = """

	Welcome to Mini Parking System App

	1. Park your car
	2. Take your car
	3. Show parking slots
	4. Exit App

	"""
	return main_menu