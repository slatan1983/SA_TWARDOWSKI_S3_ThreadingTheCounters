package RippingTheThreads.Interfaces;

public interface Printable {

    static void printCount(String thread, int count){

        System.out.println("Thread '"+thread+"' is counting: "+count);

    }

    static void printTime(String thread, long time){
        System.out.println("//////////////////////////////////"+thread+" FINISHED IN "+time+"ms.");
    }

}
