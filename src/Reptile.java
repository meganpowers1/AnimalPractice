public class Reptile extends Animal{
    private String scaleType;
    private String sciName;
    private String habitat;
    private int lifespan;
    private String diet;
    private String conservationStatus;

    public Reptile(){

    }

    @Override
    public void consumeFood(){
        System.out.println("This reptile's diet consists of: " + this.diet);
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

}
