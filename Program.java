public class Program {
    public static void main(String[] args) {


        Employee employee0 = new Employee("Name#1", 44);
        System.out.println(employee0.hashCode());
        Employee employee1 = new Employee("Name#2", 35);
        System.out.println(employee1.hashCode());

        HashMap<String, String> hashMap0 = new HashMap<>(4);

        String oldValue;

        oldValue = hashMap0.put("82424934", "Name#1");
        oldValue = hashMap0.put("82567924", "Name#2");
        oldValue = hashMap0.put("82444934", "Name#3");

    }
}