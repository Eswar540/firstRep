#suppose the cover price of a book is Rs.249,but book stores get a 40% discount.Shipping costs Rs.30 for the first copy
#and Rs.10 for each additional copy.Write a python program that calculates total wholesale price for 60 copies
"""
    Program No.    	    :LS:01 IL:04
    Program Name	    : 1inlab4.py
    Author                  :Eswar
    Date            		    :24/04/2021
    Topics         		    :Python Software Installation
                     	           	 Python Environment Setup
                    		 Python Program Structure
                    		 Python Execution
"""
bookprice=float(input("Enter price of a book:"))
discount=bookprice*(40/100)
d_price=bookprice-discount
num_books=float(input("Enter no. of books:"))
shipping=float(30+(10*(num_books-1)))
total_price=float(d_price*num_books+shipping)
print("The Actual book price with discount:Rs. %.2f"%(d_price))
print("The number of books ordered:",num_books)
print("The shipping cost for the quantitiy:",shipping)
print("The total wholesale price of the purchase:%.2f"%total_price)
