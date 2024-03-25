import java.util.ArrayList;
import java.util.Comparator;

class Solution
{
    public int solution(int []A, int []B)
    {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        
        for(int i=0;i<A.length;i++){
            listA.add(A[i]);
            listB.add(B[i]);
        }
        listA.sort(Comparator.naturalOrder());
        listB.sort(Comparator.reverseOrder());
        
        int answer = 0;
        
        for(int i=0;i<A.length;i++){
            answer += listA.get(i)*listB.get(i);
        }
        
        return answer;
    }
}