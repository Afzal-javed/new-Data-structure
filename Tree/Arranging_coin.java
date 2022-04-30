public class Arranging_coin {
    public static void main(String[] args) {
        int n=8;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n){
        int row=0;
        for(int i=1;n>0;i++){
            if(n>=i){
                n=n-i;
                row=row+1;
            }
            else{
                break;
            }
        }
        return row;
    }
}
