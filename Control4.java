import java.util.*;
// break문
class Control4_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) { // 무한반복문
            if (sum > 100)
                break; // sum > 100만족 -> 바로 while문 종료
            ++i; // 바로 증가
            sum += i; // sum에 계속 더함
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}

// continue문
class Control4_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) { // 3의 배수이면 continue
                continue; // 밑에 출력 X -> 다음 증감식으로 이동
            }
            System.out.println(i);
        }
    }
}

class Control4_3 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료 : 0) >>>");

            String tmp = scanner.nextLine(); // 사용자 입력값 -> tmp 저장
            menu = Integer.parseInt(tmp); // 사용자 입력 문자열 -> 숫자형 변환

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // while문 종료
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
                continue; // 메뉴 안내부터 다시
            }
            System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
        }
    }
}

// 이름 붙은 반복문
class Control4_4 {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <= 9; i++) {
            Loop2 : for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1; // 2단 4까지 출력
                }
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}

class Control4_5 {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <= 9; i++) {
            Loop2 : for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop2; // 1~9단 4까지 출력
                }
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}