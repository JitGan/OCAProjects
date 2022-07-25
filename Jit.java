public class Jit {

    public static void main(String args[]) {
        String word = " ";
       try {

            if (word.contains(" "))
            {
                throw new myException("Word contains one or more spaces");
            }
        } catch (myException e)
       {
           System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

class myException extends RuntimeException  {
    public myException(String e) {
        super(e);
    }
}