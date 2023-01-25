// String 배열
class Arrays4_1 {
    public static void main(String[] args) {
        String[] name = {"Kim", "Park", "Jeong"}; // 배열생성

        for (int i = 0; i < name.length; i++) {
            System.out.println("name[" + i + "] : " + name[i]);
        }

        String tmp = name[2]; // 문자열 변수 tmp <- name배열 3번째요소 저장
        System.out.println("tmp : " + tmp);

        name[0] = "Han"; // name배열 첫번째요소 Han으로 변경

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        } // 변경된 name배열 출력
    }
}

// 커맨드라인
class Arrays4_2 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}

// 2차원 배열
class Arrays4_3 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        }; // 4행 3열 2차원[] 생성

        int sum = 0;

        for (int i = 0; i < score.length; i++) { // 행 접근
            for (int j = 0; j < score[i].length; j++) { // 열 접근
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

                sum += score[i][j]; // 요소 총합
            }
        }

        System.out.println("sum = " + sum);
    }
}