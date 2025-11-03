import unittest
from checkout_system_function import *

class TestCheckoutSystemFunctions(unittest.TestCase):
	def testing_if_add_item_actually_add_item(self):
		cart = []
		actual = add_item_to_cart(cart, "laptop",)
		expected = ["laptop"]
		self.assertEqual(actual, expected)

	def testing_if_add_price_actually_add_price(self):
		cart = []
		actual = add_price_to_cart(cart, 2000,)
		expected = [2000]
		self.assertEqual(actual, expected)

	def testing_if_all_prices_are_added_correctly(self):
		cart = [2000, 1000, 4000]
		actual = add_all_prices(cart)
		expected = 7000
		self.assertEqual(actual, expected)

	def testing_if_vat_returns_the_correct_vat_amount(self):
		cart = [300000, 80000]
		actual = get_vat(cart)
		expected = 28500
		self.assertEqual(actual, expected)

	def testing_if_get_total_actually_get_the_total_cost(self):
		cart = [300000, 80000]
		actual = get_total(cart)
		expected = 408500
		self.assertEqual(actual, expected)

	def testing_if_get_balance_actually_get_balance_after_the_payment_have_been_made(self):
		cart = [300000, 80000]
		amount = 410000
		actual = get_balance(cart, amount)
		expected = 1500
		self.assertEqual(actual, expected)





		

