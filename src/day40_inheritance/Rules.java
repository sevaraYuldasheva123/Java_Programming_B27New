package day40_inheritance;

public class Rules {



}
class A{

    public int getNum(){
        return 5;
    }

    String getName(){ // default access modifier --> can be overriden in sub classes for same access modifier or more visible one
        return "James";
    }

}

class B extends A{

    @Override
    public  int getNum(){ // cannot add parameters --> should be same as parent one
        return 5;
    }

}

class C extends A{

    @Override
    protected String getName(){ // putting protected because it is more visible than the defult
        return "James";
    }

}
