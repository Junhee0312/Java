public class BreakDoWhile {
    public static void main(String[] args) {

        int i = 1;

        do{
            if(i == 14) {

                i++;
                break;
            }
            System.out.println(i);
            i++;

        }while(i <= 14);
    }
}
