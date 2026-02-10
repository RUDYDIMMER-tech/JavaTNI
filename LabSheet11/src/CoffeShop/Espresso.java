package CoffeShop;

public class Espresso extends Drink{
    private int shot;

    public Espresso (String size, boolean b)
    {
        super("Espreso",35,size);
        this.shot=0;
    }

    public int getShot()
    {
        return this.shot=shot;
    }

    public void addShot(int shot)
    {
        this.shot++;
    }

    public double calculateFinalPrice()
    {
        return super.getBasePrice()+(this.shot*15)+super.getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString()+
                (shot>0?"\nAdded "+this.shot+" shot":"")+
                "\nTotal price = "+calculateFinalPrice()+" Baht.";
    }
}