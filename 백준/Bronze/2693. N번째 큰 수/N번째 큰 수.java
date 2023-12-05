
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            List<Integer> nums = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            Collections.sort(nums, Collections.reverseOrder());
            bw.write(nums.get(2) + "\n");
        }
        bw.flush();
    }
}