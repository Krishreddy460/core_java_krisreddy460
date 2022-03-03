class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }

}
  
// Driver class to test above
class G {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        //
        Test<String> sObj= new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        System.out.println(());
    }
}