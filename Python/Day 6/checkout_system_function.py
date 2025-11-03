
def add_item_to_cart(product_cart, product):
	product_cart.append(product)
	return product_cart

def add_price_to_cart(price_cart, price):
	price_cart.append(price)
	return price_cart

def add_all_prices(price_cart):
	total_price = 0
	#for price in range(0, len(price_cart)-1)
	for price in price_cart:
		total_price += price
	return total_price

def get_vat(price_cart):
	total = add_all_prices(price_cart)
	vat = total * 0.075
	return vat

def get_total(price_cart):
	total = get_vat(price_cart) + add_all_prices(price_cart)
	return total

def get_balance(price_cart, input_amount):
	balance = input_amount - get_total(price_cart)
	return balance

