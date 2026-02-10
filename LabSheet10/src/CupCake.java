public class CupCake extends Bakery {
    private int round;

   public CupCake(int round,String flavor,double unitPrice)
    {
        super(flavor,unitPrice);
        this.round=round;
    }

   public boolean isPacking()
    {
        return this.round>=6;
    }

   public int getBoxNumber()
    {
        if (isPacking())
        {
            return this.round/6;
        }
        return 0;
    }

   public int getBagNumber()
    {
        return this.round%6;
    }

    @Override
   public int getPackingCost()
    {
        if (isPacking()) return getBoxNumber() * super.getPackingCost();
        return 0;
    }

    @Override
   public double calculateTotalPrice()
    {
        return (this.round * super.getUnitPrice()) + getPackingCost() + (getBagNumber() * 0.5);
    }

    @Override
    public String toString() {
        return super.toString()+"\nCup cake ("+super.getFlavor()+") With "+(isPacking()?getBoxNumber()+" Box ":"")+getBagNumber()+" Bag "+
                "\nTotal price of Cup cake = "+calculateTotalPrice();
    }


}