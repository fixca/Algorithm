public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = N; i > 0; i--) {
            int token = Integer.parseInt(strings[i - 1]);
            hashMap.put(token, 0);
            if(stack.size() > 0 && stack.peek() < token) {
                int size = stack.size();
                for(int j = 0; j < size; j++) {
                    if(stack.peek() < token) {
                        hashMap.put(stack.pop(), i);
                    }
                    else {
                        break;
                    }
                }
            }
            stack.push(token);
        }
        StringBuilder sb = new StringBuilder();
        for(String string : strings) {
            sb.append(hashMap.get(Integer.parseInt(string)) + " ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        br.close();
        bw.close();
    }
}
