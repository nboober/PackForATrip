package trip;
import java.util.ArrayList;

public class Closet {

    //cowboy
    private Jacket denimJacket;
    private Shirt whiteShirt;
    private Pants jeans;
    private Shoes cowboyBoots;

    //casual
    private Jacket cottonJacket;
    private Shirt blueShirt;
    private Pants khakis;
    private Shoes sneakers;
    private Shoes sandal;

    //dressy
    private Jacket polyJacket;
    private Shirt redShirt;
    private Pants dressPants;
    private Shoes dressShoes;
    
    
    public Closet(){

        //cowboy
        this.denimJacket = new Jacket("red", "denim", true);
        this.whiteShirt = new Shirt("white", "cotton", "short", false);
        this.jeans = new Pants("blue", "denim", "slim");
        this.cowboyBoots = new Shoes("brown", "snake skin", "cowboy boots");

        //casual
        this.cottonJacket = new Jacket("green", "cotton", true);
        this.blueShirt = new Shirt("blue", "polyester", "short", false);
        this.khakis = new Pants("brown", "denim", "loose");
        this.sandal = new Shoes("tan", "snake-skin", "sandals");
        this.sneakers = new Shoes("red", "leather", "sneakers");


        //dressy
        this.polyJacket = new Jacket("white", "denim", false);
        this.redShirt = new Shirt("red", "polyester", "long", false);
        this.dressPants = new Pants("grey", "cotton", "tight");
        this.dressShoes = new Shoes("black", "crocodile skin", "dress shoes");

    }

    public String getCasualCloset(){
        int surprise =((int)Math.ceil(Math.random()*3));
        if(surprise == 1) {
            return "The casual closet contains: \n" + cottonJacket.toString() + blueShirt.toString() + khakis.toString() + sneakers.toString() + sandal.toString();
        } else {
            return "The casual closet contains: \n" + cottonJacket.toString() + blueShirt.toString() + khakis.toString() + sneakers.toString();
        }
    }

    public String getDressyCloset() {
        int surprise = ((int) Math.ceil(Math.random() * 3));
        if (surprise == 1) {
            return "The Dressy closet contains: \n" + polyJacket.toString() + redShirt.toString() + dressPants.toString() + dressShoes.toString() + sandal.toString();
        } else {
            return "The Dressy closet contains: \n" + polyJacket.toString() + redShirt.toString() + dressPants.toString() + dressShoes.toString();
        }
    }
    public String getCowboyCloset(){
        int surprise = ((int) Math.ceil(Math.random() * 3));
        if (surprise == 1) {
        return "The Cowboy closet contains: \n" + denimJacket.toString() + whiteShirt.toString() + jeans.toString() + cowboyBoots.toString() + sandal.toString();
    }else{
            return "The Cowboy closet contains: \n" + denimJacket.toString() + whiteShirt.toString() + jeans.toString() + cowboyBoots.toString();
        }
    }
}
