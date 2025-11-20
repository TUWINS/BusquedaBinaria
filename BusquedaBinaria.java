public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arreglo, int objetivo) {


        public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1, closest = -1;  // Inicializa los límites de búsqueda (izquierda y derecha) y closest como -1 (único para aproximación)
        while (left <= right) {  // Continúa mientras haya elementos por buscar (izquierda <= derecha)
            int mid = left + (right - left) / 2;  // Calcula el índice medio para dividir el espacio de búsqueda a la mitad
            if (arr[mid] == target) return mid;  // Si el elemento en mid es igial  retorna el índice (búsqueda exitosa!!)
            // Actualiza el closest si el elemento actual está más cerca del target que el anterior (elemento único para aproximación)
            if (Math.abs(arr[mid] - target) < Math.abs(closest == -1  Integer.MAX_VALUE : arr[closest] - target)) {
                closest = mid;  // Establece el nuevo closest como mid
            }
            if (arr[mid] < target) left = mid + 1;  // Si el elemento en mid es menor que target, busca en la mitad derecha (ajusta izquierda)
            else right = mid - 1;  // Si el elemento en mid es mayor que target, busca en la mitad izquierda (ajusta derecha)
        }
        return closest;  
    
    }
}
