public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
    // For loop from 100 to 5 by 5. print index

    for (int i = 100; i >= 5; i -= 5) {
      System.out.print(i);
    }
  // and put your code here.
  }

  void soln2() {
    // For loop from 100 to 5 by 5. print index

    for (int i = 100; i >= 5; i -= 5) {
    }
    // and put your code here.
  }
  
  void soln3() {
    //Madhavi - integers from 9 to 17, print sum
    int sum = 9;
    for (int i =10; i<=17;i++){
      sum=sum+i;
    }
    System.out.print(sum);
  // and put your code here.
  }
  
  void soln4() {
    // Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
    int[]a = [9,5,6,3,8,2,4];
// Alissa
    int smallest = a[0];
    for(int x = 1; x <a.length;x++){
      if(a[x]<smallest)
        smallest = a[x];
  // and put your code here.
  }
  
  void soln5() {
        // Find and print the largest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
     // Ethan
      int[]a = [9,5,6,3,8,2,4];
      int largest = a[0];
      for(int x = 1; x <a.length;x++){
        if(a[x]>largest)
          largest = a[x];
      }
    }
  // and put your code here.
  }
  
  void soln6() {
     // Find and print index of first true element in an array of booleans a = [false, false, false, true, false];

     // Nusera - Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
      for (int i = 0;i<a.length;i++) {
        if (a[i] == true) {
          break;
        }
      }
        System.out.print(i);
    }
  // and put your code here.
  }
  
  void soln7() {
    int i =0;
    while(!a[i]){
      i++;
    }
    System.out.print(i);
  // and put your code here.
  }
  
  void soln8() {
    for(int i=0;i<a.length;i++)
      a[i] += 5;
  }
  
  void soln9() {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] / 1.3;
      // and put your code here.
    }
  // and put your code here.
  }
  
  void soln10() {
  double[]a =[1.3, 5.4, 6.1, 1.0, 9.2];
    for (int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i],3)- (a[i]/3.0);
      // and put your code here.
    }
  // and put your code here.
  }
  
  void soln11() {
  int a[][] = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
  for(int x =0; x<4;x++){
    for(int i =0;1<6;i++)
    a[x][i] = 0;
  }
  // and put your code here.
  }
  
  void soln12() {
    //multiply each element of a 5 by 5 array of integers by 7
    for(int x =0; x<5;x++){
      for(int i =0;i<5;i++)
        a[x][i] *= 7;
    }
  // and put your code here.
  }
  
  void soln13() {
    boolean answer[][] = new boolean[5][5];
 /*   create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans.
            each element in the result should be true if the value in the argument array is even,
    else it's false.
  */
    for (int x = 0; x < 5; x++) {
      for (int i = 0; i < 5; i++) {
        answer[x][i] = ((a[x][i] % 2) == 0) ;
        // and put your code here.
      }
    }
  }

  double soln14(double number,double power) {
    //  create a method that takes two doubles and returns the first parameter
   // raised to the second parameter's value
  // and put your code here.
    return Math.pow(number,power);
  }
  
  boolean soln15(Object f) {
   // create a method that returns a boolean if the Object passed to it is a Fish or not
  // and put your code here.
    return (f instanceof Fish);
  }
  
  void soln16(Object x) {
//    There is an object x which has a method (double)Balance(). Build an IF statement that prints "Paid Off" if the
//    result of the balance call is less than of equal to 1.0,
//    else it prints the balance as a Dollar figure (2 decimal places)
    // and put your code here.
    if (x.Balance() <= 1.0) {
      System.out.println("Paid Off");
    } else System.out.println(" %f.2" + x.Balance());
  }

  void soln17() {
      //Build a WHILE loop that turns on the heat
  //if the thermo.getTemp() is less than 72.0
//  else it turns on the A/C if thermo.getTemp() is greater that 76.0.
  // and put your code here.
    while(76.0 <thermo.getTemp()>72.0){
       if(thermo.getTemp()<72.0)
         thermo.heat();
       else (thermo.getTemp() >76.0)
               thermo.cool();
    }
  }
  
  void soln18(double[] array) {
      //Find a number greater than Pi in a double array, print number and its index.
      // and put your code here.
      for (int x = 0; x < array.length;x++){

          if (array[x] > Math.PI) {
            String output = String.format("The value of %.4f was found at %d %d .",array[x], x);
            System.out.println(output);
            break;
          }
      }
    }

  void soln19(Xaction[] object) {
    Integer sum = 0;
     //Given an array of objects (of class Xaction) w/nulls,
    // sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.
  // and put your code here.
    for(int x =0;x<object.length;x++) {
      Integer value = Xaction.getValue(object[x]);
             if(value != null) {
                 sum += value;
             }
    }
    System.out.println(sum);
  }
  
  void soln20(Xaction[] object) {
    Xaction[] reversedArr = new Xaction[object.length];
      //Reverse an array of objects of type Xaction
  // and put your code here.
      int y = Xaction.length -1;
    for(int x =0;x<Xaction.length;x++) {
      reverseArr[y] = Xaction[x];
      y--;
    }
  }
  
  void soln21(int tableSize) {
      //Print a 5's times table
  // and put your code here.
    String output = "";
    int answer = 0;
    int multi = 0;
    for(int x= 1;x<= tableSize;x++) {
       output = "[ ";
       multi =x;
     for(int y =1;y<=tableSize;y++) {
       answer = 5 * multi;
       multi++;
       output += answer + " ";
        // add to string for row (x*5)
     }
      System.out.println(output);
    }
  }
  
  void soln22() {
      //detemine the hypotenuse of a 9 by 7 right triangle, assign it to a double
  // and put your code here.
    double hype = Math.sqrt(Math.pow(9,2) + Math.pow(7,2));

  }
  
}
}