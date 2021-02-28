package circle;

import java.util.Scanner;
public class Area {
   private float radius=0.0f;
   private float area= 0.0f;
   public void setRadius()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius:");
       radius = sc.nextInt();

   }
   public float showArea()
   {
     area = (float) (Math.PI * radius * radius);
     return area;


   }


}
