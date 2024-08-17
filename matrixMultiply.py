import numpy as np
def matrixMultiply(A,B,C,n):
    if n == 1:
        C[0][0] += A[0][0] * B[0][0]
        return
    #Divide
    A11 = A[:n//2,:n//2]
    A12 = A[:n//2,n//2:]
    A21 = A[n//2:,:n//2]
    A22 = A[n//2:,n//2:]
    
    B11 = B[:n//2,:n//2]
    B12 = B[:n//2,n//2:]
    B21 = B[n//2:,:n//2]
    B22 = B[n//2:,n//2:]
    
    C11 = C[:n//2,:n//2]
    C12 = C[:n//2,n//2:]
    C21 = C[n//2:,:n//2]
    C22 = C[n//2:,n//2:]
    
    #Conquer
    matrixMultiply(A11,B11,C11,n//2)
    matrixMultiply(A11,B12,C12,n//2)
    matrixMultiply(A21,B11,C21,n//2)
    matrixMultiply(A21,B12,C22,n//2)
    matrixMultiply(A12,B21,C11,n//2)
    matrixMultiply(A12,B22,C12,n//2)
    matrixMultiply(A22,B21,C21,n//2)
    matrixMultiply(A22,B22,C22,n//2)
n = 4
A = np.arange(n*n).reshape(n,n)
B = np.arange(n*n).reshape(n,n)
C = np.zeros((n,n), dtype=int)
print(A)
print(B)
matrixMultiply(A,B,C,len(A[0]))
print(C)
