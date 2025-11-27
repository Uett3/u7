package h3;

import java.lang.reflect.GenericArrayType;

public class Mensch {
    public String name = "Thomas";
    public int gebJahr = 2006;
    public int alter = 19;

    int jahr = 2025;

    public void setName(String iName){
        name = iName;
    }
    public void setGebJahr(int igebJahr){
        gebJahr = igebJahr;
    }

    public void setAlter(){
        alter = jahr - gebJahr;
    }

    public String getName (){

        return name;
    }

    public int getGebJahr(){
        return gebJahr;
    }

    public int getAlter(){
        return alter;
    }

}
