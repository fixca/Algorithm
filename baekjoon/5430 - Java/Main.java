import java.io.*;
import java.util.*;

public class Main {

    public static void makeDeque(Deque<Short> list, String string) {
        String[] strings = string.replaceAll("\\[|\\]", "").split(",");
        for(String s : strings) {
            list.add(Short.parseShort(s));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            Deque<Short> list = new ArrayDeque<>();
            String command = br.readLine();
            int length = Integer.parseInt(br.readLine());
            String arrayT = br.readLine();
            if(length != 0) {
                makeDeque(list, arrayT);
            }
            boolean reverse = false;
            boolean error = false;
            for(int j = 0; j < command.length(); j++) {
                if(command.charAt(j) == 'R') {
                    reverse = !reverse;
                }
                else {
                    if(list.size() == 0) {
                        bw.write("error\n");
                        error = true;
                        break;
                    }
                    if(!reverse) {
                        list.pollFirst();
                    }
                    else {
                        list.pollLast();
                    }
                }
            }
            if(!error) {
                if(reverse) {
                    ArrayList list1 = new ArrayList();
                    list.descendingIterator().forEachRemaining(string -> list.add(string));
                    bw.write((Arrays.toString(list1.toArray()) + "\n").replaceAll(" ", ""));
                }
                else {
                    bw.write((Arrays.toString(new ArrayList(list).toArray()) + "\n").replaceAll(" ", ""));
                }
            }
        }
        br.close();
        bw.close();
    }
}
