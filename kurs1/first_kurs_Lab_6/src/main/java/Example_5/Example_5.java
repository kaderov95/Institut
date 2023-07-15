package Example_5;

//(n * ( n + 1 ) * ( 2n + 1 ) ) / 6
public class Example_5 {
    public static int sumSquaring(int n){
        int sum=0;
        for (int i =0;i<=n;i++){
            sum=sum+i*i;
        }
        return sum;
    }
    public static int sumSquaringRec(int n) {
        if(n==1||n<0) return 1;
        int res=0;
        res =n*n+sumSquaringRec(n-1);
        return res;
    }
}


