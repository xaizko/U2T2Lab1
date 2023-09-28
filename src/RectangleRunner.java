public class RectangleRunner {
    public static void main(String[] args)
    {
        Rectangle rec1 = new Rectangle(150, 200);
        Rectangle rec2 = new Rectangle(125);
        Rectangle rec3 = new Rectangle();

        rec1.setWidth(75);
        rec2.setWidth(75);
        rec2.setLength(75);
        rec3.setWidth(75);

        int rec1Area = rec1.calculateArea();
        int rec2Area = rec2.calculateArea();
        int rec3Area = rec3.calculateArea();

        System.out.println("These three plots requires " + (rec1Area+rec2Area+rec3Area) + " square feet of land.");

    }
}
