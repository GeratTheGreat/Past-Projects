"""
Matthew Gerat
Problem 1 (5 points):
Compute the area of a triangle.
Formula: (base*height)/2
Complete line 9 and 10
"""
base = height = 5

area_triangle = float(base)*(height)/2
output_string = "%.2f" % area_triangle
print ("The area of the triangle is " + str(output_string)+ ".")


"""
Problem 2 (5 points):
Compute the area of a circle.
Formula: PI*radius*radius
Complete line 24 and 25
"""
import math
PI = math.pi
radius = 10

area_circle = PI * radius * radius
output_string = area_circle
print ("The area of a circle with a radius of " + str(radius) + " is " "%.2f" % output_string + ".")


"""
Problem 3 (5 points):
Check the memory usage for the target integer.
Complete line 35 to 37
"""
target = 12345678
memory_in_bits = target.bit_length()
memory_in_bytes = memory_in_bits/8
print ("Integer: " + str(target) +"\nMemory: " + str(memory_in_bits) + " bits or " + str(memory_in_bytes) + " bytes")


"""
Problem 4 (15 points):
"""
country1 = "the-united-states-of-america"
country2 = "the People's Republic of China"
country3 = "jAPAN"
country4 = "Italian Republic"
country5 = "Great Socialist People's Libyan Arab Jamahiriya"

#Your code goes below:
print('.'.join([country1[4:5],country1[11:12],country1[21:22]]).upper())
print('.'.join([country2[4:5], country2[13:14], country2[25:]]))
print(country3[0:1].upper() + country3[1:].lower())
print(country4[0:5].replace("i", "y"))
print(country5[25:30])
