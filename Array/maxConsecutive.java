package Array;

public class maxConsecutive {
    public static void main(String args[]){
        int nums[] = {1,1,0,1,1,1};
        int count = 0;
        int maxCount = 0;
        for(int num :nums ){
            if(num == 1){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
    
}
