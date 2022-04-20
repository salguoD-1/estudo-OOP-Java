# Programação Orientada a Objetos(POO)

Na programação orientada a objetos nós trabalhamos com os principais conceitos:

* Classes
    * Uma classe é basicamente um template para objetos.

* Objetos
    * Já um objeto é uma instância(molde) da classe.

![Representação de uma classe e objeto](imagens/OOP.PNG)

No exemplo acima temos a classe chamada Fruta e ao lado temos os objetos sendo: Maça, Banana e Melão.

Quando um objeto é criado ele herda todos as variáveis e métodos(funções) da classe.

Além disso podemos dizer que uma classe é uma espécie de objeto construtor para a criação de objetos.

## Criando uma classe em Java

```java
public class Main {
    int x = 5;
}
```

No exemplo acima temos uma classe chamada Main(classes são declaras com a primeira letra maiúscula.) e essa classe possui uma variável x do tipo int. Além disso, o nome do arquivo deve ser igual ao nome da classe na linguagem Java.


## Criando um Objeto

Em java, um objeto é criado a partir de uma classe. No exemplo acima criamos a classe Main, iremos fazer uso dessa classe para criar um objeto, vejamos:

```java
public class Main {
    int x = 5;

    public static void main(String[] args) {

        Main myObject = new Main();
        System.out.println(myObject.x);
    }
}
```

Nota: Fazemos uso da palavra-chave new para criar objetos de uma classe.

No exemplo acima criamos um objeto chamado myObject, esse objeto é uma instância(molde) da classe Main, em seguida fazemos uso desse nosso objeto myObject para acessar e exibir o valor da variável x, que nesse caso é 5.

Em resumo, esse nosso objeto(myObject) herda todas as variáveis e métodos da classe Main.

## Criando múltiplos objetos de uma única classe

É possivel criar vários objetos diferentes de uma mesma classe, vamos fazer uso do exemplo acima:

```java
public class Main {
    int x = 5;

    public static void main(String[] args) {

        Main myObject1 = new Main();
        Main myObject2 = new Main();
        System.out.println(myObject1.x);
        System.out.println(myObject2.x);
    }
}
```

Note que criamos dois objetos, um chamado myObject1 e o outro chamado myObject2, ambos são instâncias da classe Main, portanto ambos tem acesso a variável x da classe Main.

## Atributos de Classes

Anteriormente falamos sobre a variável x que faz parte da classe Main

```java
public class Main {
    // Atributo da classe Main
    int x = 5;
}
```

Essa variável é basicamente chamada de Atributo da classe Main, em resumo atributos são variáveis que pertecem a classe.


## Acessando os atributos da classe com o operador dot(.)

É possivel acessar os atributos da classe ao criarmos um objeto da classe e em seguida utilizar o operador dot(.) para acessar os valores.

```java
public class Main {
    int x = 5;

    public static void main(String[] args) {

        Main myObject = new Main();
        System.out.println(myObject.x);
    }
}
```

No exemplo acima criamos um objeto chamado myObject que acessa o atributo x da classe Main, note que fazemos uso do operador dot(myObject.x).

Além disso é possivel modificar o valor dos atributos:

```java
public class Main {
    int x;

    public static void main(String[] args) {

        Main myObject = new Main();
        myObject.x = 100;
        // Imprime 100 na tela.
        System.out.println(myObject.x);
    }
}
```

Note que atribuimos o valor 100 para o nosso atributo x. É possivel sobrescrever os valores dos atributos.

Podemos ter quantos atributos quisermos em uma classe.

```java
public class Main {
    String firstName = "Douglas";
    String lastName = "Jesus";
    int age = 22;

    public static void main(String[] args) {

        Main myObject = new Main();
        System.out.println("Name: " + myObject.firstName + " " + myObject.lastName);
        System.out.println("Age: " + myObject.age);
    }
}
```

Note que temos 3 atributos, sendo duas strings e um inteiro e em seguida, criamos o objeto myObject que é uma instância da classe Main e acessamos os atributos através do nosso objeto.

## Métodos de classes

Metodos são declarados dentro de uma classes e são utilizados para realizar certas tarefas.

```java
public class Main {
    static void myMethod() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        // Imprime Hello, world! na tela.
        myMethod();
    }
}
```

No exemplo acima criamos um método chamado myMethod() que está dentro da classe Main. Ao realizarmos a chamada do método ele basicamente irá imprime Hello, world! na tela. 

## Static vs Non-Static

No exemplo acima fizemos uso da palavra-chave static no método myMethod(), ela basicamente permite que acessemos o método sem precisar criar um objeto da classe, o que é diferente da palavra-chave public que necessita de um objeto.

```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
```

Note que no exemplo acima, para acessarmos o método myPublicMethod() foi necessário criar um objeto(instância/molde) da classe Main(contém o método myPublicMethod()) para poder acessar o método. Essa é a grande diferença entre as palavras-chaves public e static.


## Método de acesso com um objeto

```java
public class Main {
    public void fullThrottle() {
        System.out.println("O carro está indo o mais rápido possível!")
    }

    public void speed(int maxSpeed) {
        System.out.prinln("A velocidade máxima é: " + maxSpeed);
    }

    public static void main(String[] args) {
        // Criamos um objeto chamado myCar para acessar os métodos da classe Main.
        Main myCar = new Main();
        // Acessando os métodos e passando argumentos.
        myCar.fullThrottle();
        myCar.maxSpeed(200);
    }
}
```

O código acima basicamente possui dois métodos dentro da classe Main, fazemos acesso aos métodos através da criação de um objeto(myCar) e acessamos os seus métodos/atributos utilizando a notação dot(.). O resultado é basicamente esse:

```
O carro está indo o mais rápido possível!
A velocidade máxima é: 200
```

## Constructors(Construtores)

Um construtor em java é basicamente um método especial que é utilizado para inicializar objetos. O construtor é chamado quando o objeto da classe é criado. Além disso, ele pode ser usado para definir valores iniciais para atributos de objetos.

```java
public class Main {
    // Criamos um atributo da classe Main.
    int x;

    // Criamos um construtor de classe para a classe Main.
    public Main() {
        // Definimos o valor inicial para o atributo da classe Main.
        x = 5;
    }

    public static void main(String[] args) {
        // Criamos um objeto da classe Main, isso resultará na chamada do construtor.
        Main myObject = new Main();
        // Exibe 5 na tela.
        System.out.println(myObject.x);
    }
}

```

Ou seja, no exemplo acima o construtor irá inicializar o atributo x da classe Main, que terá valor 5. O construtor é sempre chamado quando criamos um objeto.

NOTA: O nome do construtor deve ser igual ao nome da Classe, nesse caso ambos são Main. Além disso, o construtor não pode ter um tipo de retorno de tipo, ex: void.

## Utilizando parâmetros nos construtores

Os construtores podem conter parâmetros, que nesse caso são utilizados para inicializar atributos.

```java
public class Main {
    int x;

    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        // Passamos 5 como argumento para o construtor.
        Main myObject = new Main(5);
        // Exibe 5 na tela.
        System.out.println(myObject.x);
    }
}

```

Podemos ter quantos parâmetros quisermos, vejamos:

```java
public class Main {
    // Atributos
    int modelYear;
    String modelName;

    // Construtor
    public Main(int year, String name) {
        // Inicializamos nossos atributos com os parâmetros do construtor Main.
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        // Criamos um objeto e logo em seguida, chamamos o nosso construtor e passamos dois argumentos.
        Main myCar = new Main(1969, 'Mustang');
        // Imprime 1969 Mustang na tela.
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

```