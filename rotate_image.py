def rotate(matrix):

    matrix_length = len(matrix)
    if matrix_length > 0 & matrix_length < 21:
        for value in matrix:
            if len(value) != matrix_length:
                return

    output_list = []
    for i in range(0, matrix_length):
        row_to_column_list = []
        for j in range(matrix_length, 0, -1):
            if matrix[j-1][i] >= -1000 & matrix[j-1][i] <= 1000:
                row_to_column_list.append(matrix[j - 1][i])

        if len(row_to_column_list) > 0:
            output_list.append(row_to_column_list)

    return output_list


if __name__ == '__main__':
    nums =  [[1,2,3],[4,5,6],[7,8,9]]
    result = rotate(nums)
    print(result)