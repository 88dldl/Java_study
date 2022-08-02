public class Number1 {
    public static void main(String[] args){
        int[] grade={80,75,55};
        double sum = 0;
        for(int i=0;i<3;i++){
            sum+=grade[i];
        }
        System.out.println(sum/3);
    }
}
