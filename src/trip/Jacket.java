package trip;

public class Jacket {

    private String color ="";
    private String material = "";
    private boolean hood;

    public Jacket(){

    }

    public Jacket(String color, String material, boolean hood){
        this.color = color;
        this.material = material;
        this.hood = hood;
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

    public boolean isHood() {
        return hood;
    }

    public void setHood(boolean hood) {
        this.hood = hood;
    }

    @Override
    public String toString(){
        if(!this.hood){
            return "A " + this.color + ", " + this.material + " jacket.";
        }else{
            return "A " + this.color + ", " + this.material + " hoodie.";
        }


    }

}
