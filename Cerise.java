/**
 *
 * @author roudet
 */
public class Cerise {
    private double prix;
    private String origine;
	
    public Cerise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Cerise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 cerises sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Cerise or = (Cerise) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une cerise a des pepins
        return false;
    }


    public static void main (String[] args){
        Cerise cerise = new Cerise(10.0,"Espagne");
	System.out.println(cerise.getPrix());
    System.out.println(cerise.toString());
	//System.out.println("premier test Cerise");
   }
}
