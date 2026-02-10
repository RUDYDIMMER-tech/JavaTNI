public class Donut extends Bakery {

    private double discount;
    private int priceofDonut = 20;
   public Donut(String flavor,int peice,double discount)
    {
        super(flavor,peice);
        this.discount=discount;
    }

   public Donut()
    {
        this("",0,0);
    }


    @Override
   public double calculateTotalPrice() //beforeGetdiscount
    {
        return super.getUnitPrice()*priceofDonut;
    }

   public double getDiscount() //after
    {
        return calculateTotalPrice()-this.discount;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTotal price of Donut Before Discount = "+calculateTotalPrice()+
                "\nTotal price of Donut After Discount = "+getDiscount();
    }
}