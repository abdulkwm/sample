public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \t");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));


        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        System.out.println(builderPlus);
//        builderPlus.deleteCharAt(10);
        System.out.println(builderPlus);
        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("string is Empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is Blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length -1));
    }
}