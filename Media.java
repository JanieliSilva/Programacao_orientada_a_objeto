package Array;

public class Media {
    public static void main(String[] args){
       
        System.out.println(media(1.9,3.4,3.5,2.0));
        System.out.println(media(1.9, 3.4, 3.5, 2.6, 3.5, 2.6));
        System.out.println(media(1.9,3.4,3.5,2.6));
        System.out.println(media(1.9,3.4,3.5,2.6,3.5,2.6, 3.4, 5.6));
    }

    public static double media(double... numeros){
      double med = 0.0;
      for(double n : numeros){
        med += n;
      }
      med /= numeros.length;
      return med;

}
}
