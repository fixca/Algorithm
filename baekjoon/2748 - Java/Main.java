/*
 * 아래 깃허브 링크로 코드와 함께 저의 헛소리를 구경 가능합니다
 * https://github.com/fixca/Algorithm/blob/main/baekjoon/2748 - Java/
 */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = new long[100];

        dp[0] = 0;
        dp[1] = 1;

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        bw.write(dp[n] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}