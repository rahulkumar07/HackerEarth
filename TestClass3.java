    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Small Factorials"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/small-factorials/
 Problem statement:
You are asked to calculate factorials of some small positive integers.

Input
An integer T, denoting the number of testcases, followed by T lines, each containing a single integer N.

Output 
For each integer N given at input, output a single line the value of N!

Input Constraint

1 <= T <= 100 
1 <= N <= 100
 */
class TestClass3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        String number;
        for (int i = 0; i < N; i++) {
            number = br.readLine();
            output =
                    output.append(findFactorial(Integer.parseInt(number))).append("\n");
        }
        System.out.println(output);

    }

    public static long findFactorial(int num) {
        long l=1;
        for (int i=1;i<=num;i++){
            l=l*i;
        }
       return l;
    }
}
