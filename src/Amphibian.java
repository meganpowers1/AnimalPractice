public class Amphibian extends Animal{

    private String sciName;
    private String habitat;
    private int lifespan;
    private String diet;
    private String conservationStatus;

    public Amphibian(){
        super();
    }

    public void setSciName(String scientificName){
        this.sciName = scientificName;
    }

    @Override
    public String toString(){
        return this.sciName + " or " + this.getName();
    }

    @Override
    public void consumeFood(){
        System.out.println("This amphibian's diet consists of: " + this.diet);
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    public void isPredator(Animal a1){
        if(a1.getName().equals("kite")){
            System.out.println("True");
        }else{
            System.out.println("Undetermined.");
        }
    }

}
