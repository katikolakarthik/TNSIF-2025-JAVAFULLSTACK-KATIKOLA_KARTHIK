package assignment_19_09_2025;

public class Wrapperclass {
    public static void main(String[] args) {
        byte b = 10;
        Byte bw = b;

        short s = 20;
        Short sw = s;

        int i = 30;
        Integer iw = i;

        long l = 40L;
        Long lw = l;

        float f = 50.5f;
        Float fw = f;

        double d = 60.60;
        Double dw = d;

        char c = 'A';
        Character cw = c;

        boolean bool = true;
        Boolean boolw = bool;

        System.out.println("Byte Wrapper: " + bw);
        System.out.println("Short Wrapper: " + sw);
        System.out.println("Integer Wrapper: " + iw);
        System.out.println("Long Wrapper: " + lw);
        System.out.println("Float Wrapper: " + fw);
        System.out.println("Double Wrapper: " + dw);
        System.out.println("Character Wrapper: " + cw);
        System.out.println("Boolean Wrapper: " + boolw);
    }
}
