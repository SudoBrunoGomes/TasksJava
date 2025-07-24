package JavaTasks.Introduction;

public class Operator {
    public static void main(String[] args) {
        //Operator arithmetic basics + - / *
        int number = 10;
        int number2 = 20;
        double number3 = 50.69;
        double calculation = number + number2 * number3;
        //cuidado com o + em uma "String", pois ele pode atribuir uma concatenação das variáveis e não efetua a soma
        String calculationResult = "Operator Basic - valor calculado = " + calculation;

        System.out.println(calculationResult);

        //Operator %
        int restOfTheDivision = 20 % 2;
        System.out.println("Operator % (Resto da divisão) - Resto da divisão: " + restOfTheDivision);

        //Operator Relational < > <= >= == != (Operador "==" de comparação, no caso do "=" ele tem a função de atribuição)
        boolean isTenGreaterThanNine = 10 > 9;
        boolean isTenLessThanNine = 10 < 9;
        boolean isTenLessThanOrEqualToNine = 10 <= 9;
        boolean isTenGreaterThanOrEqualToNine = 10 >= 9;
        boolean isTenEqualToNine = 10 == 9;
        boolean isTenNotEqualToNine = 10 != 9;
        String resultBoolean = ("Operator Boolean - ResultBoolean: " + isTenGreaterThanNine + " " + isTenLessThanNine + " " + isTenLessThanOrEqualToNine + " " + isTenGreaterThanOrEqualToNine + " " + isTenEqualToNine + " " + isTenNotEqualToNine);

        System.out.println(resultBoolean);

        //Operator Logic && (AND) || (OR) ! (negative)
        int age = 30;
        float wage = 3500;

        boolean isInTheLawGreaterThirtyAge = age <= 30 && wage >= 4612;
        boolean isInTheLawLessThirtyAge = age < 30 && wage >= 3381;
        System.out.println("Operator Logic && - isInTheLawLessThirtyAge: " + isInTheLawGreaterThirtyAge);
        System.out.println("Operator Logic && - isInTheLawLessThirtyAge: " + isInTheLawLessThirtyAge);
        //Operator Logic  || (OR)
        double valueDesktop = 4531.66;

        double valueAccountInter = 500;
        double valueAccountNubank = 5000;
        boolean resultDesktop = valueAccountInter > valueDesktop || valueAccountNubank > valueDesktop;

        //Operator Logic ! (negative)
        double budget = valueAccountInter + valueAccountNubank;
        boolean isValueBudgetGreaterToValueDesktopTrue = budget > valueDesktop;
        boolean isValueBudgetGreaterToValueDesktopFalse = budget == valueDesktop;


        if (isValueBudgetGreaterToValueDesktopTrue){
            System.out.println("voce tem saldo suficiente para comprar o Desktop");

        };

        if (!isValueBudgetGreaterToValueDesktopFalse){
            System.out.println("voce não tem saldo suficiente para comprar o Desktop");

        };


        // Operator assignment = += -= /= %=

        double wage2 = 3500;
        wage2 += 100;  //é o mesmo que "wage2= wage2 + 100;"
        wage2 -= 100;
        wage2 /= 5;

        wage2++;
        /*Operator assignment ++ -- acrescenta ou subtrai de 1 em 1. Há uma diferença quando está após a variável ou antes da variável.
         Quando estiver nesse formato wage2++, significa dizer que primeiro o Java vai executar o comando, como por exemplo imprimir com System.out.println, e depois vai acrescentar o valor na variável.
         No caso de ++wage2, ele primeiro vai fazer o acréscimo e depois imprimir o valor da variável na tela.*/

        String resultWage2 = "ResultWage2: " + wage2;
        System.out.println("Operator assignment - " + resultWage2);


    }
}
