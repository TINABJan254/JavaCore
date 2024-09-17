package j04002_khai_bao_lop_hcn;

public class Rectange {
    private double width, height;
    private String color;
    
    public Rectange(){
    }
    
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    void formatColor(){
        String res = "";
        res += Character.toUpperCase(this.color.charAt(0));
        for (int i = 1; i < this.color.length(); i++){
            res += Character.toLowerCase(this.color.charAt(i));
        }
        this.color = res;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    double findArea(){
        return width * height;  
    }
    
    double findPerimeter(){
        return (width + height) * 2;
    }
    
}
