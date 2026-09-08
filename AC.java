public class AC {
    String merek;
    String PK;
    String ukuran;
    String mode;
    String watt;
    String mengaturArah;
    int suhu;

    public AC(String merek, String PK, int suhu, String ukuran, String watt) {
        this.merek = merek;
        this.PK = PK;
        this.suhu = suhu;
        this.ukuran = ukuran;
        this.watt = watt;
    }

    public void dinyalakan() {
        System.out.println("AC " + merek + " dinyalakan.");
    }

    public void mengaturSuhu(int perubahan) {
        suhu -= perubahan;
    }

    public void mengubahMode(String modeBaru){
        mode = modeBaru;
    }

    public void mengaturArah(String arahBaru){
        mengaturArah = arahBaru;
    }

    public void tampilkanInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("PK: " + PK);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Suhu: " + suhu + "°C");
        System.out.println("Mode: " + mode);
        System.out.println("Arah Hembusan: " + mengaturArah);
        System.out.println("Watt: " + watt);
    }
}
