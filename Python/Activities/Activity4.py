# Get player names
player1 = input("What is Player 1's name? ")
player2 = input("What is Player 2's name? ")

while True:
    # Get player choices
    choice1 = input(f"{player1}, choose Rock, Paper, or Scissors: ").lower()
    choice2 = input(f"{player2}, choose Rock, Paper, or Scissors: ").lower()
    
    # Determine winner
    if choice1 == choice2:
        print("It's a tie!")
    elif (choice1 == "rock" and choice2 == "scissors") or \
         (choice1 == "scissors" and choice2 == "paper") or \
         (choice1 == "paper" and choice2 == "rock"):
        print(f"{player1} wins!")
    elif (choice2 == "rock" and choice1 == "scissors") or \
         (choice2 == "scissors" and choice1 == "paper") or \
         (choice2 == "paper" and choice1 == "rock"):
        print(f"{player2} wins!")
    else:
        print("Invalid input! Enter Rock, Paper, or Scissors.")

    # Ask if they want to play again
    replay = input("Do you want to play another round? Yes/No: ").lower()
    if replay == "no":
        print("Thanks for playing! Goodbye.")
        break
    elif replay != "yes":
        print("Invalid option. Exiting game.")
        break
