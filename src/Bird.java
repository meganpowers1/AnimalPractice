public class Bird extends Animal{

    private String featherType;
    private String sciName;
    private String habitat;
    private int lifespan;
    private String diet;
    private String conservationStatus;

    public Bird(){
        super();
    }

    @Override
    public void consumeFood(){
        System.out.println("This bird's diet consists of: " + this.diet);
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

}
