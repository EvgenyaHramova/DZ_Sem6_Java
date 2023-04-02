
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebooks> catalogNotebooks = new HashSet<>();
        // ArrayList<Notebooks> catalogNotebooks = new ArrayList<>();

        Notebooks nb1 = new Notebooks("HUAWEI", "Windows 11", 8, 15.0, 256, "серебристый");
        Notebooks nb2 = new Notebooks("MSI", "Windows 11", 8, 14.0, 256, "серый");
        Notebooks nb3 = new Notebooks("Lenovo", "Windows 10", 4, 15.6, 128, "черный");
        Notebooks nb4 = new Notebooks("Acer", "Windows 11", 16, 15.6, 512, "черный");
        Notebooks nb5 = new Notebooks("GIGABYTE", "Windows 11", 16, 17.3, 1000, "серебристый");
        // nb1.getNote();
        catalogNotebooks.add(nb1);
        catalogNotebooks.add(nb2);
        catalogNotebooks.add(nb3);
        catalogNotebooks.add(nb4);
        catalogNotebooks.add(nb5);
        // System.out.println(catalogNotebooks);

        System.out.println("Выберите один из вариантов сортировки:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        Iterator<Notebooks> it = catalogNotebooks.iterator(); //проба одной из проверок итератором
        Scanner inputSort = new Scanner(System.in, "Cp866");
        Integer num_sort = inputSort.nextInt();
        if (num_sort == 1) {
            System.out.println("Введите  минимальное требуемое значение ОЗУ:");
            Integer ram_sort = inputSort.nextInt();
            for (Notebooks item : catalogNotebooks) {
                if (item.getRam() >= ram_sort) {
                    System.out.println(item);
                }
            }
        }

        if (num_sort == 2) {
            System.out.println("Введите требуемое значение объема жесткого диска: ");
            Integer v_hdd_sort = inputSort.nextInt();
            while (it.hasNext()) {
                Notebooks hdd = it.next();
                if (hdd.getVhdd() >= v_hdd_sort) {
                    System.out.println(hdd);
                }
                
            }
        }

        if (num_sort == 3) {
            System.out.println("Введите название операционной системы: ");
            String o_s_sort = inputSort.next();
            for (Notebooks item : catalogNotebooks) {
                if (item.getOS().contains(o_s_sort)) {
                    System.out.println(item);
                }
                
            }
        }

        if (num_sort == 4) {
            System.out.println("Введите желаемый цвет машины: ");
            String color_sort = inputSort.next();
            for (Notebooks item : catalogNotebooks) {
                if (item.getColor().contains(color_sort)) {
                    System.out.println(item);
                }
                
            }
            
        }

        inputSort.close();
    }
}
