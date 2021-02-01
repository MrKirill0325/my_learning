
public class Variables {

   public static void main(String[] args) {
      int a = 500; // тип int, целое от -2 147 483 648 до 2 147 483 647
      short b = 3000; // тип short, целое от -32 768 до 32 767
      long c = 10000l; // тип long, целое от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
      
      double d = 10.1; // тип double, вещественное 8 байт, используется всегда  по умолчанию 
      float e = 75.4f; // тип float, вещественное 4 байт, для уточнения вконце ставится f
      
      char f = 'a'; // тип char, символ
      boolean g = true; // тип boolean, логическая переменная true/false
      
      byte h = 15; // тип byte, целое от -128 до 127
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
      System.out.println(h);
      
   }

}
