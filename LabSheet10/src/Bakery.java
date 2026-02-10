public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

   public Bakery(String flavor,double unitPice)
    {
        this.flavor=flavor;
        this.unitPrice=unitPice;
    }

   public Bakery()
    {
        this("",0.0);
    }

   public String getFlavor()
    {
        return this.flavor;
    }

   public double getUnitPrice()
    {
        return this.unitPrice;
    }

   public int getPackingCost() //เพิ่มมาใหม่
    {
        return this.packingCost;
    }

   public double calculateTotalPrice() //เพิ่มมาใหม่
    {
        return this.unitPrice+this.packingCost;
    }

    @Override
    public String toString() {
        return "Thanks you for your order!";
    }


}