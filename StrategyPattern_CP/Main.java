package strategy_pattern0;

public class Main {

    public static void main(String[] args) {
        Context context;

        context= new Context(new AddOperation());
        System.out.println(context.execute(10,12));

        context= new Context(new MulOperation());
        System.out.println(context.execute(10,12));

    }
}
