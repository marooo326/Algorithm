import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer val = Integer.parseInt(st.nextToken());
            nums.add(val);
        }
        Collections.sort(nums);
        System.out.println(nums.get(0) + " " + nums.get(n - 1));
    }
}