public class Rectangle {
	
   private float length;
   private float width;
   
   public Rectangle() {  
      length = 1.0f;
      width = 1.0f; 
   }
   
   public Rectangle(float length, float width) {  
      this.length = length; 
      this.width = width; 
   }
   
   public double getlength() {
     return length; 
   }
   
   public void setlength(float length) {
	   this.length = length; 
}
    
   public double getwidth() {
	   return width; 
	   }
	    
   public void setwidth(float width) {
	   this.width = width; 
	}
	    
   public double getArea() {
      return length*width;
   }
   
   public double getPerimeter() {
	   return (length+width)*2;
   }

   public String toString() {
      return "Rectangle[length=" + length + "width=" + width + "]";
   }
}








