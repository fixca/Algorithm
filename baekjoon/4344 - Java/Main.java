import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++) {
            String[] inputs = br.readLine().split(" ");
            int N = Integer.parseInt(inputs[0]);
            double[] list = new double[N];
            double total = 0;
            for(int j = 0; j < N; j++) {
                double input = Double.parseDouble(inputs[j + 1]);
                total += input;
                list[j] = input;
            }
            double average = total / (double) N;
            int overAvg = 0;
            for(double element : list) {
                if(element > average) {
                    overAvg++;
                }
            }
            bw.write(String.format("%.3f", ((double) overAvg / (double) N) * 100.0) + "%\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }
}
