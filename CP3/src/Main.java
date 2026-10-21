public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS DEL TDA PILA ===\n");

        LinkedStack<String> pila = new LinkedStack<>();

        // --- CASOS POSITIVOS ---
        System.out.println("--- PRUEBAS POSITIVAS ---");
        System.out.println("1. La pila está vacía al inicio? " + pila.isEmpty());
        
        System.out.println("2. Insertando 'A', 'B', 'C'...");
        pila.push("A");
        pila.push("B");
        pila.push("C");
        
        System.out.println("3. La pila sigue vacía? " + pila.isEmpty());
        System.out.println("4. Elemento en la cima (Top): " + pila.top()); // Debe ser C
        
        System.out.println("5. Extrayendo elemento (Pop): " + pila.pop()); // Debe ser C
        System.out.println("6. Nueva cima después del Pop: " + pila.top()); // Debe ser B
        
        System.out.println("7. Insertando 'D' y 'E'...");
        pila.push("D");
        pila.push("E");
        System.out.println("8. Nueva cima: " + pila.top()); // Debe ser E


        // --- CASOS NEGATIVOS ---
        System.out.println("\n--- PRUEBAS NEGATIVAS ---");
        
        System.out.println("9. Intentando insertar un elemento null...");
        pila.push(null); // Debe imprimir el mensaje de error y no modificar la pila
        
        System.out.println("10. La cima sigue siendo el mismo? " + pila.top()); // Sigue siendo E

        System.out.println("11. Vaciando la pila...");
        pila.pop(); // E
        pila.pop(); // D
        pila.pop(); // B
        pila.pop(); // A
        
        System.out.println("12. Haciendo Pop en una pila vacía:");
        pila.pop(); // Debe mostrar "La pila esta vacía." y retornar null
        
        System.out.println("13. Haciendo Top en una pila vacía:");
        pila.top(); // Debe mostrar "La Pila esta vacía." y retornar null
        
        System.out.println("\n=== FIN DE LAS PRUEBAS ===");
    }
}