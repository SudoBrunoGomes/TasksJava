package JavaTasks.Introduction;

//Organização de categorias
//idade < 15         --> categoria infantil
//idade > 15 && < 18 --> categoria Juvenil
//idade >= 18        --> categoria Adulto


public class ConditionalStructureExercise {
    public static void main(String[] args) {
        int age = 16;
        String categoria = " ";

        if(age < 15){
            categoria = "Categoria ---> Infantil";
        } else if (age > 15 && age < 18) {
            categoria = "Categoria ---> Juvenil";
        }else {
            categoria = "Categoria ---> Adulto";
        }
        System.out.println(categoria);


    }
}
