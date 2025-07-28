package JavaTasks.Introduction;

public class ConditionalStructure {
    public static void main (String[] args){
        int age = 18;
        int age2 = 17;
        boolean isAuthorizedToBuyDrinksTrue = age >= 18;
        boolean isAuthorizedToBuyDrinksFalse = age2 < 18;


        if(isAuthorizedToBuyDrinksTrue){
            System.out.println( "ConditionalStructure If - " + "Compra de Bebida autorizada pois o User tem a seguinte Idade: " + age);
        }

        if (isAuthorizedToBuyDrinksTrue) {
            System.out.println("ConditionalStructure else - Exemplo de else ");
        } else {// o ! inverteu o valor Boolean para False, portanto o print não vai para o console
            System.out.println( "ConditionalStructure if - " + "Compra de Bebida não autorizada pois o User tem a seguinte Idade: " + age2);
        }

        if(isAuthorizedToBuyDrinksFalse){// o ! inverteu o valor Boolean para False, portanto o print não vai para o console
            System.out.println( "ConditionalStructure if - " + "Compra de Bebida não autorizada pois o User tem a seguinte Idade: " + age2);
        }


    }
}
