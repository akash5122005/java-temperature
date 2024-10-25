import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0.0;
        double[] temp = new double[n];

        for(int i = 0; i < n; i++) {
            temp[i] = input.nextDouble();
            sum += temp[i];
        }
        input.close();
        double avg = (sum / n);
        double max = temp[0];
        double min = temp[0];
        for(int i = 1; i<n;i++) {
            if(temp[i] > max){
                max = temp[i];
            }
            if(temp[i] < min){
                min = temp[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(temp[i] > avg ){
                System.out.print(temp[i] + " ");    
            }
        }
        System.out.println();
        System.out.println("Average Temperature: " + avg);
        System.out.println("Maximum Temperature: " + max);
        System.out.println("Minimum Temperature: " + min);
    }
}
