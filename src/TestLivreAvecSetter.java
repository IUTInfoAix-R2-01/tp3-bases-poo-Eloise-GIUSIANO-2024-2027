public class TestLivreAvecSetter {
	   public static void main(String[] args) {
		   LivreAvecSetter p1= new LivreAvecSetter ("le petit prince", 5, 6);
		      
		      p1.setQuantite(3);
		      
		      System.out.println(p1.ToString());
		      System.out.println("Name: " + p1.getName());
		      System.out.println("Price: " + p1.getPrice());
		      System.out.println("Quantite: " + p1.getQuantite());
		   }
	   
}
