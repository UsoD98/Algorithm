def solution(players, callings):
    hashtable = {string : i for i,string in enumerate(players)}
      
    for i in callings:
        idx = hashtable[i]
        hashtable[i] -= 1
        players[idx-1],players[idx] = players[idx],players[idx-1]
        hashtable[players[idx]] = idx
    return players