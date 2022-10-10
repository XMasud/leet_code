def asc_order_list(list_data, start=0):

    if start < len(list_data):
        print(list_data[int(start)])
        return asc_order_list(list_data, start + 1)

def des_order_list(list_data, start=0):
    if len(list_data) > 0:
        print(list_data[-1])
        list_data.pop(-1)
        des_order_list(list_data)

def des_order_same_list(list_data, start=0):
    if len(list_data) > start:
        list_data[-int(start)] = list_data[start]
        des_order_list(list_data, start + 1)


if __name__ == '__main__':
    input_list = ["h","e","l","l","o"]
    des_order_same_list(input_list)
