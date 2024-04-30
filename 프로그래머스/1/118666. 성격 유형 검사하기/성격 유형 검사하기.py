def solution(survey, choices): 
    choice = [1,2,3,4,5,6,7]
    score = [3,2,1,0,-1,-2,-3]
    scr = []
    result = {'R':0,'T':0,'C':0,'F':0,'J':0,'M':0,'A':0,'N':0}
    answer = ''
    dic = {}
    for i in choices:
        scr.append(score[choice.index(i)])
    print(scr)

    for i,j in zip(survey,scr):
        if i not in dic:
            dic[i] = j
        else:
            dic[i] += j
    print(dic)
           
    for key,value in dic.items():
        key = ','.join(key)
        
        if value >= 0:
            result[key[0]] += value
        else:
            result[key[-1]] -= value
    print(result)

    
    for i in range(0,8,2):
        if list(result.values())[i] >= list(result.values())[i+1]:
            answer += list(result.keys())[i]
        else:
            answer += list(result.keys())[i+1]
    
    return answer