abstract class Main {
    public String first_name = "Douglas";
    public int age = 22;
    // Método abstrato
    public abstract void study();
}

    // Subclasse herdada da classe Main
    class Student extends Main {
        public int graduationYear = 2026;
        // O "corpo" do método abstrato é fornecido aqui.
        public void study() {
            System.out.println("Estudando o dia todo!");
        }
}