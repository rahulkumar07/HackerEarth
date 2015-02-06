/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class PerfectlyLameBadHubby	 {
           public static void main(String args[] ) throws Exception {
            /*
             * Read input from stdin and provide input before running
    */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line);
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < N; i++) {
                String inpt[]=br.readLine().split(" " );
                String price []=br.readLine().split(" " );
                if(inpt[0].equals(inpt[1])){
                    sb.append("Perfect husband\n");
                }
                else if(Integer.parseInt(inpt[0]) <Integer.parseInt(inpt[1])){
                    sb.append("Bad husband\n");
                }
                else{
                    sb.append("Lame husband\n");
                }
            }
            

            System.out.println(sb);
        }
}
