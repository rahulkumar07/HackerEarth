/*
Deepak like strings which are in flip flop in nature. For example, he likes XYXYX, while he doesn't like XXYX. Now he want to convert every string into a string which he likes. for this, he only delete the character in the string.

Now find the minimum number of delete operation which is required to covert a string that deepak likes.

Input Format :

The first line contains an integer N i.e the number of test cases. Next N lines contain a string each.

Output Format :

For each test case, print the minimum delete operation required.

Constraints :

1 <= N <= 10 1 <= length of String <= 10^5

Sample Input(Plaintext Link)
 5
XXXX
YYYYY
XYXYXYXY
YXYXYX
XXXYYY
Sample Output(Plaintext Link)
 3
4
0
0
4
Explanation
XXXX => X, 3 deletions
YYYYY => Y, 4 deletions
XYXYXYXY => XYXYXYXY, 0 deletions
YXYXYXYX => YXYXYXYX, 0 deletions
XXXYYY => XY, 4 deletions
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class FlipFlop {


    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char s[] = br.readLine().toCharArray();
            //char s2[] = br.readLine().toCharArray();
            int len = 0;
            char frst = s[0];
            char scnd = 'X';
            if (frst == 'X') {
                scnd = 'Y';
            }
            char temp = scnd;
            boolean found = false;
            for (int j = 1; j < s.length; j++) {
                if (s[j] != temp) {
                    len++;
                } else {
                    if(temp == frst){
                        temp=scnd;
                    }else{
                        temp=frst;
                    }
                }
            }
            sb.append(len + "\n");
        }
        System.out.println(sb);
    }
}

