public class eleventh {
    
    public static void main(String[] args) {

          if (args.length != 3) {
            System.out.println("Run like this: java eleventh 9 26 2025");
            return;
          }
          
        int m = Integer.parseInt(args[0]); 
        int d = Integer.parseInt(args[1]); 
        int y = Integer.parseInt(args[2]); 

        
        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }

        int y0 = y;
        int m0 = m;
        int d0 = d;

        int dayOfWeek = (d0 + (26 * (m0 + 1)) / 10
                        + y0 + y0 / 4
                        - y0 / 100
                        + y0 / 400) % 7;

        System.out.println(dayOfWeek);
    }
}


