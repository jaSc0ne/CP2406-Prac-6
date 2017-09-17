public class FixDebugMusical extends FixDebugPlay{
    protected String composer;
    FixDebugMusical(String title, String author, String composer){
        super(title, author);
        this.composer = composer;
    }
    public void display(){
        System.out.println("The performance is "+title+" by "+author+"\nThe music for "+title+" is by "+composer);
    }
}