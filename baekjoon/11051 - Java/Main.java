/*
 * 아래 깃허브 링크로 코드와 함께 저의 헛소리를 구경 가능합니다
 * https://github.com/fixca/Algorithm/blob/main/baekjoon/11051 - Java/
 */

import java.io.*;

public class Main {

    static long[][] dp = new long[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 10007;
            }
        }

        bw.write(dp[N][K] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}