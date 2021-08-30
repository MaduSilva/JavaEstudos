package inicio.estudo.java;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos são os tipos que vão guardar em memória um valor simples
        // int, double, float, char, byte, short, long, boolean
        int age = 18;
        double salaryDouble = 15000.0;
        float salaryFloat = 15000.0F;
        byte ageByte = 18;
        short ageShort = 18;
        boolean underAge = false;
        char gender = 'W';

        // string - tipo de referencia, aspas duplas
        String name = "Maria Eduarda";
        var sobrenome = "Silva";

        System.out.println("Nome: " + name);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + age);
        System.out.println("Salário: " + salaryFloat);
        System.out.println("Menor de idade? " + underAge);
        System.out.println("Gênero: " + gender);
    }
}
