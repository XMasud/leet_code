# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def myAtoi(s):
    if s and s[0].isalpha():
        return 0
    if (len(string) < 1) | (len(string) > 200):
        return
    removed_space = s.lstrip()

    negative_flag = 1
    if removed_space.startswith("-"):
        negative_flag = -1

    string_list = list(removed_space)

    digits = ""
    for digit in string_list:
        if digit.isdigit():
            digits += str(digit)
        elif digit == ".":
            digits += str(digit)

    final_digit = int(float(digits)) * negative_flag

    if final_digit < pow(-2, 31):
        return pow(-2, 31)
    elif final_digit > (pow(2, 31) - 1):
        return pow(2, 31) - 1
    else:
        return final_digit

if __name__ == '__main__':
    string = "3.14"
    result = myAtoi(string)
    print(result)
