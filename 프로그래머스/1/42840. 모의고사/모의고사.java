import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int i=0;
        int a=0;
        int b=0;
        int c=0;
        int max=0;
        
        while(i<answers.length){
            
            if(answers[i]==person1[a]) {
                answer[0]+=1;
            }
            if(answers[i]==person2[b]) {
                answer[1]+=1;
            }
            if(answers[i]==person3[c]) {
                answer[2]+=1;
            }
            
            if(max<answer[0]) max=answer[0];
            if(max<answer[1]) max=answer[1];
            if(max<answer[2]) max=answer[2];
            
            a += 1;
            b += 1;
            c += 1;
            if(a%person1.length==0) a=0;
            if(b%person2.length==0) b=0;
            if(c%person3.length==0) c=0;
            i += 1;
        }
        
        for(int j=0;j<answer.length;j++){
            if(answer[j]==max) list.add(j+1);
        }
        
        return list;
    }
}