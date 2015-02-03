    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Complete String"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/complete-string-4/
 Problem statement:
A string is said to be complete if it contains all the characters from a to z. Given a string, check if it complete or not.

Input
First line of the input contains the number of strings N. It is followed by N lines each contains a single string.

Output
For each test case print "YES" if the string is complete, else print "NO"

Constraints
1 <= N <= 10
The length of the string is at max 100 and the string contains only the characters a to z
 */
class TestClass9 {
           public static void main(String[] args) throws Exception {
        /*
           * Read input from stdin and provide input before running
*/
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        StringBuilder Output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String inputStr = br.readLine();
            if (inputStr.contains("a") && inputStr.contains("b") &&
                inputStr.contains("c") && inputStr.contains("d") &&
                inputStr.contains("e") && inputStr.contains("f") &&
                inputStr.contains("g") && inputStr.contains("h") &&
                inputStr.contains("i") && inputStr.contains("j") &&
                inputStr.contains("k") && inputStr.contains("l") &&
                inputStr.contains("m") && inputStr.contains("n") &&
                inputStr.contains("o") && inputStr.contains("p") &&
                inputStr.contains("q") && inputStr.contains("r") &&
                inputStr.contains("s") && inputStr.contains("t") &&
                inputStr.contains("u") && inputStr.contains("v") &&
                inputStr.contains("w") && inputStr.contains("x") &&
                inputStr.contains("y") && inputStr.contains("z")){
                    Output.append("YES\n");
            }else{
                Output.append("NO\n");
            }
                
        }

        System.out.println(Output);
    }
}


   
