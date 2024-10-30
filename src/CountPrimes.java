public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if (arr[i]){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if (arr[i]){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPrimes cp=new CountPrimes();
        System.out.println(cp.countPrimes(10));
    }
}
