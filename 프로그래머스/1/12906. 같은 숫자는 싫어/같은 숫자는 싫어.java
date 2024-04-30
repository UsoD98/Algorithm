import java.util.*;  
public class Solution {     
    public int[] solution(int[] arr) {         
        List<Integer> answer = new ArrayList<>();         
        int prev = -1;                  
        for (int data : arr) {             
            if (data != prev) {                 
                answer.add(data);                 
                prev = data;             
            }         
        }                  
        return answer.stream().mapToInt(Integer::intValue).toArray();     
    } 
} 