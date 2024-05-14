import random

def guess_the_number():
    min_num = 1
    max_num = 100
    target_number = random.randint(min_num, max_num)
    attempts = 0
    max_attempts = 5

    print("Welcome to Guess the Number!")
    print(f"I have selected a number between {min_num} and {max_num}. Try to guess in { max_attempts} attempts .")

    while attempts < max_attempts:
        try:
            guess = int(input("Enter your guess: "))
            attempts += 1

            if guess == target_number:
                print(f"Congratulations! You guessed the number in {attempts} attempts.")
                break
            elif guess < target_number:
                print("Your guess is low. Try again.")
            else:
                print("Your guess is high. Try again.")
        except ValueError:
            print("Invalid input. Please enter a valid number.")

    if attempts >= max_attempts:
        print(f"Sorry, you've run out of attempts. The number was {target_number}.")

if __name__ == "__main__":
    guess_the_number()
