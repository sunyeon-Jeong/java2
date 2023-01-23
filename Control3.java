import java.util.*;
import java.util.Scanner;
// for문
class Control3_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 5번 반복
            System.out.println(i); // 세로로 i값 출력
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print(i); // 가로로 i값 연속 출력
        }
        System.out.println(); // 한줄 띄우기
    }
}

class Control3_2 {
    public static void main(String[] args) {
        int sum = 0; // 합계 -> sum 변수에 저장

        for (int i = 1; i <=5; i++) {
            sum += i; // sum = sum + i
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
            // %2d -> 2자리 만들고, 10진 정수
        }
    } // main 끝
}

class Control3_3 {
    public static void main(String[] args) {
        int i = 0;

        for (i = 0; i < 5; i++) {
            System.out.println("for문이 " + (i + 1) + "번째 실행중입니다.");
        }
        System.out.println("for문이 종료된 후 변수 i의 값은 " + i + "입니다.");
    }
}

// 중첩 for문
class Control3_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 별 5줄 찍기
            for (int j = 1; j <= 10; j++) { // 별 1줄에 10개 찍기
                System.out.print("*");
            }
        System.out.println(); // 줄바꿈
        }
    }
}

class Control3_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

// while문
class Control3_6 {
    public static void main(String[] args) {
        int i = 5; // 초기화

        while (i-- != 0) {
            System.out.println(i + "- I can do it!");
        }
    }
}

// while문_각 자리수 합
class Control3_7 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 (예 : 12345) : ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 사용자 입력값 -> tmp변수에 저장
        num = Integer.parseInt(tmp); // 사용자 입력 문자열 -> num변수에 정수형으로 저장

        while (num != 0) {
            sum += num % 10;
            // num 10으로 나눈 나머지 sum에 더함
            System.out.printf("sum = %3d num = %d%n", sum, num);
            num /= 10;
            // num을 10으로 나눈 값 -> 다시 num에 저장
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
// 10으로 나머지 연산 -> 해당 수의 마지막 자리 get
// 10으로 나누기 -> 해당 수의 마지막 자리 delete

// do-while문
class Control3_8 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1; // 1~100사이의 난수 -> answer 변수에 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하시오 : ");
            input = scanner.nextInt(); // 사용자 입력값 -> input 변수에 저장

            if (input > answer) {
                System.out.println("더 작은수로 다시 시도하시오.");
            } else if (input < answer) {
                System.out.println("더 큰수로 다시 시도하시오.");
            }
        } while (input != answer); // input과 answer 불일치 시(조건문 true) -> 다시 do 수행
        System.out.println("축하합니다! 정답입니다.");
        // input과 answer 일치 -> do-while문 빠져나와서 해당 문장 수행
    }
}

class Control3_9 {
    public static void main(String[] args) {
        int j = 1;

        do {
            System.out.println("do-while문이 " + j + "번째 반복 실행중");
            j++;
        } while (j < 20); // j가 20 미만인동안 계속 반복
        System.out.println("do-while문이 종료된 후,  변수 j의 값은 " + j + "입니다.");
    }
}