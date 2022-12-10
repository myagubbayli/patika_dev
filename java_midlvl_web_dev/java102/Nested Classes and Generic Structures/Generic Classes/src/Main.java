public class Main {
    public static void main(String[] args) {

        // Undefined 
        // String s;

        // null
        // String s1 = null;

        // empty
        // String s2 = "";


        // String str = null;
        // NullableString n = new NullableString(str);
        // n.run();

        // Integer a = null;
        // NullableInteger ni = new NullableInteger(a);
        // ni.run();

        // NullableGeneric<Integer> n = new NullableGeneric<Integer>(10);
        // n.run();

        // Integer a = 12;
        // String str = "abc";

        // NullableGeneric<String> n = new NullableGeneric<>(str);
        // n.run();

        Integer a = 10;
        String b = "Patika";
        Double d = 3.14; 
        String c = "dev"; 

        NullableMultiple<Integer, String, Double> t = new NullableMultiple<>(a, b, d);
        t.setObj2(c);
        t.showInfo(); 
    }
}