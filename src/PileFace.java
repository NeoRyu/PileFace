public class PileFace {
	
	public static void main(String[] args) {  
		// IDENTIQUE ?
		  System.out.println(	Jeu.PILE.jouer(Jeu.FACE)) ; // affiche false
		  System.out.println(	Jeu.PILE.jouer(Jeu.PILE)) ;  // affiche true
		  
		  System.out.println(	Jeu.FACE.jouer(Jeu.PILE)) ; // affiche false
		  System.out.println(	Jeu.FACE.jouer(Jeu.FACE)) ;  // affiche true  	
	}
	
	public enum Jeu {	
		
		  // OBJETS ÉNUMÉRÉS
		  PILE("0","PILE","P"),
		  FACE("1","FACE","F");
		  private int id;	
		  private String nom = "";	
		  private String abv = "";
		  
		  // CONSTRUCTEUR
		  Jeu(String id, String nom, String abv){
			  	this.id = Integer.parseInt(id);
			    this.nom = nom;
			    this.abv = abv;
		  }
		  
		  // METHODE D'APPEL
		  public int getId(){
			  return id;
		  }
		  public String getNom(){
			  return nom;
		  }
		  public String getAbv(){
			  return abv;
		  }
		  
		public boolean jouer(Jeu adv) {		
			return (this.getNom().compareTo(adv.getNom()) == 0 ? true : false);
		}
	}
}