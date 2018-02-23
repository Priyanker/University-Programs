import java.util.*;
import java.util.HashMap;
class SimilarRemainders {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n,k;
        n = scan.nextInt();
        k=scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++)
        {
            map.put(i,i%k);
        }
        int[][] arr = new int[n][n/2];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            List<Integer> keys = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry:map.entrySet())
            {
                if(entry.getValue().equals(i))
                {
                    keys.add(entry.getKey());
                }
            }
            list.add(keys);
        }
           //System.out.println(list);
           StringBuilder sb = new StringBuilder();
           int count=0;
        for(List<Integer> list2:list)
        {
            for(int i=0;i<list2.size()-1;i++)
            {
                for(int j=i+1;j<list2.size();j++)
                {
                    //sb.append("("+list2.get(i)+","+list2.get(j)+")"+",");
                    count++;
                }
            }
        }
        //sb.deleteCharAt(sb.length()-1);
        //sb.append(".");
        System.out.println(count);
    }
}
