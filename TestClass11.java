    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Roy and Profile Picture"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/mirror-of-mahatma-gandhi/
 Problem statement:On the way to Dandi March, Gandhijee carried a mirror with himself. 
When he reached Dandi, he decided to play a game with the tired people to give them some strength. 
At each turn of the game he pointed out a person and told him to say a number N(possibly huge) of his choice. 
The number was called lucky if that equals it's mirror image.

Input: 
First line contains number of test cases T. Each test case contains a single integer N.
Output: 
For each test case print "YES" if the number was lucky else print "NO" (quotes for clarity) in one line.

Constraints:
1 ≤ T ≤ 100
0 ≤ N ≤ 10100
 */
class TestClass10 {
                 public static void main(String[] args) throws Exception {
        /*
           * Read input from stdin and provide input before running
*/
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String usecase = br.readLine();
        int n_useCase = Integer.parseInt(usecase);
        StringBuilder Output = new StringBuilder();
        for (int i = 0; i < n_useCase; i++) {
            String inputSte = br.readLine();
            if (inputSte.contains("2") || inputSte.contains("3") ||
                inputSte.contains("4") || inputSte.contains("5") ||
                inputSte.contains("6") || inputSte.contains("7") ||
                inputSte.contains("9")) {
                Output.append("NO\n");
            } else {
                if(palindrome(inputSte).equals(inputSte)){
                    Output.append("YES\n");
                }
                else{
                    Output.append("NO\n");
                }
            }

        }

        System.out.println(Output);
    }

    public static String palindrome(String inpt) {
        char[] s=inpt.toCharArray();
            
        for (int i = inpt.length()-1, j = 0; i >= 0; i--, j++) {
            s[j] = inpt.charAt(i);
        }
        String s2 = new String(s);
        return s2;
    }
}


   
