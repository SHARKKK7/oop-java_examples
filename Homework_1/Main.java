import java.util.List;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        People granA = new People("Ekaterina", "female", 80, null, null);
        People dadA = new People("Ivan", "male", 53, null, granA);
        People granB = new People("Mikhail", "male", 61, null, null);
        People granC = new People("Anastasia", "female", 49, null, null);
        People momA = new People("Julia", "female", 29, granB, granC);
        People momB = new People("Vika", "female", 35, granB, null);
        People momD = new People("Maria", "female", 56, null, null);
        People sonA = new People("Petr", "male", 30, dadA, momD);
        People granson1 = new People("Daria", "female", 2, sonA, momA);
        People granson2 = new People("Vasia", "male", 5, sonA, momA);
        People granson3 = new People("Jurii", "male", 8, sonA, momA);
        family.add(granA);
        family.add(dadA);
        family.add(granB);
        family.add(granC);
        family.add(momA);
        family.add(momB);
        family.add(momD);
        family.add(sonA);
        family.add(granson2);
        family.add(granson3);
        family.add(granson1);

        System.out.println(family);

        System.out.println(family.search("Ivan"));

        List<String> broAndSis = family.getFamMembers("Vasia");
        System.out.println(broAndSis);
        List<String> broAndSis2 = family.getFamMembers("Julia");
        System.out.println(broAndSis2);
        List<String> broAndSis3 = family.getFamMembers("Ivan");
        System.out.println(broAndSis3);

    }
}