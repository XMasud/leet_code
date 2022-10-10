# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def removeElement(nums, val):

    if len(nums) <= 0 | len(nums) > 100 | val > 100 | val < 0:
        return

    final_list = []
    for i,x in (nums.count(val)):
        if x > 50 | x < 0:
            break
        else:
            if x == val:
                final_list.append("_")
            else:
                final_list.append(x)
    return final_list


if __name__ == '__main__':
    nums = [0,1,2,2,3,0,4,2]
    k = 2
    result = removeElement(nums, k)
    print(result)
