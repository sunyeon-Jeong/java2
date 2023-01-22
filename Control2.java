import java.util.Scanner; // scanner 클래스 추가
// switch문
class Control2_1 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하시오 : ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); // 사용자 입력값 -> Month변수에 정수형으로 저장

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절 -> 봄");
                break;
            case 6:; case 7: case 8:
                System.out.println("현재 계절 -> 여름");
                break;
            case 9: case 10: case 11:
                System.out.println("현재 계절 -> 가을");
                break;
            default: // case 12, 1, 2
                System.out.println("현재 계절 -> 겨울"); // default문 -> break문 안적어도 됨
        }
    }
}

// 난수(임의의 정수)생성 Math.random()_양의 정수
class Control2_2 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i <= 5; i++) { // Math.random 5번 실행
            num = (int) (Math.random() * 6) + 1;
            // 1~6 까지의 정수가 랜덤으로 출력
            System.out.println(num);
        }
    }
}

// 난수(임의의 정수)생성 Math.random()_음~양의 정수
class Control2_3 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i <= 20; i++) { // 20번 출력
            num = (int) (Math.random() * 11 -5);
            // -5 ~ 5 까지의 정수가 랜덤으로 출력
            System.out.println(num);
        }
    }
}