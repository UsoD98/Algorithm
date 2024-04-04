def solution(s):
    num = '0,1,2,3,4,5,6,7,8,9'
    s += '*'
    word = ''
    sentence = []
    answer = ''
    for i in s.lower():
        word += i
        if i == ' ' or i == '*':
            sentence.append(word)
            word = ''
            
    for i in sentence:
        answer += i[0].upper()
        answer += i[1:]
        
    answer = answer.replace('*','')
    return answer