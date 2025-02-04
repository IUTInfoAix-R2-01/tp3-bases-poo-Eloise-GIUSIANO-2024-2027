public class TestLivre {
	   public static void main(String[] args) {
		      Livre p1= new Livre ("le petit prince", 5, 6);
		      
		      System.out.println(p1.ToString());
		      System.out.println("Name: " + p1.getName());
		      System.out.println("Price: " + p1.getPrice());
		      System.out.println("Quantite: " + p1.getQuantite());
		   }
	   
}
