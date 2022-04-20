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