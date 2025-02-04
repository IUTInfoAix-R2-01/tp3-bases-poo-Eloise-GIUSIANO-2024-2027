public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor
      // which sets its radius and color to their default value.
      Circle c1 = new Circle();
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      System.out.println("La couleur est :"+ c1.getColor());
      
      // Declare an instance of class circle called c2.
      // Construct the in stance c2 by invoking the second constructor
      // with the given radius and default color.
      Circle c2 = new Circle(2.0);
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      System.out.println("La couleur est :"+ c2.getColor());
      
      Circle c3 = new Circle(3.0, "purple");
      System.out.println("The circle has radius of " 
         + c3.getRadius() + " and area of " + c3.getArea());
      System.out.println("La couleur est :"+ c3.getColor());
      
      Circle c4 = new Circle();   // construct an instance of Circle
      c4.setRadius(5.5);          // change radius
      System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
      c4.setColor("green");       // Change color
      System.out.println("color is: " + c4.getColor());   // Print color via getter

      Circle c5 = new Circle(5.5);
      System.out.println(c5.toString());  
      
      Circle c6 = new Circle(6.6);
      System.out.println(c6.toString());  // explicit call
      System.out.println(c6);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
   }
}