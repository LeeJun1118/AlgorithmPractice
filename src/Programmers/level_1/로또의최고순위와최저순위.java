package Programmers.level_1;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {5, 3, 7, 8, 9, 3};

        solution(lottos, win_nums);

    }

    private static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int zero = 0;
        int count = 0;
        for (int num : lottos) {
            if (num == 0)
                zero++;
            for (int win_num : win_nums) {
                if (num == win_num) {
                    count++;
                }
            }
        }
        if (zero == 6)
        {
            answer[0] = 1;
            answer[1] = 6;
        }
        else if(zero == 0 && count == 0){
            answer[0] = 6;
            answer[1] = 6;
        }
        else{
            answer[0] = Math.abs(count + zero - 6) + 1;
            answer[1] = Math.abs(count - 6) + 1;
        }
        return answer;
    }
}
