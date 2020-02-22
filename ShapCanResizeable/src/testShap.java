public class testShap {
    public static void main(String[] args) {
        Shap shap = new Shap();
        System.out.println(shap);

        shap = new Shap("red",false);
        System.out.println(shap);

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("green",false,2,3,4);
        System.out.println(triangle);
    }
}
