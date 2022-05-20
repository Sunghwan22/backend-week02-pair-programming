import java.util.Scanner;
// 이 프로그램에서 가장 핵심이죠 계속해서 문제 출제. 반복 => while(if)
// 정해진 횟수만큼 문제를 맞추면 지옥의 방 탈출
public class Pairsunghwan {
    public static void main(String[] args) {
        // 1. 준비 과정
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        // 메인 루프에서 2~4번을 종료 조건을 만족할때까지 반복
        while (count < 3) {

            // 2. 입력
            //메세지를 출력
            System.out.print("Input 2 number: ");

            // 두 숫자 입력받음
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 입력받은 두 수를 더해달라는 메세지를 출력
            System.out.println(x + " + " + y + " = ?" );

            // 두 수 더한 결과를 입력받음
            int answer = scanner.nextInt();

            // 3. 처리 과정:
            // 입력받은 결과가 정답인지 확인
            boolean result = answer == x + y;
            // 정답이면 맞은 문제수 누적


            //입력받은 결과가 정답 x
            //맞은 문제수 카운트 x


            // 4. 결과출력
            //정답이면 정답 메세지 + 맞은 문제 수 출력
            if (result) {
                System.out.println("You're right!");
            }
            //오답이면 오답 메세지 출력
            if (!result) {
                System.out.println("What???");
            }
            //여기까지가 메인 루프
        }






        //세 문제를 모두 맞추면 탈출하고 탈출ㅋㅋ 메세지 출력


    }
}
