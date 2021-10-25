import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                stack.pop();
            }
            else {
                stack.push(input);
            }
        }
        int total = 0;
        for(int i = 0; i < stack.size(); i++) {
            total += stack.get(i);
        }
        bw.write(String.valueOf(total));
        bw.flush();
        br.close();
        bw.close();
    }
}
