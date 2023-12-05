
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> nums = new ArrayList<>();
        Integer a = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());

        if (a > b) {
            Integer temp = b;
            b = a;
            a = temp;
        }

        int copyA = a;
        int copyB = b;

        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                while (copyA % i == 0) {
                    nums.add(i);
                    copyA /= i;
                }
            }
        }
        if (copyA != 1) {
            nums.add(copyA);
        }

        int gcd = 1;
        for (Integer num : nums) {
            if (b % num == 0) {
                gcd *= num;
                b /= num;
            }
        }
        bw.write(gcd + "\n");
        bw.write(a * b + "");
        bw.flush();
    }
}
