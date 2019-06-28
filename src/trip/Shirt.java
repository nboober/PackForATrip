package trip;

public class Shirt {

    private String color ="";
    private String material = "";
    private String sleeveType = "";
    private boolean buttons;

    public Shirt(){

    }

    public Shirt(String color, String material, String sleeveType, boolean buttons){
        this.color = color;
        this.material = material;
        this.sleeveType = sleeveType;
        this.buttons = buttons;

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

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public boolean isButtons() {
        return buttons;
    }

    public void setButtons(boolean buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString(){
        if(this.buttons = false){
            return "\nA " + this.color + ", " + this.material + ", " + this.sleeveType + " sleeve shirt.";

        }else{
            return "\nA " + this.color + ", " + this.material + ", " + this.sleeveType + " sleeve button up shirt.";
        }


    }
}
