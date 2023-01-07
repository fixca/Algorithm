/*
 * 아래 깃허브 링크로 코드와 함께 저의 헛소리를 구경 가능합니다
 * https://github.com/fixca/Algorithm/blob/main/baekjoon/1012 - Java/
 * 덕영고등학교 화이팅
 */

import java.io.*;

public class Main {

    // 상 하 좌 우
    static int[][] directions = { {0, 1}, {0, -1}, {-1, 0}, {1, 0} };

    static int M, N, K;

    static int[][] map = new int[51][51];

    static void run(int x, int y) {
        map[x][y] = 0;
        // 상 하 좌 우 탐색
        for (int i = 0; i < 4; i++) {
            int[] direction = directions[i];
            int newX = x + direction[0];
            int newY = y + direction[1];

            // x, y 가 음수 거나 x가 M 보다 크거나 Y가 N 보다 큰 경우 좌표평면을 벗어남
            if(newX < 0 || newY < 0 || newX >= M || newY >= N) {
                // 이 경우는 무효이기 때문에 처리 X
                continue;
            }
            // 인접한 배추 인가?
            if(map[newX][newY] == 1) {
                // 인접하니 0으로 처리 해버리고 인접한 부분에서 또
                // 인접한 부분 탐색
                run(newX, newY);
            }
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            K = Integer.parseInt(input[2]);

            // 배추가 있는 곳 init
            for (int j = 0; j < K; j++) {
                String[] coordinate = br.readLine().split(" ");
                int x = Integer.parseInt(coordinate[0]);
                int y = Integer.parseInt(coordinate[1]);
                map[x][y] = 1;
            }

            // 필요한 벌레 수
            int count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] == 1) {
                        // run 1회 = 벌레 1마리
                        run(i, j);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");

            /* 마지막에 배열 초기화 안해줘도 되는게
             * 1이 표시되어 있는 부분을 인접한 부분까지 연쇄적으로 0
             * 으로 만들어 버리는게 1 마리가 필요한 거라서
             * 결국 다 돌고 나면 배열의 index 가 전부 0으로
             * 도배 되어있음 그래서 초기화 안해줘도 됨
             */

        }

        br.close();
        bw.flush();
        bw.close();
    }

}