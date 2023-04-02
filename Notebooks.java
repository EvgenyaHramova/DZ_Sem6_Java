import java.io.PrintStream;

public class Notebooks {
    private String brend;
    private String o_s;
    private Integer ram;
    private double display;
    private int v_hdd;
    private String color;
    // int x,y; //поля x и y

    Notebooks() {
    }

    public Notebooks(String brend, String o_s, Integer ram, double display, Integer v_hdd, String color) {
        this.brend = brend;
        this.o_s = o_s;
        this.ram = ram;
        this.display = display;
        this.v_hdd = v_hdd;
        this.color = color;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getOS() {
        return o_s;
    }

    public void setOS(String o_s) {
        this.o_s = o_s;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public int getVhdd() {
        return v_hdd;
    }

    public void setVhdd(int v_hdd) {
        this.v_hdd = v_hdd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        StringBuilder sb_nb = new StringBuilder();
        sb_nb.append("Бренд: ");
        sb_nb.append(this.brend);
        sb_nb.append(", ОС: ");
        sb_nb.append(this.o_s);
        sb_nb.append(", Объем оперативной памяти: ");
        sb_nb.append(this.ram);
        sb_nb.append(" Гб");
        sb_nb.append(", Объем жесткого диска: ");
        sb_nb.append(this.v_hdd);
        sb_nb.append(" Гб");
        sb_nb.append(", Размер дисплея по диагонали: ");
        sb_nb.append(this.display);
        sb_nb.append(" дюймов");
        sb_nb.append(", Цвет: ");
        sb_nb.append(this.color);
        sb_nb.append(System.lineSeparator());
        return sb_nb.toString();

    }
    public void getNote(){
        System.out.printf("Бренд: %s\nОС: %s\nОбъем оперативной памяти: %d Гб\nОбъем жесткого диска: %d Гб\nРазмер дисплея по диагонали: %.1f дюймов\nЦвет: %s", brend, o_s, ram,  v_hdd, display,color);
        }
    
    
}
