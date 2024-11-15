def is_prime(n):
    if n < 2:
        return False
    elif n == 2:
        return True

    if n % 2 == 0:
        return False

    for i in range(3, n):
        if n % i == 0:
            return False
    return True


num = input("Enter your number: ")
if is_prime(int(num)):
    print(num, " is a prime number.")
    exit()
else:
    print(num, "is not a prime number")
