# Function to calculate sum of a list
def sum_of_list(numbers):
    total = 0
    for number in numbers:
        total += number
    return total

# Example list
num_list = [10, 40, 60, 90]

# Call the function and print result
result = sum_of_list(num_list)
print("The sum of all the elements is:", result)
