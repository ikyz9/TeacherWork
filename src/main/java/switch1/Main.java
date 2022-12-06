package switch1;

public class Main {
    public static void main(String[] args) {
        int num = 3;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 3:
                System.out.println("число равно 3");
                num++;
                break;
            case 4:
                System.out.println("число равно 4");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
    }
}
