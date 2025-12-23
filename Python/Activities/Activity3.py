# Rock-Paper-Scissors game

# Get player choices
player1 = input("Player 1, enter Rock, Paper, or Scissors: ").strip().lower()
player2 = input("Player 2, enter Rock, Paper, or Scissors: ").strip().lower()

# Rules dictionary
rules = {
    "rock": "scissors",
    "scissors": "paper",
    "paper": "rock"
}

# Determine winner
if player1 == player2:
    print("It's a tie!")
elif rules[player1] == player2:
    print("Player 1 wins!")
elif rules[player2] == player1:
    print("Player 2 wins!")
else:
    print("Invalid input. Please enter Rock, Paper, or Scissors.")
