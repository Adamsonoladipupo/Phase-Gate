import unittest
from is_perfect_square_function import *

class TestIsPerfectSquareFunction(unittest.TestCase):
	def test_if_is_perfect_square_returns_true(self):
		actual = 4
		boolean = True
		expect = boolean
		self.assertEqual(actual, expect)