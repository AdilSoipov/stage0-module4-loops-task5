package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
      
    
        for(int line = 0;line < sideLength;line++){
            for(int col = 0;col < sideLength;col++){
                if(line == num / 2 || col == num / 2) System.out.print("s");
                else System.out.print(" ");
            
            System.out.println("");
        }
    }

    }
}
