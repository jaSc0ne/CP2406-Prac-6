package Chapter10Exercise2;

public class DemoCandle {
    public static void main(String args[]){
        Candle candle1 = new Candle();
        candle1.setColor("blue");
        candle1.setHeight(4);
        System.out.println("The "+candle1.getColor()+" candle that is "+candle1.getHeight()+" inches long costs $"+candle1.getPrice());

        ScentedCandle candle2 = new ScentedCandle();
        candle2.setColor("yellow");
        candle2.setHeight(5);
        candle2.setScent("buttermilk");
        System.out.println("The "+candle2.getColor()+", "+candle2.getScent()+" scented candle that is "+candle2.getHeight()+" inches long costs $"+candle2.getPrice());
    }


}
