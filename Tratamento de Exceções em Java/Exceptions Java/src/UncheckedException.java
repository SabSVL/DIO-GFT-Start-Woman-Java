import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {


        boolean continueLopping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado =  dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLopping = false;
            }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada invalida, informe um numero inteiro!" + e.getMessage());
                // e.printStackTrace();
            }catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,"Impossivel dividir um numero por 0!" + e.getMessage());
                // e.printStackTrace();
            }finally {
                System.out.println("Chegou no finally");
            }

        }while (continueLopping);

        System.out.println("O codigo continua...");
    }
    public  static int dividir(int a, int b){return a/b;}
}
