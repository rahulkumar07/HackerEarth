    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Crazy kangaroo"
 * 
 * URL: http://www.hackerearth.com/september-easy-challenge/algorithm/crazy-kangaroo/
 Problem statement:
Little Jhool is a world renowned kangaroo trainer. He's now living in Australia, and is training kangaroos for his research project on mobile soccer. (We don't know the connection, too.) Anyway, for the project to be completed he observes kangaroos for a lot of time - because he wants to figure out the hop count for various kangaroos he's training.

Now, he makes a kangaroo stand at the starting point, and lets him jump to the finishing point - given the hop count of that particular kangaroo, figure out the number of jumps he would take between the starting point to the ending point. Both the starting point and the ending points are inclusive.

Note: He will jump only to those positions which are multiples of M or hop count.

Input:
First line contains number of test cases T. Next T lines contains three integers A, B and M separated by single space. A denoted the starting point, B the finishing point - and M, the hop count - the distance covered by that kangaroo in one jump.

Output: 
For each test case print the number of jumps the kangaroo had to make in the range [A, B] inclusive.

Constraints:
1<=T<=100000
1<=A<=B<=1012
1<=M<=1012
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
