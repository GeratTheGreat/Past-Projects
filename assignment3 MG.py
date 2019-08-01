# -*- coding: utf-8 -*-
"""
Created on Sun Feb 19 15:40:24 2017

@author: xfang13
"""

#Problem 1: (6 points)
#Create a list with 1001 randomly generated 
#integers, each of which is generated in between -1000 and 1000. 
#And using Python statements to find out the
#mean, median, minimum, and maximum value inside the list.
#Hint: You will need to import the random module and use the randint() method
#for generating the integers.
import random
#Your code goes below
L = []
for i in range(1001):
    L.append(random.randrange(-1000, 1000))
print (L)
mean = sum(L)/len(L)
median = L[501]
maximum = max(L)
minimum = min(L)
print("The mean is " + str(mean) + "\nThe median is " + str(median) + "\nThe maximum is " + str(maximum)) + "\nThe minimum is " + str(minimum)
#Problem 2: (10 points)
#Write the procedure that computes the muliplication of two matrices
#Your code should work for any size matrices, assuming that 
#the total number of columns in the first matrix matches the total number of
#rows in the second matrix
#Use the following matrices as testing data
matrix_A = [[1,2,3],[4,5,6]]
matrix_B = [[1,2,3,4],[4,5,6,7],[7,8,9,10]]
#Your code goes below 
result = [[0,0,0,0],
         [0,0,0,0]]
for i in range(len(matrix_A)):
    for j in range(len(matrix_B[0])):
        for k in range(len(matrix_B)):
            result[i][j] += matrix_A[i][k] * matrix_B[k][j]
for r in result:
    print(r)

#Problem 3: (6 points)
#Implement the insertion-sort algorithm
#Pseudo code:
#Input: A Python list, A, with unsorted numbers
#Output: A sorted list, A, where the numbers are sorted ascendingly
#for i from 1 to n (n is the length of A)
#   assign i-1 to j
#   assign A[i] to key
#   while j is greater than or equal to 0 and A[j] is greater than key
#       assign A[j] to A[j+1]
#       decreament j by 1
#   assign key to A[j+1]
A = [random.randint(0,1000) for i in range(50)]
#Your code goes below
def insertion_sort(numbers):
    for k in range(1, len(numbers)):
        j = k
        while j > 0 and numbers[j] < numbers[j-1]:
            numbers[j], numbers[j-1] = numbers[j-1], numbers[j]
            j -= 1
    return numbers

print(insertion_sort(A))



#Problem 4: (8 points)
#Write Python statements that create a dictionary of word counts.
#Specifically, keys of the dictionary are words; values of the dictionary
#are the number of occurances of the words
#For example, given s = 'go go hurry up', the dictionary, D, should be like
# {'go':2, 'hurry':1, 'up':1}
s = '''
Deep learning also known as deep structured learning hierarchical learning or deep machine learning is a branch of machine learning 
based on a set of algorithms that attempt to model high level abstractions in data In a simple case there might be two sets of neurons 
ones that receive an input signal and ones that send an output signal When the input layer receives an input it passes on a modified 
version of the input to the next layer In a deep network there are many layers between the input and output and the layers are not made 
of neurons but it can help to think of it that way allowing the algorithm to use multiple processing layers composed of multiple linear 
and non-linear transformations
'''
#Your code goes below
D = {}
L = s.split()
frequency = []
for i in L:
    frequency.append(L.count(i))
print(frequency)
print(L)
D = dict(zip(L,frequency))
print(D)