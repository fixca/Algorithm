import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static class Contact {
        private int age;
        private String number;
        private String name;

        public Contact(String name, String number, int age) {
            this.name = name;
            this.number = number;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "age=" + age +
                    ", number='" + number + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Contact copy() {
            return new Contact(this.name, this.number, this.age);
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void swap(List<Contact> list, int a, int b) {
        Contact contact = list.get(a).copy();
        list.set(a, list.get(b));
        list.set(b, contact);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Contact> list = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(new Contact(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken())));
        }
        int max;
        for(int i = 0; i < list.size(); i++) {
            max = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(j).getAge() > list.get(max).getAge()) {
                    max = j;
                }
            }
            swap(list, i, max);
        }
        for(Contact contact : list) {
            bw.write(contact.toString() + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

/*
입력값 :

3
강하나 010-2345-2345 30
박희수 010-2266-3796 23
이정철 010-9876-7654 24

출력값:

Contact{age=30, number='010-2345-2345', name='강하나'}
Contact{age=24, number='010-9876-7654', name='이정철'}
Contact{age=23, number='010-2266-3796', name='박희수'}
* */
