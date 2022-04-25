class Second {
    public static void main(String[] args) {
        // Criamos um objeto da classe Student, onde herda todos os atributos/métodos da classe Main.
        Student myObject = new Student();

        // Acessamos os atributos e métodos da classe Student e Main.
        System.out.println("Nome: " + myObject.first_name);
        System.out.println("Idade: " + myObject.age);
        System.out.println("Ano de graduação: " + myObject.graduationYear);
        myObject.study();
    }
}