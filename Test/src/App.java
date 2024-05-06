public class App {
    public static void main(String[] args) throws Exception {
        int z = 0;
        int x = 0;
        int y = 1;

        for (int i = 0; i < 10; i++) {
            z = y;
          if (i == 0) {
            System.out.println(x);
            System.out.println(y);}
        else { 
         System.out.println(y);
    }
            y = x + z;
            x = y;
        }
    }
}
