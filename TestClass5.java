    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Alien language"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/alien-language/
 Problem statement:
Little Jhool considers Jaadu to be a very close friend of his. But, he ends up having some misunderstanding with him a lot of times, because Jaadu's English isn't perfect, and Little Jhool sucks at the language Jaadu speaks. So, he's in a fix - since he knows that Jaadu has got magical powers, he asks him to help so as to clear all the issues they end up having with their friendship.

Now, Jaadu can only focus at one task, so to fix these language issues he comes up with a magical way out, but someone needs to do the rest of it; this is where Little Jhool has asked for your help.

Little Jhool says a word, and then Jaadu says another word. If any sub-string of the word said by Jaadu is a sub-string of the word said by Little Jhool, the output should be "YES", else "NO". (Without the quotes.)

Input:
First line contains number of test case T. Each test case contains two strings Text ( Said by Jhool ) and Pattern (Said by Jaadu ).Both strings contains only lowercase alphabets ['a'-'z'].

Output:
For each test case print YES if any sub-string of Pattern is sub-string of Text else print NO.

Constraints: 
1<=T<=5
1<=|Text|<=100000
1<=|Pattern|<=100000
 */
class TestClass5 {
        public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < 2 * N; i++) {
            ar.add(br.readLine());

        }
        for (int i = 0; i < 2 * N; ) {
          String jaaduTxt=ar.get(i);
            if(jaaduTxt.contains(ar.get(i+1))){
                output.append("YES\n");
            }else{
                output.append("NO\n");
            }
            i=i+2;
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
