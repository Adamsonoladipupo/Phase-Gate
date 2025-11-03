from checkout_system_function import *

product_cart = []
price_cart = []
total_price = 0 

print("Welcome to My Super-Market")
while True:	
	product = input("Enter product name (stop to stop buying items): ")
	if product == "stop" or product == "STOP":
		break
	add_item_to_cart(product_cart, product)
	price = int(input(f"Enter price for {product}: "))
	add_price_to_cart(price_cart, price)
	total_price = add_all_prices(price_cart)


subtotal = add_all_prices(price_cart)
vat = get_vat(price_cart)
total_amount = get_total(price_cart)

invoice_top = """
	----- > INVOICE < -----
"""
invoice = f"""
	Subtotal :{subtotal}
	vat : {vat}
	Total : {total_amount}

"""
print(invoice_top)
for item in range (0, len(price_cart)):
	print(f"	{product_cart[item]} : ₦{price_cart[item]}")
print(invoice)

payment_amount = int(input("Enter payment amount: "))
while payment_amount < total_amount:
	print("input amount is less than the total price")
	payment_amount = int(input("Enter payment amount: "))

grand_total = get_total(price_cart)
balance = get_balance(price_cart, payment_amount)

receipt_top = """
	----- > PAYMENT RECEIPT < -----
"""
receipt = f"""
	Amount Paid :{payment_amount}
	Grand Total : {grand_total}
	Balance : {balance}

	Payment Successful!
	Thank you for shopping with us.

"""
print(receipt_top)
for item in range (0, len(price_cart)):
	print(f"	{product_cart[item]} : ₦{price_cart[item]}")
print(receipt)




