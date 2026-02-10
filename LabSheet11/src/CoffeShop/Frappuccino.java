package CoffeShop;

public class Frappuccino extends Drink{
    private boolean whipped;

    public Frappuccino(String size,boolean whipped)
    {
        super("Frappucino",40,"");
        this.whipped=whipped;
    }

    @Override
    public double calculateFinalPrice() {
        return super.getBasePrice()+(whipped?15:0)+super.getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n"+(whipped?"Add whipped 15 Baht.":"")+
                "\nTotal price = "+calculateFinalPrice();
    }
}