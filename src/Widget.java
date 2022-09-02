public class Widget {
    private String name;
    private int ID;
    private double cost;

    public Widget(String n, int i, double c)    {
        name = n;
        ID = i;
        cost = c;
    }

    public static void main(String[] args) {
        Widget w = new Widget("waffle", 123, .75);
        System.out.println(w);
    }
}
