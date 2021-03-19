public class Geometry {

    
    public static void main(String[] args) {
        
         Formulas fmla = new Formulas();
         
         //Made By Rechiang Cayabyab
         System.out.println(fmla.areaOfCircle(4.0));
         System.out.println(fmla.areaOfTriangle(5.0,7.0));

	//Made by Angel Ann Ibay
         System.out.println(fmla.areaOfSquare(6.5));
         System.out.println(fmla.areaOfRectangle(4.5,3.5));

         //Made by Ezekiel Benigno
         System.out.println(fmla.perimeterOfCircle(7.0));
         System.out.println(fmla.perimeterOfSquare(6.0));

}
}


class Formulas{
    
    //Method 1 and 2 Rechiang Cayabyab
    public double areaOfCircle(double r){
        double pi =  3.1415;
        double area = (pi*(r*r));
        return area;
    }
    public double areaOfTriangle(double b, double h){
        double area = (b*h)/2;
        return area;
    }

	//Method 3 and 4 Angel Ann Ibay
    public double areaOfSquare(double a){
        double area = (a*a);
        return area;
    }
    public double areaOfRectangle(double b, double h){
        double area = (b*h);
        return area;
    }
    //Method 5 and 6 Ezekiel Benigno
    public double perimeterOfCircle(double r){
        double pi =  3.1415;
        double perim = ((2*pi)*(r));
        return perim;
    }
    public double perimeterOfSquare(double a){
        double perim = (4*a);
        return perim;
    }



}

