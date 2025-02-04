public class LivreAvecSetter {
	   private String Name;
	   private float Price;
	   private int Quantite; 

	   public LivreAvecSetter(String Name, float Price, int Quantite ) {  
	      this.Name = Name; 
	      this.Price = Price;
	      this.Quantite = Quantite; 
	   }
	   
	   public void setQuantite(int Quantite) {
		  this.Quantite = Quantite;
	   }
	   
	   public String getName() {
	     return Name; 
	   }
	  
	   public float getPrice() {
	      return Price;
	   }
	   
	   public int getQuantite() {
		   return Quantite;
	   }
	   
	   public String ToString() {
		   return "Livre [name=" + Name + ", Price =" + Price + ", quantite =" + Quantite  + "]";
	   }
	
}
