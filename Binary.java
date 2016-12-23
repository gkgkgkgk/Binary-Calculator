public class Binary {

  public static int[] toBinary(int x){
  //converts to binary
    int[] binary = new int[8];
    int number = x;
    for(int i = 7; i > 0; i--){
      binary[i] = number%2;
      number = number/2;

    }
 /*   System.out.print(binary[0]);
System.out.print(binary[1]);
System.out.print(binary[2]);
System.out.print(binary[3]);
System.out.print(binary[4]);
System.out.print(binary[5]);
System.out.print(binary[6]);
System.out.println(binary[7]);
*/
    return binary;
  }
  
  public static int[] add(int[] a, int[] b){
  //adds two binary numbers
        int c = 0;
    int d = 0;
    int[] sum = new int[8];
    int[] x = a;
    int[] y = b;

    int[] numbers = {128,64,32,16,8,4,2,1};
    for(int i = 0; i < 8; i++){
    c+= x[i]*numbers[i];
    d +=y[i]*numbers[i];
    }
    int sumInt = c+d;
    //System.out.println(c);
    for(int i = 7; i > 0; i--){
      sum[i] = sumInt%2;
      sumInt = sumInt/2;

    }
   /* System.out.print(sum[0]);
System.out.print(sum[1]);
System.out.print(sum[2]);
System.out.print(sum[3]);
System.out.print(sum[4]);
System.out.print(sum[5]);
System.out.print(sum[6]);
System.out.println(sum[7]);
*/
    return sum;
  }
  
 /* public static void main(String[] args){
    add(toBinary(100), toBinary(20));
    
  }*/
  
}