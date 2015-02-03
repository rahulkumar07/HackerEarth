/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

 /*
 URL:http://www.hackerearth.com/problem/algorithm/prom-night/
           * Read input from stdin and provide input before running
*/
class PromNight {
       public static void main(String[] args) throws Exception {
       
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String usecase = br.readLine();
        int n_useCase = Integer.parseInt(usecase);
        StringBuilder Output = new StringBuilder();
        for (int i = 0; i < n_useCase; i++) {
            String student[] = br.readLine().split(" ");
            String boysHeight[] = br.readLine().split(" ");
            String girlsHeight[] = br.readLine().split(" ");
            List<Integer> boyS = new ArrayList<Integer>();
            List<Integer> girlS = new ArrayList<Integer>();
            for (int n = 0; n < boysHeight.length; n++) {
                boyS.add(Integer.parseInt(boysHeight[n]));
            }
            for (int n = 0; n < girlsHeight.length; n++) {
                girlS.add(Integer.parseInt(girlsHeight[n]));
            }
            Output.append(count(boyS, girlS)).append("\n");
        }

        System.out.println(Output);
    }

    public static String count(List<Integer> boyS, List<Integer> girlS) {
        //  List sortedListboyS = new ArrayList(boyS);
        Collections.sort(boyS);
        Collections.sort(girlS);
        Iterator<Integer> boySIt = boyS.iterator();
        Iterator<Integer> girlSIt = girlS.iterator();
        int count = 0;
        if (boyS.size() <= girlS.size()) {

            while (boySIt.hasNext()) {
                while (girlSIt.hasNext()) {
                    if (girlSIt.next().compareTo(boySIt.next()) == -1) {
                        boySIt.remove();
                        girlSIt.remove();
                        count++;
                        break;
                    }
                                        else{
                        return "NO";
                    }
                }
            }
            if (boyS.size() == 0) {
                return "YES";
            } else {
                return "NO";
            }

        } else {
            return "NO";
        }
        //return "NO";
    }
}
