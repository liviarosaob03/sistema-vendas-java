package View;

import static javax.swing.JOptionPane.*;

public class MenuPrincipal {
    public void menu() {
        String[] item = {"Vendedor", "Venda", "Finalizar"};
        String opcao;

        do {
            opcao = (String) showInputDialog(null,
                    "Selecione uma opção",
                    "Menu Principal",
                    INFORMATION_MESSAGE,
                    null,
                    item,
                    item[0]);

            switch (opcao.toLowerCase()) {
                case "vendedor" -> new MenuVendedor().menu();
                case "venda" -> new MenuVenda().menu();
            }

            //enquanto opção for diferente de Finalizar:
        } while (!opcao.toLowerCase().equals("finalizar"));
    }
}
