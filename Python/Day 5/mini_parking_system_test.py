import unittest
from mini_parking_system_function import *

class TestMiniParkingSystemFunction(unittest.TestCase):
	def testing_if_parking_slot_is_empty(self):
		expect = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
		actual = mini_parking_system_function.add_car(1)
		self.assertEquals(expect, actual)







