package h1;

public class Zahl {
    public boolean even = true;
    public boolean small = true;
    public boolean positive = true;
    public int num = 1000;


    public void setEven(){
        even = (num % 2 == 0);

    }
    public void setSmall(){
        small = num < 100;
    }
    public void setPositive(){
        positive = num > 0;
    }
}
