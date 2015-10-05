/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


class PrimeString {
	    public static void main(String[] args) throws Exception {
        /*
            * Read input from stdin and provide input before running
           */
         BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arList=new  ArrayList<Integer>();
        arList.add(2);
        for (int k = 3; k <50000; k+=2) {
                if(checkPrime(k)){
                arList.add(k);
                
                }
        }
        for (int i = 0; i < N; i++) {
          String s = br.readLine();
          int s2=Integer.parseInt(s);
            
            for (int j = 0; j< s2; j++) {
                
               sb.append( arList.get(j)+" " );
                
                }
           
            sb.append("\n");
           
        }

        System.out.println(sb);

    }


    private static boolean checkPrime(long n) {
               for (long i = 3; i <= Math.sqrt(n);i+=2 ) {
            if (n % i == 0)
                return false;
            
        }
        return true;
    }
 }
