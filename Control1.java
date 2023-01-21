import javax.swing.*;
import java.util.Scanner; // scanner 클래스 추가
// if문
class Control1_1 {
    public static void main(String[] args) {
        int score = 80; // 정수 선언

        if (score > 60) {
            System.out.println("합격"); // 조건문 참 -> 출력실행
        }
    }
}

class Control1_2 {
    public static void main(String[] args) {
        char ch = 'b'; // 문자 선언

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 영문자는 소문자");
        }
    }
}

// if문_조건식의 예
class Control1_3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d일때, 참인 것%n", x);
        if (x==0) System.out.println("x == 0"); // T
        if(x!=0) System.out.println("x != 0"); // F
        if(!(x==0)) System.out.println("!(x == 0)"); // F
        if(!(x!=0)) System.out.println("!(x != 0)"); // T
    }
}

// if-else문
class Control1_4 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하라 : ");
        Scanner scanner = new Scanner(System.in); // 입력받기
        int input = scanner.nextInt(); // input 변수 <- 정수타입으로 입력값 저장

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다."); // input == 0
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다."); // input != 0
        }
    }
}

class Control1_5 {
    public static void main(String[] args) {
        char ch = 'Z'; // 문자 선언

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다."); // True 일때
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다."); // False 일때
        }
    }
}

// if-else if-else문
class Control1_6 {
    public static void main(String[] args) {
        int score = 0; // 점수 저장용 변수
        char grade = ' '; // 학점 저장용 변수 -> 문자형 공백으로 초기화

        System.out.print("점수를 입력하시오 : ");
        Scanner scanner = new Scanner(System.in); // 사용자 입력값 받기
        score = scanner.nextInt(); // 입력값 -> score 변수에 정수타입으로 저장

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) { // score < 90이 증명되었음 -> 조건 중복 X
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}

// 중첩 if문
class Control1_7 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하시오 : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 사용자 입력값 -> 정수타입으로 변수에 저장

        System.out.printf("당신의 점수는 %d 입니다.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score > 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}