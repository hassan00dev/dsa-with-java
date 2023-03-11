package test;

public class Run {
    public static void main(String[] args) {
        DDL a1 = new DDL();
        DDL a2 = new DDL();

        a1.add(30);
        a1.add(28);
        a1.add(26);
        a1.add(24);
        a1.add(15);

        a2.add(8);
        a2.add(4);
        a2.add(3);
        a2.add(2);
        a2.add(0);

        if (!isDescending(a1) || !isDescending(a2)){
            System.out.println("Double Linked List is not in descending order.");
        }else if (a1.size() != a2.size()){
            System.out.println("Size not matched!");
        }else {
            DDL merged = merge(a1, a2);
            System.out.println("Merged Array: ");
            System.out.print(merged);
        }
    }

    private static DDL merge(DDL a1, DDL a2){
        DDL merged = new DDL();
        for (int i = 0; i < a1.size(); i++) {
            merged.add(a1.get(i) * a2.get(i));
        }
        return merged;
    }

    private static boolean isDescending(DDL a){
        for(int i = 0; i < a.size() - 1; i++){
            if (a.get(i) < a.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
