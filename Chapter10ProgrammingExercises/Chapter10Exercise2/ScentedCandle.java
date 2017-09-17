package Chapter10Exercise2;

public class ScentedCandle extends Candle {
    private String scent;
    public String getScent(){
        return scent;
    }
    public void setScent(String scent){
        this.scent = scent;
    }

    public void setHeight(int h){
        final double PER_INCH = 3; // $3 per inch
        super.setHeight(h);
        price = h*PER_INCH;
    }


}
