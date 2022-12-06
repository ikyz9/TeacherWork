package exceptions;

public class Main {
    public static void main(String[] args) {
        try{
            int result = getFactorial(-6);

            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println("exception for this number:" + ex.n);
        }
    }

    public static int getFactorial(int num) throws FactorialException{
        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);
        for(int i=1; i<=num;i++){
            result*=i;
        }
        return result;
    }
}



