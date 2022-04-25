public class Main {
    public static void main(String[] args) {
        // Criamos um objeto(instância) da classe Person
        Person myObject = new Person();
        // Utilizamos o método setName() e passamos "Douglas" como argumento, dessa forma definimos o atributo/variável name como sendo Douglas.
        myObject.setName("Douglas");
        // Utilizando o método getName() para acessar o valor da variável/atributo name.
        System.out.println(myObject.getName());
    }
}