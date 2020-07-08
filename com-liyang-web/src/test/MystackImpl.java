public class MystackImpl extends MyStack {



    public static int NoException(){
        int i=10;
        try{
            System.out.println("i in try block is"+i);
            return --i;
        }catch(Exception e){
            --i;
            System.out.println("i in catch - form try block is"+i);
            return --i;
        }finally{

            System.out.println("i in finally - from try or catch block is"+i);
           // return --i;
        }
    }

    public static void main(String[] args) {
       int ruslut= MystackImpl.NoException();
        System.out.println(ruslut);
    }
}
