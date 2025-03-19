
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância da HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Teste 1: Adicionar elementos
        map.add("um", 1);
        map.add("dois", 2);
        map.add("três", 3);

        // Teste 2: Recuperar elementos
        System.out.println("Valor associado à chave 'um': " + map.get("um")); // Deve imprimir 1
        System.out.println("Valor associado à chave 'dois': " + map.get("dois")); // Deve imprimir 2
        System.out.println("Valor associado à chave 'três': " + map.get("três")); // Deve imprimir 3

        // Teste 3: Atualizar um valor existente
        map.add("dois", 22); // Atualiza o valor associado à chave "dois"
        System.out.println("Valor associado à chave 'dois' após atualização: " + map.get("dois")); // Deve imprimir 22

        // Teste 4: Tentar recuperar uma chave que não existe
        System.out.println("Valor associado à chave 'quatro': " + map.get("quatro")); // Deve imprimir null

        // Teste 5: Remover um elemento
        System.out.println("Valor removido para a chave 'um': " + map.remove("um")); // Deve imprimir 1
        System.out.println("Valor associado à chave 'um' após remoção: " + map.get("um")); // Deve imprimir null

        // Teste 6: Verificar o comportamento após a remoção
        System.out.println("Valor associado à chave 'dois' após remoção de 'um': " + map.get("dois")); // Deve imprimir 22

        // Teste 7: Adicionar mais elementos para testar o redimensionamento (grow)
        for (int i = 0; i < 100; i++) {
            map.add("chave" + i, i);
        }
        System.out.println("Valor associado à chave 'chave99': " + map.get("chave99")); // Deve imprimir 99

        // Teste 8: Verificar o comportamento após o redimensionamento
        System.out.println("Valor associado à chave 'dois' após redimensionamento: " + map.get("dois")); // Deve imprimir 22
    }
}
