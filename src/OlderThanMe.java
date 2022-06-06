public class OlderThanMe {
    private String name;

    private int age;

    public OlderThanMe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String compareAge(OlderThanMe person) {
        String output = "";

        if (this.age < person.age) {
            output = person.name + " is older than me.";
        } else if (this.age > person.age) {
            output = person.name + " is younger than me.";
        } else {
            output = person.name + " is the same age as me.";
        }

        return output;
    }

    public static void main(String[] args) {
        OlderThanMe p1 = new OlderThanMe("Samuel", 24);
        OlderThanMe p2 = new OlderThanMe("Joel", 36);
        OlderThanMe p3 = new OlderThanMe("Lily", 24);

        System.out.println(p1.compareAge(p2));
        System.out.println(p2.compareAge(p1));
        System.out.println(p1.compareAge(p3));
    }
}