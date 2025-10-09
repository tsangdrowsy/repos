public class Nguoi {
    String cmd, hten;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getHten() {
        return hten;
    }

    public void setHten(String hten) {
        this.hten = hten;
    }

    public Nguoi(String cmd, String hten) {
        this.cmd = cmd;
        this.hten = hten;
    }

    public Nguoi() {
        this.cmd = "123456";
        this.hten = "Nguyen Van An";
    }

    public void xuat() {
        System.out.println("Ho ten: " + hten + " CMD: " + cmd);
    }
}

