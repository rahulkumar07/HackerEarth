    
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    /*
             Tried to solve the problem "The best Internet Browser"
             URL: http://www.hackerearth.com/problem/algorithm/the-best-internet-browser-3/
    */
    class TestClass1 {
        public static void main(String args[] ) throws Exception {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line);
            ArrayList<String> ar=new ArrayList<String>();
            for (int i = 0; i < N; i++) {
               // BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                ar.add(br.readLine());
            }
            
            //System.out.println(x.length() + "/" + callMethod(x));
            for(int i=0;i<ar.size();i++){
                System.out.println( callMethod(ar.get(i)) + "/" +ar.get(i).length());
            }
           
        }
        
        
        private static int callMethod(String s) {
    
            s =
        s.replaceAll("e", "").replaceAll("a", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u",
                                                                                    "");
            System.out.println(s);
            return s.length() - 3;
        }
    }
