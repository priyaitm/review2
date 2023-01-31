package review2;

public class MaxPrint {
    public static void main(String[] args){
             //    0 1 2 3 4
        int [] a={ 2,7,9,8,4};
        int max=a[0];
        int min=a[0];
                      //5
        for(int i=1;i<a.length;i++){
                                  // i=1       i=2
            if( max<a[i]){       // max=2 <7    2<9
                max=a[i];      //9
            }
        }
        System.out.println(max);
        for(int j=1;j<a.length;j++){
            if(min>a[j]){
                min=a[j];
            }
        }
        System.out.println(min);

    }


}
