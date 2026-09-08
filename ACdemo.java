public class ACdemo {
    public static void main(String[] args) {
        
        AC ac1 = new AC ("Daikin", "1 PK", 24, "45 cm", "800");
        AC ac2 = new AC ("Panasonic", "1 PK", 22, "37 cm", "750");
        AC ac3 = new AC ("LG", "1.5 PK", 23, "50 cm", "1100");
        AC ac4 = new AC ("Sharp", "1 PK", 25, "60 cm", "800");
        AC ac5 = new AC ("Samsung", "1.5 PK", 21, "75 cm", "700");
        AC ac6 = new AC ("Daikin", "2 PK", 24, "65 cm", "1500");
        AC ac7 = new AC ("Panasonic", "1 PK", 23, "70 cm", "800");
        AC ac8 = new AC ("LG", "1 PK", 22, "70 cm", "1000");
        AC ac9 = new AC ("Sharp", "1.5 PK", 24, "80 cm", "900");
        AC ac10 = new AC ("Samsung", "2 PK", 20, "85 cm", "950");

        ac1.mengaturSuhu(1);
        ac1.mengaturArah("Atas");
        ac1.mengubahMode("Bayi");

        ac2.mengaturSuhu(2);
        ac2.mengaturArah("Bawah");
        ac2.mengubahMode("Dewasa");

        ac3.mengaturSuhu(1);
        ac3.mengaturArah("Bawah");
        ac3.mengubahMode("Bayi");

        ac4.mengaturSuhu(2);
        ac4.mengaturArah("Atas");
        ac2.mengubahMode("Dewasa");

        ac5.mengaturSuhu(1);
        ac5.mengaturArah("Bawah");
        ac5.mengubahMode("Dewasa");

        ac6.mengaturSuhu(2);
        ac6.mengaturArah("Atas");
        ac6.mengubahMode("Bayi");

        ac7.mengaturSuhu(1);
        ac7.mengaturArah("Bawah");
        ac7.mengubahMode("Bayi");

        ac8.mengaturSuhu(2);
        ac8.mengaturArah("Bawah");
        ac8.mengubahMode("Dewasa");

        ac9.mengaturSuhu(1);
        ac9.mengaturArah("Atas");
        ac9.mengubahMode("Bayi");

        ac10.mengaturSuhu(2);
        ac10.mengaturArah("Atas");
        ac10.mengubahMode("Dewasa");

        System.out.println("AC 1");
        ac1.dinyalakan();
        ac1.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 2");
        ac2.dinyalakan();
        ac2.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 3");
        ac3.dinyalakan();
        ac3.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 4");
        ac4.dinyalakan();
        ac4.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 5");
        ac5.dinyalakan();
        ac5.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 6");
        ac6.dinyalakan();
        ac6.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 7");
        ac7.dinyalakan();
        ac7.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 8");
        ac8.dinyalakan();
        ac8.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 9");
        ac9.dinyalakan();
        ac9.tampilkanInformasi();
        System.out.println();

        System.out.println("AC 10");
        ac10.dinyalakan();
        ac10.tampilkanInformasi();
        System.out.println();
    }
}
