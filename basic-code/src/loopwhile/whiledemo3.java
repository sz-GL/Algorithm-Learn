package loopwhile;

public class whiledemo3 {
    public static void main(String[] args) {
        double thickness = 0.1; // unit: millimeter
        double target = 8848.86 * 1000; // meter -> millimeter
        int count = 0;

        while (thickness < target) {
            thickness *= 2;
            count++;
        }

        System.out.println("纸张折叠" + count + "次后，厚度达到或超过珠峰高度。" );
    }
}

