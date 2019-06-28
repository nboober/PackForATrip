package trip;
import java.util.ArrayList;
public class Shoes {

    private String color = "";
    private String material = "";
    private String type = "";
//    ArrayList<Object> shoes;
//    private Shoes cowboyBoots;

    public Shoes(){

    }

    public Shoes(String color, String material, String type){
        this.color = color;
        this.material = material;
        this.type = type;
//        shoes = new ArrayList<Object>();
//        setShoes();
    }

//    public void setShoes(){
//        shoes.add(cowboyBoots = new Shoes("brown", "snake skin", "cowboy"));
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "\nA pair of " + this.color + " " + this.material + " " + this.type + ".";

    }
}
