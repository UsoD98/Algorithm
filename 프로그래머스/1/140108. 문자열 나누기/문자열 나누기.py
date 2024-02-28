def solution(s):
    arr = []
    cnt = 0 
    for i in s:
        arr.append(i)
        if arr.count(arr[0]) == len(arr) - arr.count(arr[0]):
            cnt += 1
            arr=[]        
    if len(arr) != 0:
        cnt += 1
            
    return cnt