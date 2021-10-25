import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int countPrime = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(stringTokenizer.nextToken());
            if(input == 1) {
                continue;
            }
            int primeCount = 0;
            for(int j = 1; j <= input; j++) {
                if(input % j == 0) {
                    primeCount++;
                }
            }
            if(primeCount == 2) {
                countPrime++;
            }
        }
        bw.write(String.valueOf(countPrime));
        bw.flush();
        br.close();
        bw.close();
    }
}
