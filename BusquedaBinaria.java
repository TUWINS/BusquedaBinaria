import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BusquedaBinaria {

        public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1, closest = -1;  /*  Inicializa los límites de búsqueda (izquierda y derecha) y closest como -1 (único para aproximación)*/
        while (left <= right) {  /*  Continúa mientras haya elementos por buscar (izquierda <= derecha)*/
            int mid = left + (right - left) / 2;  /*  Calcula el índice medio para dividir el espacio de búsqueda a la mitad*/
            if (arr[mid] == target) return mid;  /*  Si el elemento en mid es igial  retorna el índice (búsqueda exitosa!!)*/
            /*  Actualiza el closest si el elemento actual está más cerca del target que el anterior (elemento único para aproximación)*/
            if (Math.abs(arr[mid] - target) < Math.abs(closest == -1 ? Integer.MAX_VALUE : arr[closest] - target)) {
                closest = mid;  /*  Establece el nuevo closest como id*/
            }
            if (arr[mid] < target) left = mid + 1;  /*  Si el elemento en mid es menor que target, busca en la mitad derecha (ajusta izquierda)*/
            else right = mid - 1;  /*  Si el elemento en mid es mayor que target, busca en la mitad izquierda (ajusta derecha)*/
        }
        return closest;  
        }
        public static void main(String[] args) {  /*  Método principal que ejecuta el programa, lee entrada, busca y escribe salida*/
        try {
            // Abre el archivo de entrada para leer el arreglo y el target
            BufferedReader br = new BufferedReader(new FileReader("input_binary.txt"));
            String[] arrParts = br.readLine().split(" ");  /*  Lee la primera línea y la divide en partes (arreglo ordenado separado por espacios)*/
            int[] arr = new int[arrParts.length];  /*  Crea un arreglo de enteros del tamaño adecuado*/
            for (int i = 0; i < arrParts.length; i++) {
                arr[i] = Integer.parseInt(arrParts[i]);  /*  Convierte cada parte a entero y la asigna al arreglo*/
            }
            int target = Integer.parseInt(br.readLine());  /*  Lee la segunda línea como el target a buscar*/
            br.close();  /*  Cierra el lector para liberar recursos*/
            /*  Ejecuta la búsqueda binaria única*/
            int index = binarySearch(arr, target);
            // Escribe el resultado en el archivo de salida
            BufferedWriter bw = new BufferedWriter(new FileWriter("output_binary.txt"));
            bw.write("Índice: " + index + (index != -1 && arr[index] != target ? " (aproximado)" : ""));  /*  Escribe el índice, agregando "(aproximado)" si es cercano y no exacto (único)*/
            bw.close();  /*  Cierra el escritor*/
            System.out.println("Búsqueda Binaria única completada. Resultado en output_binary.txt");  /*  Mensaje de confirmación*/
        } catch (IOException e) {  /*  Captura excepciones de entrada/salida*/
            e.printStackTrace();  /*  Imprime la traza del error*/
        }
    
}   }

            
