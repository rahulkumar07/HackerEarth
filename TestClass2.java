    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    
    import java.util.ArrayList;

/*Solution to hackerEarth of the Problem"Girlfriend's demands"
 * 
 * URL: http://www.hackerearth.com/problem/algorithm/girlfriends-demands/
 Problem statement:
Like most of the girlfriends, Ashima when asks for something, won’t stop until she gets that.
The way she gets that is by keep on repeating the same things again and again. Like if she wants chocolate, she will just keep on repeating “chocolate” again and again. 

I have decided to answer to her demands as “Yes” or “No” by not delaying a lot. Otherwise, there would be a lot of repercussions. So, randomly at certain intervals, I just answer with “Yes” or “No” using the following rule, I will just select two integers a and b, if the element at the position a is same as the element as position b in the non-ending chant by Ashima, I will speak “Yes”, otherwise say “No”. 

Your job is to find my side of the conversation given the name of the demand Ashima has and the random integers I picked. 

Input:
First line of the input contains a string S, the name of the item she is demanding.
Next line contains an integer Q, the number of pairs of integers that used to say “Yes” or “No” to her. These pairs are given in order.
Next Q line, each contains 2 integers, a and b. (1-based indexing) 

Output:
For each query, print “Yes” or “No” as described above.

Constraints:
1 ? |S| ? 105
1 ? Q ? 105
1 ? a, b ? 1018
 */
class TestClass2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String demandedText = br.readLine();
        int N = Integer.parseInt(br.readLine());
      //  int size = demandedText.length();
        StringBuilder output = new StringBuilder();
        String indices[];
        for (int i = 0; i < N; i++) {
            indices = br.readLine().split(" ");
            output =
                    output.append(matchSeq(demandedText, Long.parseLong(indices[0]),
                                           Long.parseLong(indices[1])));
        }
        System.out.println(output);

    }

    public static String matchSeq(String seq, Long startIndex, Long endIndex) {
        String retStr = "No\n";
        while (seq.length() < startIndex || seq.length() < endIndex) {
            if (startIndex > seq.length()) {
                startIndex = startIndex % seq.length();
                if (startIndex.intValue() == 0) {
                    startIndex = Long.parseLong(String.valueOf(seq.length()));
                }
            }
            if (endIndex > seq.length()) {
                endIndex = endIndex % seq.length();
                if (endIndex.intValue() == 0) {
                    endIndex = Long.parseLong(String.valueOf(seq.length()));
                }
            }

        }
        if (seq.charAt(startIndex.intValue() - 1) ==
            seq.charAt(endIndex.intValue() - 1))
            retStr = "Yes\n";

        return retStr;
    }
}
