public class Main {


    public static void main(String[] args){
        int startNumber = 1;
        int endNumber = 100;

        FizzBuzz fizzBuzz = new FizzBuzz();

        for(int i=startNumber; i<endNumber+1; i++){
            System.out.println(fizzBuzz.answer(i));
        }
    }
}
