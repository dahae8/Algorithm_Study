import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        Map<Long, Integer> card = new HashMap<>();

        long a=0;
        card.put(a,0);

        for(int i =0;i<tc;i++){
            Long k = Long.parseLong(br.readLine());
            if(card.containsKey(k)){
                card.put(k,card.get(k)+1);
            }
            else card.put(k,1);

            if(card.get(a)<card.get(k))a=k;
            //map에 들어가는 value값이 자료의 기본형이 아닌(int) 객체(Integer)이므로,
            // == 연산시 객체의 주소 값을 비교하게 됩니다.
            //따라서, equals() 메소드를 사용하여 객체의 주소 값이 아닌, 객체가 가지고 있는 int 값을 비교하면 됩니다.
            else if(card.get(a).equals(card.get(k)) & a>k){
                a=k;
            }
        }
        System.out.print(a);
    }
}