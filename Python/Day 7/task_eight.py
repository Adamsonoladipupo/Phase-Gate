multiple = 1
sumOfMultiples = 0
for count in range (5):
	multiple *= 4
	sumOfMultiples += multiple

multiple = 1

for count in range (5):
	multiple *= 8
	sumOfMultiples += multiple
print(sumOfMultiples)