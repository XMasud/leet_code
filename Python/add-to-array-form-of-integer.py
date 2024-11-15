# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def addToArrayForm(num, k):

    if len(num) <= 0 | len(num) > pow(10, 4):
        return

    list_to_string = ""
    for i,x in enumerate(num):
        if int(x) > 0:
            if str(x).startswith('0'):
                break

        if int(x) >= 0 & int(x) <= 9:
            list_to_string += str(x)

    if list_to_string:

        list_to_num = int(list_to_string) + k
        num_to_list = [int(a) for a in str(list_to_num)]
        return num_to_list
    else:
        return

if __name__ == '__main__':
    num = [1,2,0,0]
    k = 34
    result = addToArrayForm(num, k)
    print(result)
