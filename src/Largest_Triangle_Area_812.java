public class Largest_Triangle_Area_812 {
    public static void main(String main[]){
        int [][]points = {{0,0},{0,1},{1,0},{0,2},{2,0}};

        double height = 0;
        double base = 0;
        for(int i=0;i<points.length;i++){
            height = Math.max(height,points[i][0]);
            base = Math.max(base,points[i][1]);
        }
        System.out.println((base*height)/2);
    }
}
