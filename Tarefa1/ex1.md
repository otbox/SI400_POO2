# Informações da Linguagem

## Tipos nativos da linguagem:

- byte: armazena um número inteiro de 8 bits
- short: armazena um número inteiro de 16 bits
- int: armazena um número inteiro de 32 bits
- long: armazena um número inteiro de 64 bits
- float: armazena um ponto fluante de 32 bits
- double: armazena um ponto fluante de 64 bits
- char: armazena um caracterer unicode de 16 bits
- boolean: armazena valor de verdadeiro ou falso;

## Classe `String` em Java

A classe **`String`** em Java representa uma sequência de caracteres.  
Ela é **imutável**, ou seja, uma vez criada, não pode ser alterada.  
Qualquer operação que pareça modificar uma `String` na verdade cria uma nova instância.

---

### Especificidades

- Pertence ao pacote `java.lang`.
- É uma **classe final**, não pode ser estendida.
- Armazena caracteres em um array interno.
- Imutabilidade garante **segurança** e **thread-safety**.
- Objetos podem ser criados de duas formas:
  - **Literal**: `String s = "texto";`
  - **Construtor**: `String s = new String("texto");`

---

### Principais Métodos

#### Informações

- `length()` → retorna o tamanho da string.
- `charAt(int index)` → retorna o caractere no índice.
- `isEmpty()` → verifica se está vazia.

#### Comparação

- `equals(Object obj)` → compara conteúdo.
- `equalsIgnoreCase(String str)` → compara ignorando maiúsculas/minúsculas.
- `compareTo(String str)` → comparação lexicográfica.
- `contains(CharSequence s)` → verifica se contém uma sequência.

#### Manipulação

- `concat(String str)` → concatena.
- `substring(int begin, int end)` → retorna parte da string.
- `replace(char old, char new)` → substitui caracteres.
- `replaceAll(String regex, String replacement)` → substitui usando regex.
- `toLowerCase()` / `toUpperCase()` → altera para minúsculas/maiúsculas.
- `trim()` → remove espaços no início e fim.
- `split(String regex)` → divide em array de strings.

#### Busca

- `indexOf(String str)` → retorna o índice da primeira ocorrência.
- `lastIndexOf(String str)` → retorna o índice da última ocorrência.
- `startsWith(String prefix)` / `endsWith(String suffix)` → verifica início/fim.

---

### Exemplo

````java
String nome = "Java";
System.out.println(nome.length());      // 4
System.out.println(nome.charAt(1));     // 'a'
System.out.println(nome.toUpperCase()); // "JAVA"
System.out.println(nome.contains("va")); // true
````
## Classes Empacotadoras (Wrapper Classes) em Java

As **classes empacotadoras** permitem tratar tipos primitivos como objetos.
Estão no pacote `java.lang` e fornecem métodos utilitários.
São **imutáveis** e finais.

---

### Principais Classes
- `Byte` → empacota `byte`
- `Short` → empacota `short`
- `Integer` → empacota `int`
- `Long` → empacota `long`
- `Float` → empacota `float`
- `Double` → empacota `double`
- `Character` → empacota `char`
- `Boolean` → empacota `boolean`

---

### Especificidades
- Permitem conversão entre **tipos primitivos** e **objetos**.
- Usadas em **coleções genéricas** (`ArrayList<Integer>`, por exemplo).
- Suportam **autoboxing** (conversão automática primitivo → objeto) e **unboxing** (objeto → primitivo).

---

### Principais Métodos
- Conversão para primitivo:
  `intValue()`, `doubleValue()`, etc.
- Conversão para `String`:
  `toString()`.
- Conversão de `String` para número:
  `parseInt(String s)`, `parseDouble(String s)`, etc.
- Constantes úteis:
  `Integer.MAX_VALUE`, `Integer.MIN_VALUE`.

---

### Exemplo
```java
int x = 10;
Integer y = x; // autoboxing
int z = y;     // unboxing

String s = "123";
int n = Integer.parseInt(s); // converte String para int
```
## Operadores em Java

---

### 1. Operadores Matemáticos
Usados para cálculos aritméticos.

| Operador | Descrição       | Exemplo (`a=10`, `b=3`) | Resultado |
|----------|-----------------|--------------------------|-----------|
| `+`      | Soma            | `a + b`                 | 13        |
| `-`      | Subtração       | `a - b`                 | 7         |
| `*`      | Multiplicação   | `a * b`                 | 30        |
| `/`      | Divisão inteira | `a / b`                 | 3         |
| `%`      | Resto (módulo)  | `a % b`                 | 1         |

---

### 2. Operadores Lógicos
Usados em expressões booleanas.

| Operador | Descrição | Exemplo (`x=true`, `y=false`) | Resultado |
|----------|-----------|-------------------------------|-----------|
| `&&`     | E (AND)   | `x && y`                     | false     |
| `||`     | OU (OR)   | `x || y`                     | true      |
| `!`      | NÃO (NOT) | `!x`                         | false     |

---

### 3. Operadores Condicionais
Incluem relacionais e ternário.

#### Relacionais
| Operador | Descrição             | Exemplo (`a=10`, `b=3`) | Resultado |
|----------|-----------------------|--------------------------|-----------|
| `==`     | Igual a               | `a == b`                | false     |
| `!=`     | Diferente de          | `a != b`                | true      |
| `>`      | Maior que             | `a > b`                 | true      |
| `<`      | Menor que             | `a < b`                 | false     |
| `>=`     | Maior ou igual        | `a >= b`                | true      |
| `<=`     | Menor ou igual        | `a <= b`                | false     |

#### Ternário
`condição ? valorSeVerdadeiro : valorSeFalso`
Exemplo:
```java
int idade = 18;
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
// "Maior de idade"
```
4. Precedência de Operadores (do mais alto → mais baixo)

    Pós-fixados: expr++, expr--

    Pré-fixados e unários: ++expr, --expr, +, -, !

    Multiplicativos: *, /, %

    Aditivos: +, -

    Relacionais: <, >, <=, >=

    Igualdade: ==, !=

    Lógicos AND: &&

    Lógicos OR: ||

    Ternário: ? :

    Atribuição: =, +=, -=, *=, /=, etc.


## Estruturas de Controle em Java

As **estruturas de controle** definem o fluxo de execução do programa.

---

### 1. Estruturas Condicionais
#### `if / else`
Executa blocos de código conforme condição booleana.
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```
if / else if / else

Permite múltiplas condições.
```java
if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 6) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```
switch

Usado quando há várias opções para a mesma variável.
```java
int dia = 3;
switch (dia) {
    case 1: System.out.println("Domingo"); break;
    case 2: System.out.println("Segunda"); break;
    case 3: System.out.println("Terça"); break;
    default: System.out.println("Outro dia");
}
```
2. Estruturas de Repetição
while

Repete enquanto a condição for verdadeira.
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
do while

Executa pelo menos uma vez, depois testa a condição.
``` java
int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 5);
```
for
```java
Mais usado em repetições com contador.

for (int k = 0; k < 5; k++) {
    System.out.println(k);
}
```
for-each
Percorre elementos de arrays ou coleções.
```java
int[] nums = {1, 2, 3};
for (int n : nums) {
    System.out.println(n);
}
```
3. Controle de Fluxo dentro de Loops

    break → encerra o loop.

    continue → pula para a próxima iteração.

Exemplo:
```java
for (int x = 0; x < 5; x++) {
    if (x == 2) continue; // pula o 2
    if (x == 4) break;    // interrompe no 4
    System.out.println(x);
}
```