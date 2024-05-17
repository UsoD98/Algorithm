def solution(new_id):
    alp = [chr(i) for i in range(ord('a'),ord('z')+1)]
    num = ['0','1','2','3','4','5','6','7','8','9']
    cod = ['-','_','.']
    rep = ['.'*i for i in range(len(new_id),1,-1)]
    cnt = len(new_id)
    #1단계
    for i in alp:
        if i.upper() in new_id:
            new_id = new_id.replace(i.upper(),i)
    print(1,new_id)
    #2단계
    for i in new_id:
        if i not in alp and i not in cod and i not in num:
            new_id = new_id.replace(i,'')
    print(2,new_id)
    #3단계
    for i in rep:
        if i in new_id:
            new_id =  new_id.replace(i,'.')
    print(3,new_id)
    # 4단계
    # new_id의 처음이나 끝에 "." 있을 경우 슬라이싱해서 빼버리기
    while new_id.startswith(".") or new_id.endswith("."):
        if new_id.startswith("."):
            new_id = new_id[1:]
        if new_id.endswith("."):
            new_id = new_id[:-1]

    print(4,new_id)
    #5단계
    if len(new_id) == 0:
        new_id = 'a'
    print(5,new_id)
    #6단계
    if len(new_id) >= 16:
        new_id = new_id[:15]
        while new_id[-1] == '.':
            new_id = new_id[:-1]
    print(6,new_id)
    #7단계
    for i in range(3):
        if len(new_id) <= 2:
            new_id += new_id[-1]
    print(7,new_id)
    return new_id