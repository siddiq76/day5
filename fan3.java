public class fan3 { 
    public static void check(int x1, int x2, int y1, int y2, 
                             int p1, int p2, int q1, int q2) 
    { 
  
        int a1 = (y2 - y1) * p1 + (x1 - x2) * q1 
                 + (x2 * y1 - x1 * y2); 
  
        if (a1 < 0) { 
             
            int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 
                     + (x2 * y1 - x1 * y2); 
  
            if (a2 >= 0) 
                System.out.println("Intersecting"); 
  
            else if (a2 < 0) 
                System.out.println("Not intersecting"); 
        } 
  
        else if (a1 > 0) { 
  
            int a2 = (y2 - y1) * p2 + (x1 - x2) * q2 
                     + (x2 * y1 - x1 * y2); 
  
            if (a2 <= 0) 
                System.out.println("Intersecting"); 
  
            else if (a2 > 0) 
                System.out.println("Not intersecting"); 
        } 
  
        else
            System.out.println( "points are lying on the line"); 
    } 