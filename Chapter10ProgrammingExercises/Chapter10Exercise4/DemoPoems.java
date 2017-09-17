package Chapter10Exercise4;

public class DemoPoems {

    public static void main(String args[]){
        Poem poem1 = new Poem("Poem 1", 16);
        Couplet poem2 = new Couplet("Couplet 1");
        Limerick poem3 = new Limerick("Limerick 1");
        Haiku poem4 = new Haiku("Haiku 1");

        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);

    }
    public static void display(Poem p){
        System.out.println("Poem: "+p.getTitle()+" has "+p.getLines()+" lines.");
    }
}
