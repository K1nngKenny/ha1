package htw.berlin.prog2.ha1;

public class Vector {
    private int[] _data;
    private int _length;
    public Vector() {
        _data = new int[4];
    }
    public int get(int position){
        int datum = this._data[position];
        return datum;
    }
    public void set(int position, int value){
    }
    public int getLength(){
        return this._length;
    }
    public void append(int value){

    }

    public static void main(String[] args){
        Vector vector = new Vector();
        System.out.println(vector.getLength());
    }
}
