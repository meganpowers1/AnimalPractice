public class Mammal extends Animal{

    private int numberOfLimbs;
    private String sciName;
    private String habitat;
    private int lifespan;
    private String diet;
    private String conservationStatus;

    public Mammal(){

    }

    @Override
    public void consumeFood(){
        System.out.println("This mammal's diet consists of: " + this.diet);
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

}
