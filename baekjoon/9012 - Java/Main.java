import java.io.*;
import java.util.Stack;

public class Main {

    public static boolean pop(Stack<Boolean> stack) {
        if(stack.size() == 0) {
            return false;
        }
        return stack.pop();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            Stack<Boolean> stack = new Stack<>();
            String string = br.readLine();
            boolean error = false;
            for(int j = 0; j < string.length(); j++) {
                if(string.charAt(j) == '(') {
                    stack.push(true);
                }
                else {
                    if(!pop(stack)) {
                        error = true;
                        break;
                    }
                }
            }
            if(error) {
                bw.write("NO\n");
                continue;
            }
            bw.write(stack.size() != 0 ? "NO" : "YES");
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
