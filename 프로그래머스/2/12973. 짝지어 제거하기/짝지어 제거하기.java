import java.util.ArrayList;
import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        // ArrayList<String> list = new ArrayList<>();
        // for(char i='a';i<='z';i++){
        //     list.add(i+""+i);
        // }
        // for(String data : list){
        //     while(s.contains(data)){
        //         s=s.replace(data,"");
        //     }
        // }
        // if(s.length()!=0) return 0;
        // else return 1;
        // 비효율적 => 스택으로 풂
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) return 1;
        else return 0;
    }
}