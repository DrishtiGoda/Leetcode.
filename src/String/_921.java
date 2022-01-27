
/*A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Input: s = "())"
Output: 1
*/

package String;

public class _921 {
    public int minAddToMakeValid(String s) {

        int close = 0;
        int open = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                close++;
            }else{
                if(close == 0){
                    open++;
                }else{
                    close--;
                }
            }
        }
        return open + close;
    }
}
