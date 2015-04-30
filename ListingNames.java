/*
A list of names is taken as input, in which a particular name can occur multiple times. You need to arrange these names as they will appear in the dictionary and also print the number of times the arranged names appear in the list taken as input.

Input:

The first line of input contains an integer, t, which denotes the number of names that will follow.

Then, t lines follow, each containing a name, in the form of a character string S.

Output:

The output contains the names as they would appear in the dictionary, followed by the frequency of that name in the list.

Constraints:

1<=t<=100000 1<=|S| <=30 S contains only lower case characters.

Sample Input(Plaintext Link)
 3
ritesh
sahil
ritesh
Sample Output(Plaintext Link)
 ritesh 2
sahil 1
Explanation
Test Case #1:


As the name starts from 'r' comes first then 's' in dictionary and in this case the 'ritesh' name is given 2 times and 'sahil' is given only once so their frequency is coming and remove the duplicate rows.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class1 {


    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        ArrayList sort = new ArrayList();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (sort.contains(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
            sort.add(s);
        }
        Collections.sort(sort);
        LinkedHashSet<String> hs = new LinkedHashSet(sort);
        // String arr[] = (String[])hs.toArray();
        for (String s : hs) {
            sb.append(s +" "+hm.get(s)+ "\n");
        }
        System.out.println( sb);
    }
}

