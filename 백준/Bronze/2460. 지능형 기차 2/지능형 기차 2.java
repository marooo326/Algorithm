
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int current = 0;
        int max = -1;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Integer in = Integer.parseInt(st.nextToken());
            Integer out = Integer.parseInt(st.nextToken());
            current = current - in + out;
            if (current >= max) max = current;
        }
        System.out.println(max);
    }
}
