package trip;

public class Pants {

    private String color = "";
    private String material = "";
    private String fit = "";

    public Pants(){

    }

    public Pants(String color, String material, String fit){
        this.color = color;
        this.material = material;
        this.fit = fit;
    }

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

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    public String toString(){
            return "\nA pair of " + this.color + ", " + this.material + ", " + this.fit + " pants.";

    }
}
