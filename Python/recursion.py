def asc_order_list(list_data, start=0):

    if start < len(list_data):
        print(list_data[int(start)])
        return asc_order_list(list_data, start + 1)

def des_order_list(list_data):
    if len(list_data) > 0:
        print(list_data[-1])
        list_data.pop(-1)
        des_order_list(list_data)

def des_order_same_list(list_data, start=0):
    if len(list_data) > start:
        list_data[-int(start)] = list_data[start]
        des_order_list(list_data, start + 1)

def loop_reverse(list_data):
    index = 0
    for i in list_data:
        index = index + 1
        print(index, i)


    print(list_data)

if __name__ == '__main__':
    input_list = ["h","e","l","l","o"]
    loop_reverse(input_list)
