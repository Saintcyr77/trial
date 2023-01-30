public class houseRobber {
    static int[] arr = {1,4,5,6,7};
    static int[] dp = new int[arr.length];
    public static void main(String[] args) {

       int ans =  a();
        System.out.println(ans);

    }
    public static int a(){
        int ans = rob(arr, arr.length - 1, dp);
        return ans;
    }
    public static int rob(int[]arr,int index,int[]dp){
        if(index==0) return arr[index];

        if(index<0) return 0;
        int pick = arr[index];
        if(index>1){
            pick += rob(arr,index-2,dp);
        }
        int unpick = rob(arr,index-1,dp)+0;

        return Math.max(pick,unpick);
    }

}
