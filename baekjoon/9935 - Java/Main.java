import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String second = br.readLine();
        int secondLength = second.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            boolean flag = true;
            int stackSize = stack.size();
            if(stackSize >= secondLength) {
                for(int j = 0; j < secondLength; j++) {
                    if(stack.get(stackSize - secondLength + j) != second.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    for (int j = 0; j < secondLength; j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.print("FRULA");
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(Character c : stack) {
                sb.append(c);
            }
            System.out.print(sb);
        }

        br.close();
    }
}