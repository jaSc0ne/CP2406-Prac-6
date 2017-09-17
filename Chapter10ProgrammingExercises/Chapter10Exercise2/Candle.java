package Chapter10Exercise2;

public class Candle {

    private String color;
    private int height;
    protected double price;

    public String getColor(){
        return color;
    }
    public int getHeight(){
        return height;
    }
    public double getPrice(){
        return price;
    }
    public void setColor(String c){
        color = c;
    }
    public void setHeight(int h){
        final double PER_INCH = 2; // $2 per inch
        height = h;
        price = height*PER_INCH;
    }


}
