public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        

        while (i <= 4) {

            System.out.println("KE" + i);

            int j = 1;

            while(j<=3){

            System.out.println("Hello"+j);

            j++;

            }

            i++;
        }
        System.out.println("while is exited at i value of "+i);
    }
}
