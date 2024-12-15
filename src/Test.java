import java.awt.print.Printable;

    interface printable{
        void print();
    }

class MyNumber extends Number implements printable{

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void print() {

    }
}

//Multiple boundation, first will always be class

class Boxx <T extends String & printable>{

}
