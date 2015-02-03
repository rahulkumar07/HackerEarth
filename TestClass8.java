    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Alien language"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/karan-and-even-numbers-1/
 Problem statement:
Karan likes even numbers very much. He has a very long list of numbers. You just need to print the even numbers from the list. The list ends when -1 is encountered.

Input: The list.

Output: Print even numbers from the list, one per line.

Constraints: -1 <= i <= 10^9
 */
class TestClass8 {
        public static void main(String[] args) throws Exception {
        /*
           * Read input from stdin and provide input before running
*/
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //int N = Integer.parseInt(line);
        StringBuilder Output = new StringBuilder();
        while (!line.equals("-1")) {
            line = br.readLine();
            if (Long.valueOf(line) % 2 == 0) {
                Output.append(line + "\n");
            }

        }
        System.out.println(Output);
    }
}


   
