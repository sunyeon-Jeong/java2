import java.util.Arrays; // Arrays.toString()
// 배열의 출력
class Arrays3_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60}; // 배열 초기화
        char[] chArr = {'a', 'b', 'c', 'd'}; // 문자형 배열 초기화

        // for문을 이용한 배열초기화
        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10 까지 차례대로 초기화
        }

        // for문을 이용한 배열초기화
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10 사이 난수 초기화
        }

        // 배열 값 출력
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        System.out.println(); // 1,2,3,4,5,6,7,8,9,10,

        System.out.println(Arrays.toString(iArr2)); // [6, 4, 1, 9, 3, 4, 7, 4, 2, 5]
        System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]
        // 배열 바로 출력하기
        System.out.println(iArr3); // 주소값 나옴 // [I@668bc3d5
        System.out.println(chArr); // 예외적으로 구분자없이 요소 나옴 //abcd
    }
}

// 배열의 활용_총합과 평균
class Arrays3_2 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90}; // 배열 생성

        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 요소값 불러와서 sum에 모두 저장
        }
        average = sum / (float)score.length; // 계산결과 float으로 얻기위해 형변환

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}

// 배열의 활용_최대값과 최소값
class Arrays3_3 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95}; // 배열 생성

        int max = score[0]; // 배열 첫번째 값으로 초기화
        int min = score[0]; // 배열 첫번째 값으로 초기화

        for (int i = 1; i < score.length; i++) { // 두번째 값부터 반복문실행
            if (score[i] > max)  { // 초기화 한 값보다 크면
                max = score[i]; // 덮어쓰기
            } else if (score[i] < min) { // 초기화 한 값보다 작으면
                min = score[i]; // 덮어쓰기
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

// 배열의 활용_섞기
class Arrays3_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 배열 생성
        System.out.println(Arrays.toString(numArr)); // 배열 출력

        for (int i = 0; i < 100; i++) { // 0~99까지 100번 반복
            int n = (int) (Math.random() * 10); // 0~9중에서 난수생성
            int tmp = numArr[0];
            numArr[0] = numArr[n]; // '난수'번째 값을 0번째 요소에 덮어쓰기
            numArr[n] = tmp; // 원래 0번째 값 -> '난수'번째 값에 덮어쓰기
        }
        System.out.println(Arrays.toString(numArr));
    }
}