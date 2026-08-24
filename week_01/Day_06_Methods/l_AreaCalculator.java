public class l_AreaCalculator{
    public static double calculateArea(double radius){
        double area=3.14*radius*radius;
       System.out.println(area);
        return area;
    }
    public static double calculateArea(double length,double width){
        double area = length*width;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args){
        calculateArea(10.0);
        calculateArea(5.0,4.0);
    }
}