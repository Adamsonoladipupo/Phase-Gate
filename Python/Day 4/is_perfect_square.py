from is_perfect_square_function import *

test_list = [4, 9, 25, 49]
for count in range (0, len(test_list)):
	check = is_perfect_square(test_list[count])
	test_list[count] = check	
print(test_list)