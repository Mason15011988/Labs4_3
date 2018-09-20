public class Computer {
    private String proc;
    private int ram;
    private int hdd;
    private int resurs;

    public Computer(String proc, int ram, int hdd, int resurs) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
        this.resurs = resurs;
    }

    public Computer(){

    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResurs() {
        return resurs;
    }

    public void setResurs(int resurs) {
        this.resurs = resurs;
    }
    public void out (){
        System.out.println("Характеристики компа");
        System.out.println("Процессор - " + proc);
        System.out.println("Оперативная память -  " + ram );
        System.out.println("Жесткий диск -  " + hdd );
        System.out.println("Ресурс полных циклов работы - " + resurs);
        System.out.println();
    }
}
