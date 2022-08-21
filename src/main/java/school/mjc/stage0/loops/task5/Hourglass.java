package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
	

for(int i=0; i < height/2; i++ ) {
  for(int j = height - i; j < height; j++) {
     System.out.print(" ");
  }
  for(int j = 0; j < height - 2*i; j++) {
     System.out.print("8");
  }
  System.out.println();
}


for(int i=height/2 -1; i >=0; i-- )  // based on first half, in reverse order
{
  for(int j = height - i; j < height; j++) {
     System.out.print(" ");
  }
  for(int j = 0; j < height - 2*i; j++) {
     System.out.print("8");
  }
  System.out.println();
}
    }
}
