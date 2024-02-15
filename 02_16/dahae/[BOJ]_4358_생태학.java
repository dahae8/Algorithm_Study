import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
  static class Fun implements Comparable<Fun> {
    String s;
    double cnt;

    public Fun(String s, double i) {
      this.s = s;
      this.cnt = i;
    }

    @Override
    public int compareTo(Fun f) {
      return (int) this.s.compareTo(f.s);
    }

  }

  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int t=0;
        HashMap<String,Integer> hash = new HashMap<>();
        while((s= br.readLine())!=null){
            t++;
            if(hash.containsKey(s)){
                int newNum = hash.get(s) + 1;
                hash.remove(s);
                hash.put(s, newNum);
            }s
            else hash.put(s,1);
        }
        PriorityQueue<Fun>pq = new PriorityQueue<>();
        for(Map.Entry<String, Integer> ent : hash.entrySet()){
            pq.add(new Fun(ent.getKey(),(double) ent.getValue()*100/t));
        }
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb =new StringBuilder();
        while(!pq.isEmpty()){
            Fun f = pq.poll();
            sb.append(f.s).append(' ').append(String.format("%.4f", f.cnt)).append("\n");
        }
        System.out.println(sb);

    }

}
