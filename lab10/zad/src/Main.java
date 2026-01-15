import zad1.CollectionTools;
import zad10.MapUtils;
import zad11.MapAnalytics;
import zad12.MapRangeUtils;
import zad2.SequenceTools;
import zad3.ListUtils;
import zad4.PalindromeUtils;
import zad5.ListValidator;
import zad6.SetUtils;
import zad7.QueueUtils;
import zad8.DequeUtils;
import zad9.QueueMerger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

void main() {
    //1
    List<String> imiona = new ArrayList<>(Arrays.asList(
            "Anna", "Taco", "Piotr", "Anna", "Maja", "Jan", "Gregor"
    ));

    System.out.println("Oryginalna lista: " + imiona);

    CollectionTools.printUnique(imiona);

    List<Integer> liczby = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
    System.out.println("Test dla liczb:");
    CollectionTools.printUnique(liczby);

    //2
    List<String> owoce = Arrays.asList("Jabłko", "Banan", "Pomarańcza", "Winogrona");
    System.out.println("\nTest dla Listy:");
    SequenceTools.reversePrint(owoce);

    Set<Integer> liczby2 = new HashSet<>(Arrays.asList(1, 10, 100, 1000));
    System.out.println("Test dla Zbioru:");
    SequenceTools.reversePrint(liczby2);

    //3
    ArrayList<String> owoce1 = new ArrayList<>(Arrays.asList("Jabłko", "Banan"));
    ArrayList<String> owoce2 = new ArrayList<>(Arrays.asList("Cytryna", "Arbuz"));

    System.out.println("\nLista 1: " + owoce1);
    System.out.println("Lista 2: " + owoce2);

    ArrayList<String> wszystkieOwoce = ListUtils.mergeLists(owoce1, owoce2);

    System.out.println("Połączona lista: " + wszystkieOwoce);

    System.out.println("Czy oryginalna lista 1 pozostała bez zmian? " + owoce1.size());

    //4
    LinkedList<Integer> liczby3 = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
    System.out.println("\nCzy [1,2,3,2,1] to palindrom? " + PalindromeUtils.isPalindrome(liczby3));

    LinkedList<String> slowo = new LinkedList<>(Arrays.asList("A", "B", "C", "A"));
    System.out.println("Czy [A,B,C,A] to palindrom? " + PalindromeUtils.isPalindrome(slowo));

    LinkedList<Character> parzysty = new LinkedList<>(Arrays.asList('k', 'a', 'j', 'a', 'k'));
    System.out.println("Czy 'kajak' to palindrom? " + PalindromeUtils.isPalindrome(parzysty));

    //5
    List<String> imiona2 = Arrays.asList("Jan", "Anna", "Piotr", "Jan", "Maria", "Anna");

    System.out.println("\nOryginalna lista: " + imiona2);

    HashSet<String> unikalne = ListValidator.findUniqueElements(imiona2);

    System.out.println("Zbiór unikalnych elementów: " + unikalne);
    System.out.println("Liczba unikalnych osób: " + unikalne.size());

    //6
    TreeSet<Integer> liczby4 = new TreeSet<>(Arrays.asList(10, 25, 5, 40, 30, 15, 50));

    System.out.println("\nOryginalny zbiór: " + liczby4);


    TreeSet<Integer> wynik = SetUtils.findElementsInRange(liczby4, 15, 40);

    System.out.println("Elementy w zakresie [15, 40]: " + wynik);

    TreeSet<String> slowa = new TreeSet<>(Arrays.asList("Anna", "Bartosz", "Celina", "Daniel", "Ewa"));
    TreeSet<String> wynikSlowa = SetUtils.findElementsInRange(slowa, "B", "D");

    System.out.println("Słowa od B do D: " + wynikSlowa);

    //7
    Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println("\nKolejka przed odwróceniem: " + q);

    QueueUtils.reverseQueue(q);

    System.out.println("Kolejka po odwróceniu: " + q);

    //8
    Deque<Integer> liczby5 = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
    System.out.println("\nCzy [1,2,3,2,1] jest symetryczne? " + DequeUtils.isSymmetric(liczby5));

    Deque<String> slowa3 = new ArrayDeque<>(Arrays.asList("Java", "is", "Java"));

    Deque<String> slowa4 = new ArrayDeque<>(Arrays.asList("Start", "Middle", "End"));
    System.out.println("Czy [Start, Middle, End] jest symetryczne? " + DequeUtils.isSymmetric(slowa4));

    System.out.println("Czy pusta kolejka jest symetryczna? " + DequeUtils.isSymmetric(new ArrayDeque<>()));

    //9
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Arrays.asList(10, 30, 20));
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Arrays.asList(5, 15, 25));

    PriorityQueue<Integer> merged = QueueMerger.mergePriorityQueues(pq1, pq2);

    System.out.println("\nLiczba elementów w połączonej kolejce: " + merged.size());

    System.out.print("Elementy w kolejności priorytetu: ");
    while (!merged.isEmpty()) {
        System.out.print(merged.poll() + " ");
    }

    //10
    Map<String, String> krajeMiasta = new LinkedHashMap<>();
    krajeMiasta.put("Polska", "Warszawa");
    krajeMiasta.put("Niemcy", "Berlin");
    krajeMiasta.put("Francja", "Paryż");
    krajeMiasta.put("JakiśKraj", "Warszawa");

    System.out.println("Oryginał: " + krajeMiasta);

    Map<String, String> miastaKraje = MapUtils.reverseMap(krajeMiasta);

    System.out.println("Po odwróceniu: " + miastaKraje);

    //11
    HashMap<String, String> ocenyStudentow = new HashMap<>();
    ocenyStudentow.put("Kowalski", "Bardzo dobry");
    ocenyStudentow.put("Nowak", "Dobry");
    ocenyStudentow.put("Wiśniewski", "Bardzo dobry");
    ocenyStudentow.put("Wójcik", "Dostateczny");
    ocenyStudentow.put("Lewandowski", "Dobry");

    System.out.println("Dane wejściowe: " + ocenyStudentow);

    HashMap<String, Integer> statystykaOcen = MapAnalytics.countValueOccurrences(ocenyStudentow);

    System.out.println("\nStatystyka wystąpień wartości:");
    statystykaOcen.forEach((ocena, liczba) ->
            System.out.println(ocena + ": " + liczba));

    //12
    TreeMap<Integer, String> pracownicy = new TreeMap<>();
    pracownicy.put(101, "Jan Kowalski");
    pracownicy.put(105, "Anna Nowak");
    pracownicy.put(110, "Piotr Wiśniewski");
    pracownicy.put(120, "Maria Wójcik");
    pracownicy.put(150, "Robert Lewandowski");

    System.out.println("\nPełna lista: " + pracownicy);

    TreeMap<Integer, String> zakres = MapRangeUtils.subMapInRange(pracownicy, 105, 120);

    System.out.println("Pracownicy z ID w zakresie [105, 120]:");
    zakres.forEach((id, name) -> System.out.println("ID: " + id + ", Imię: " + name));
}

