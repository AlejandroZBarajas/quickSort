public class Main {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] listaOG = new int[20];
        int[] lista;
        int sumaDer, sumaIzq;

        qs.generarNumero(listaOG);
        lista = listaOG.clone();
        qs.OrdenarQuickSort(lista, 0, lista.length - 1);

        sumaIzq = qs.sumarParteIzq(lista, 0);
        sumaDer = qs.sumarParteDer(lista, lista.length / 2);

        if (sumaIzq > sumaDer) {
            System.out.println("Lista ordenada:");
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        }
        
    }
    
}