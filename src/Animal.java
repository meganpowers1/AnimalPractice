
// Name?
// Height
// Length

public class Animal {

    private String name;
    private float height;
    private float length;
    private float weight;

    public Animal(){

    }

    public Animal(String name, float height, float length, float weight){
        this.name = name;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public Float getLength(){
        return this.length;
    }

    public void setLength(float length){
        this.length = length;
    }
    public Float getWeight(){
        return this.weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void consumeFood(){
        System.out.println("This animal does not have a specified diet.");
    }

}
