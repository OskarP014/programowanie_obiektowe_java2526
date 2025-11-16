//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int i = 1;
    do {
        int parzysta = i * 2;
        int nieparzysta = parzysta - 1;
        System.out.println(nieparzysta + " " + parzysta);
        i++;

    } while (i <= 20);
}
