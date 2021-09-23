import numpy

def DeleteString(matrix, r, c):
    k = len(matrix) - 1
    mtr2 = numpy.zeros((k, k))
    p = 0
    for i in range(len(matrix)):
        if i == r:
            continue
        q = 0
        for j in range(len(matrix[i])):
            if j == c:
                continue
            mtr2[p][q] = matrix[i][j]
            q = q + 1
        p = p + 1
    return mtr2


def Determinant(matrix, m):
    d = 0
    o = 1
    n = m - 1
    if m == 1:
        d = matrix[0][0]
        return d
    if m == 2:
        d = matrix[0][0] * matrix[1][1] - (matrix[1][0] * matrix[0][1])
        return d
    if m > 2:
        for i in range(m):
            d = d + o * matrix[i][0] * Determinant(DeleteString(matrix, i, 0), n)
            o = - o
    return d


matr = []
with open("input3.txt") as f:
    for line in f:
        matr.append([float(x) for x in line.split()])

m = Determinant(matr, len(matr))
f = open('output.txt', 'a')
f.write(str(int(m))+' ')
f.close

matr = []
with open("input10.txt") as f:
    for line in f:
        matr.append([float(x) for x in line.split()])

m = Determinant(matr, len(matr))
f = open('output1.txt', 'a')
f.write(str(int(m))+' ')
f.close