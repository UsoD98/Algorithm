def solution(name, yearning, photo):
    result = []
    dic = {name : value for name,value in zip(name,yearning)}
    for i in photo:
        score = 0
        for j in i:
            if j in name:
                idx = dic[j]
                score += idx
        result.append(score)
    
    return result