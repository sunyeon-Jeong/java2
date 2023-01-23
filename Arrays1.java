// 배열의 선언과 생성
class Arrays1_1 {
    public static void main(String[] args) {
        int[] age = new int[5]; // 길이가 5인 int 배열 (index 0~4)
        age[3] = 28; // age 배열 4번째 요소에 28 저장
        System.out.println("age[3] = " + age[3]); // age 배열 4번째 요소값 출력

        int beatitudoAge = age[3]; // 정수type 변수에 배열 요소값 저장
        System.out.println("beatitudoAge = " + beatitudoAge);

        System.out.println("age 배열의 전체 요소값 확인");
        System.out.println("age[0] = " + age[0]);
        System.out.println("age[1] = " + age[1]);
        System.out.println("age[2] = " + age[2]);
        System.out.println("age[3] = " + age[3]);
        System.out.println("age[4] = " + age[4]);
    }
}