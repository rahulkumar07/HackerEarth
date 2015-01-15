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
class TestClass4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //  int size = demandedText.length();
        StringBuilder output = new StringBuilder();
        String indices[];
        for (int i = 0; i < N; i++) {
            indices = br.readLine().split(" ");
            Long startIndex = Long.parseLong(indices[0]);
            Long endIndex = Long.parseLong(indices[1]);
            Long hopCount = Long.parseLong(indices[2]);
            long startJumps = startIndex / hopCount;
            long endJumps = endIndex / hopCount;
            output = output.append(endJumps - startJumps).append("\n");
        }
        System.out.println(output);

    }

    public static long jumpCounts(Long a, Long b,Long c) {
    
        //       long startJumps=startIndex/hopCount;
        //       long endJumps=endIndex/hopCount;
        //        return endJumps-startJumps;
                    int count=0;
                        for(long j=a;j<=b;j++){
                                if(j%c==0){
                                        count++;
                                }
                        } 
                        return count;
    }
}
