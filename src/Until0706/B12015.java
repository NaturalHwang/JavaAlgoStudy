import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B12015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        // LIS(최장증가수열)을 저장할 리스트
        ArrayList<Integer> lis = new ArrayList<>();

        for(int num: nums){
            // 현재 숫자가 lis의 마지막 요소보다 크면 추가
            if(lis.isEmpty() || lis.get(lis.size()-1) < num){
                lis.add(num);
            } else{
                // 이분 탐색으로 현재 숫자가 들어갈 위치 찾기
                int pos = Collections.binarySearch(lis, num);
//                System.out.println("num is: " + num);
//                System.out.println("pos is: " + pos);
                if(pos <0){
                    pos = -(pos +1);
//                    System.out.println("new pos: "+pos);
                }
                lis.set(pos, num);
            }
        }
        System.out.println(lis.size());
    }
}
