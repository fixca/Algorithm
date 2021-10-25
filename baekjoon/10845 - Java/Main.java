import java.io.*;
import java.util.*;

public class Main {

    public static int back(Deque<Integer> queue) {
        if(queue.size() == 0) {
            return -1;
        }
        return queue.getLast();
    }

    public static int front(Deque<Integer> queue) {
        if(queue.size() == 0) {
            return -1;
        }
        return queue.peek();
    }

    public static int pop(Deque<Integer> queue) {
        if(queue.size() == 0) {
            return -1;
        }
        return queue.poll();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            switch (input.split(" ")[0]) {
                case "push" :
                    queue.addLast(Integer.parseInt(input.split(" ")[1]));
                    break;
                case "pop":
                    bw.write(pop(queue) + "\n");
                    break;
                case "size" :
                    bw.write(queue.size() + "\n");
                    break;
                case "empty" :
                    bw.write(queue.size() == 0 ? "1\n" : "0\n");
                    break;
                case "front" :
                    bw.write(front(queue) + "\n");
                    break;
                case "back":
                    bw.write(back(queue) + "\n");
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
