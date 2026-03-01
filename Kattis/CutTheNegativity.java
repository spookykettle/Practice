import java.util.*;

public class CutTheNegativity {
    static Scanner inputt = new Scanner(System.in);

    public static void main(String[] args) {
        int n = inputt.nextInt();

        List<int[]> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int value = inputt.nextInt();
                if (value != -1) {
                    output.add(new int[]{i, j, value});
                }
            }
        }

        output.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        System.out.println(output.size());
        for (int[] f : output) {
            System.out.println(f[0] + " " + f[1] + " " + f[2]);
        }
    }
}