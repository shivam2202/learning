Write a function
A consecutive run is a list of numbers which differ by one in either 
increasing or descending order. The number within a run must be direct neighbours in the 
original array. Create a function that takes a list of numbers and return the leght
of the longest consecutove-run

To illustrate:
longest_run([1,2,3,5,6,7,8,9]) -> 5
# Two consecutive run [1,2,3] and [5,6,7,8,9](longest)

Examples

longest_run([1,2,3,10,11,15]) -> 3
#Longest consecutive run: [1,2,3]

longest_run([-5,-3,-2,-1,0,1,5,6,7]) ->5

#longest consecutive run: [-3,-2,-1,0,1]
