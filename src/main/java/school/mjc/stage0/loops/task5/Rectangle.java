package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
          for(int k = 0; k<=length; k++)
                System.out.print("8");
        
        System.out.println();
        
        for(int i = 0; i<height; i++)
                 System.out.println("8         8");
        
        for(int j = 0; j<=height; j++)
            System.out.print("8");

    }
}
