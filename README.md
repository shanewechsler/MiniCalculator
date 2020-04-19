# MiniCalculator
Preforms basic multiplication and division with ints
Unit Tests:
multiplyTest(int y): Intial test makes sure the method multiply() compiles without errors, prints exception if there is one.
Second test: takes the paremeter y and tests it againsts the base total value 1, makes sure it sets total to the y parameter. 
(1*y)
Third Test: multiplies the new total times 6, makes sure total is updated to y*6.
divideTest(int y): Intial test makes sure the method divide() compiles without errors, prints exception if there is one.
Second test: makes sure it correctly handles division by 0, and doesn't update total if y = 0(divide(0))
Third test: multiplies y by itself and then attempts division with y, makes sure it updates total to y.
Forth test: divides 10/3 makes sure it returns 3(no remainder)
calculateTest(): Intial test makes sure the method calculate() compiles without errors, prints exception if there is one.
Second test: makes sure calculate() returns 1 for the default method of total.
Third test: makes sure calculate() returns updated total after operation is executed.
