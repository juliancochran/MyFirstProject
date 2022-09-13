public class Bobby {
    // encapsulation
    private String name;
    private int age;    // primitive data: holdover from C
    private double coolnessFactor;  // camelCase

    /*
    primitives from C/C++
    int (short, int, long), double (float), boolean, char
     */
    private final double PI = 3.141578;

    /**
     * Parameterized constructor for class Bobby
     * @param n name
     * @param a age
     * @param c coolnessFacor
     */
    public Bobby(String n, int a, double c) {
        name = n;       // ASSIGNMENT OPERATOR -- right-associative
        age = a;
        coolnessFactor = c;
    }

    // ACCESSOR METHODS
    public String getName()     {   return name;    }
    public int getAge()         {   return age;     }
    /**
     * public return of coolnessFactor
     * @return a double representing how cool this Bobby is
     */
    public double getCoolness() {   return coolnessFactor;  }

    public String toString()    {
        return name + " is " + age + " years old and is " +
                (coolnessFactor*100) + "% like cool";
    }

    public static void main(String[] args) {
        Bobby b = new Bobby("Methusalah", 969, .99);
        System.out.println(b);
        System.out.println(b.getCoolness());
    }
}







