public class testShap {
    public static void main(String[] args) {
        Shap triangle1 = new Triangle("green",true,1,2,3);
        Shap triangle2 = new Triangle("blue",true,2,3,4);
        Shap square1 = new Square(2,"red",true);
        Shap square2 = new Square(3,"red",false);

        Shap[] shaps = {triangle1,triangle2,square1,square2};

    }
}
