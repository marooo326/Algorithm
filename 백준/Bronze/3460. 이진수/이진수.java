import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(br.readLine());
        List<Integer> ts = new ArrayList<>();
        for (int i = 0; i < t; ++i) {
            ts.add(Integer.parseInt(br.readLine()));
        }

        for (Integer val : ts) {
            Integer idx = 0;
            while (val != 0) {
                if (val % 2 == 1) {
                    System.out.print(idx + " ");
                }
                val /= 2;
                ++idx;
            }
            System.out.println();
        }
    }
}
