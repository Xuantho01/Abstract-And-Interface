public class Shap {
  private String color = "Green";
  private boolean filled = true;

  public Shap(){}

  public Shap(String color, boolean filled){
      this.color = color;
      this.filled = filled;
  }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A shap with color of" +getColor()
                + " And "+(isFilled() ? "filled" : "not filled");
    }
}
