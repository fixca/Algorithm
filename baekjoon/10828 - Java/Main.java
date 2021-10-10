import java.io.*;
import java.util.*;

public class Main {

    public static int pop(Stack<Integer> stack) {
        if(stack.size() == 0) {
            return -1;
        }
        return stack.pop();
    }

    public static int top(Stack<Integer> stack) {
        if(stack.size() == 0) {
            return -1;
        }
        return stack.lastElement();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            switch (input.split(" ")[0]) {
                case "push" :
                    stack.push(Integer.parseInt(input.split(" ")[1]));
                    break;
                case "top":
                    bw.write(top(stack) + "\n");
                    break;
                case "size" :
                    bw.write(stack.size() + "\n");
                    break;
                case "empty" :
                    bw.write(stack.empty() ? "1\n" : "0\n");
                    break;
                case "pop" :
                    bw.write(pop(stack) + "\n");
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
