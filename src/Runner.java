import java.util.ArrayList;

public class Runner
{
    public static void main(String args[])
    {
            ArrayList<String> names = new ArrayList<String>();
            names.add("Jessica");
            names.add("Emily");
            names.add("Destiny");
            names.add("Mateo");
            names.add("Sofia");
            names.add("Tim");
            names.add("James");

// before:
            System.out.println(names);

// complete code below to traverse the arraylist and insert "HELLO" after any
// name that contains the letter "i"
            for (int x = 0; x < names.size(); x++) {
                if (names.get(x).contains("i")) {
                    names.add(x + 1, "HELLO");
                }
            }

// after
            System.out.println(names);
            ArrayList<String> names2 = new ArrayList<String>();
            names2.add("Jessica");
            names2.add("Emily");
            names2.add("Destiny");
            names2.add("Mateo");
            names2.add("Sofia");
            names2.add("Tim");
            names2.add("James");

// before:
            System.out.println(names2);

// complete code below to traverse the arraylist and remove all
// names that are exactly 5 letters long
 for (int x = 0; x < names2.size(); x++)
 {
    if (names2.get(x).length() == 5)
     {
        names2.remove(x);
        x--;
     }
 }

// after
 System.out.println(names2);

        }

        }