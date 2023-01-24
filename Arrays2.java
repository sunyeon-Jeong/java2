// 배열의 길이_배열이름.length
class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 길이 10
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

// 배열의 초기화
class Arrays2_2 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] num2 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num1.length; i++) {
            System.out.println("num1[" + i + "] = " + num1[i]);
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.println("num2[" + i + "] = " + num2[i]);
        }

        System.out.println();

        // 주의 할 점!
        int[] num3;
        // num3 = {1,2,3,4,5,6,7,8,9}; // Error 발생합니다.

        // 위처럼 나눠서 표현을 해야 한다면 아래처럼 초기화
        int[] num4;
        num4 = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < num4.length; i++) {
            System.out.println("num4[" +i + "] = " + num4[i]);
        }
    }
}