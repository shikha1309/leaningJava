interface MyRBI {
    //declares only
    void write();
    void read();
}
class SBI implements MyRBI{

    @Override
    public void write() {
        System.out.println("SBI reads");

    }

    @Override
    public void read() {

    }
}
