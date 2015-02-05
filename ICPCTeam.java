/* IMPORTANT: class must not be public.
URL:http://www.hackerearth.com/tracks/pledge-2015-easy/icpc-team-management/*/
 
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import java.util.ArrayList;
import java.util.HashSet;
 
class ICPCTeam {
                        public static void main(String[] s) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        StringBuilder outp = new StringBuilder();
 
        for (int i = 1; i <= N; i++) {
            String counts[] = br.readLine().split(" ");
            int inpts = Integer.parseInt(counts[0]);
            int stdntsPerGrp = Integer.parseInt(counts[1]);
            int numbofGrps = inpts / stdntsPerGrp;
            HashSet<Integer> namelengthHS = new HashSet<Integer>();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int j = 0; j < inpts; j++) {
                char name[] = br.readLine().toCharArray();
                namelengthHS.add(name.length);
                ar.add(name.length);
            }
            if (stdntsPerGrp == 1 || namelengthHS.size() == 1) {
                outp.append("Possible\n");
            } else  {
 
                boolean possible = true;
                for (Integer k : namelengthHS) {
                    int count = 0;
                    for (Integer l : ar) {
                        if (l == k) {
                            count++;
                        }
                    }
                    if (count != 0 && count % stdntsPerGrp != 0) {
                        possible = false;
                    }
                }
                if (possible) {
                    outp.append("Possible\n");
                } else {
                    outp.append("Not possible\n");
                }
            } 
 
 
        }
        System.out.println(outp);
    }
}
Language: Java
