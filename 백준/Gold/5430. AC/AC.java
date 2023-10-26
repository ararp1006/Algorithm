import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            String p = sc.next(); // 수행할 함수
            int n = sc.nextInt(); // 배열의 크기
            String arrString = sc.next(); // 배열을 나타내는 문자열
            arrString = arrString.substring(1, arrString.length() - 1); // 대괄호 제거
            String[] arr = arrString.split(","); // 문자열을 쉼표를 기준으로 배열로 분할

            boolean reverse = false;
            boolean error = false;

            Deque<Integer> deque = new ArrayDeque<>();
            for (String s : arr) {
                if (!s.equals("")) {
                    deque.add(Integer.parseInt(s));
                }
            }

            StringBuilder result = new StringBuilder();
            for (char cmd : p.toCharArray()) {
                if (cmd == 'R') {
                    reverse = !reverse;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reverse) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (error) {
                System.out.println("error");
            } else {
                result.append("[");
                if (reverse) {
                    while (!deque.isEmpty()) {
                        result.append(deque.pollLast());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                } else {
                    while (!deque.isEmpty()) {
                        result.append(deque.pollFirst());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                }
                result.append("]");
                System.out.println(result.toString());
            }
        }
    }
}
