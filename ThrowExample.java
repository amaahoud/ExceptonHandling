public class ThrowExample {
    static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t;
        // System.out.println("Ini tidak lagi dicetak"); // baris ini tidak akan dijalankan
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}