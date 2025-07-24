package JavaTasks.Introduction;

/*Task "Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * eu <nome>, residente do seguinte endereço: <endereço>, confirmo que recebi o salário de <salario>, na data <data>*/

public class PrimitiveTypeExercise {
    public static void main(String[] args){
        String name = "João";
        String address = "São Paulo,Rua 2 Nº85";
        double wage = 3591.53;
        String dateReceive = "20/05/2025";
        String message = ("eu "+ name + ", residente do seguinte endereço: " + address + " Confirmo que recebi o salário de " + wage + " Reais , na seguinte data " + dateReceive + ".");

        System.out.println(message);
    }
}

