public class Garbage {

    public String temp = "dsfadfgdfadsgsdfgasg";
    int[] i = new int[1000000];
    float val = 424.34f;
    long valu = 423423423;

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        long beforeObjectCreation= r.freeMemory();

        Garbage g = new Garbage();

        long afterObjectCreation = r.freeMemory();

        g = null;

       long afterObjectSetToNull = r.freeMemory();

        r.gc();

        long afterGarbageCollection = r.freeMemory();

        System.out.println("Memory before object creation: " + beforeObjectCreation);
        System.out.println("Memory after object creation: " + afterObjectCreation);
        System.out.println("Memory after object set to null: " + afterObjectSetToNull);
        System.out.println("Memory after garbage collection: " + afterGarbageCollection);
    }
}