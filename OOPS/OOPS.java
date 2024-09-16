package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();//constructor.....created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Red";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vidhi";
        myAcc.setPassward("123@Vidhi");

    }
    
}

class BankAccount {
    public String username;
    private String password;

    public void setPassward(String pwd) {
        password = pwd;
    }
}
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int  newTip) {
        tip = newTip;
    }
}