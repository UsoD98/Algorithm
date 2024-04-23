def solution(n):
    answer = ''
    if n % 2 != 0:
        return "수박"*(n//2)+"수"
    return "수박"*(n//2)