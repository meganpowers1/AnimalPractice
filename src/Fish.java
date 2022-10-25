public class Fish extends Animal{

    private String sciName;
    private String aquaticBiome;
    private int lifespan;
    private String diet;
    private String conservationStatus;

    public Fish(){
        super();
    }

    @Override
    public void consumeFood(){
        System.out.println("This fish's diet consists of: " + this.diet);
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

}
