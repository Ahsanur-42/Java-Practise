public class Dog {
    String breed;
    String size;
    int age;
    String color;
    public String getInfo()
    {
        return("Breed is:"+breed+" Size is:"+size+" Age is:"+age+"  Color is:"+color+"");
    }
    public static void main(String []arg)
    {
        Dog maltese = new Dog();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "White";
        System.out.println(maltese.getInfo());
        }
}
