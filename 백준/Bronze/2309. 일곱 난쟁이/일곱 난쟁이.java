import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean ck = false;
        Integer sum = 0;
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            final int h = Integer.parseInt(br.readLine());
            heights.add(h);
            sum += h;
        }
        Collections.sort(heights);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if ((sum - heights.get(i) - heights.get(j)) == 100) {
                    heights.remove(j);
                    heights.remove(i);
                    ck = true;
                    break;
                }
            }
            if (ck) break;
        }

        for (Integer height : heights) {
            bw.write(height + "\n");
            bw.flush();
        }

        bw.close();
    }
}

