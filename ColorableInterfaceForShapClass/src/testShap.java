
public class testShap {
    public static void main(String[] args) {

        Shap triangle = new Triangle("green", false, 2, 5, 4);

        Shap triangle1 = new Triangle("green", false, 2, 3, 4);

        Shap square = new Square(4, "blue", false);

      //  System.out.println(((getArea) triangle).get_Area());

        Shap[] shapArray = {triangle, triangle1, square};
       // int result = 0;
        System.out.println();

        for (int i = 0; i < shapArray.length; i++) {
            if (shapArray[i] instanceof getArea) {
                System.out.println(((getArea) shapArray[i]).get_Area());
            }
        }

    for (int i = 0; i < shapArray.length; i++) {
            if (shapArray[i] instanceof Colorable) {
                ((Colorable) shapArray[i]).howToColor();
            }
        }
    }
}