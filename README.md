# Test-Training
Automated testing training using Java programming language

O treinamento consistiu na implementação de 3 exercícios com testes automatizados!

## Continuous Integration
![Java CI with Maven](https://github.com/jonathanmdr/Test-Training/workflows/Java%20CI%20with%20Maven/badge.svg)

## Exercícios

### Exercício 1 - Múltiplos de 3 ou 5

Dado todos os números naturais abaixo de 10; <br>
Se selecionarmos àqueles que sejam múltiplos de 3 ou 5 temos: 3, 5, 6 e 9. <br>
Se somarmos todos esses valores, teremos o resultado = 23

Desenvolva um sistema que responda às seguintes dúvidas:

Qual é o valor da soma de todos os números múltiplos de 3 ou 5 de números naturais abaixo de 1000? <br>
Qual é o valor da soma de todos os números múltiplos de 3 e 5 de números naturais abaixo de 1000? <br>
Qual é o valor da soma de todos os números múltiplos de (3 ou 5) e 7 de números naturais abaixo de 1000? <br>

#### Definition of Done <br>
Uma solução completamente testada, de preferência com testes para cada passo essencial para a checagem do resultado.

O mínimo esperado é que tenham 3 testes, uma para cada pergunta, e outros testes validando os algoritmos usados para se chegar na solução final.

### Exercício 2 - Números felizes 

Os números felizes são definidos pelo seguinte procedimento: 

Começando com qualquer número inteiro positivo, o número é substituído pela soma dos quadrados dos seus dígitos. 
Repete-se esse processo até que o número seja igual a 1. 

Tomamos o 7, que é um número feliz: <br>
● 7² = 49 <br>
● 4² + 9² = 97 <br> 
● 9² + 7² = 130 <br>
● 1² + 3² + 0² = 10 <br>
● 1² + 0² = 1 <br>

Um número não é feliz quando, em seu processo de cálculo em algum momento ele entra em loop, ou seja, ele passe por um número que ele já passou anteriormente (não é possível determinar um número específico que ele sempre irá passar).

Faça um programa que, dado um número natural qualquer, ele determine se é um número feliz. 

#### Definition of Done <br>
Um trecho de código onde é possível invocar um método checando se o número é feliz ou não, e o sistema consiga responder.

A solução final deve ser quebrada em diversas etapas, passos que precisam ser executados para se chegar na solução final, e cada uma dessas etapas devem estar cobertas com testes automatizados.
Sugestão: Fazer seguindo TDD.


### Exercício 3 - Palavras em números

Neste problema, dado uma palavra composta somente por letras [a-zA-Z], cada letra possui um valor específico, ‘a’ vale 1, ‘b’ vale 2 e assim por diante, até a letra ‘z’ que vale 26. Do mesmo modo ‘A’ vale 27, ‘B’ vale 28, até a letra ‘Z’ que vale 52.

O valor da palavra será a soma total dos valores de todas as letras da palavra.

Você precisa definir se cada palavra em um conjunto de palavras é: <br>
Prima ou não; <br>
Feliz ou não; <br>
Múltipla de 3 ou 5; <br>

Qualquer caracter na palavra que não seja uma letra deve ser desconsiderado.

#### Definition of Done
Um sistema que, quando executado, transforme uma palavra em um número, seguindo a lógica acima, e responda as três questões: se é prima, feliz e múltipla de 3 ou 5.

Não há a necessidade de ter interação com o usuário para requisitar a palavra.

É esperado que as soluções anteriores sejam reusadas, e cada novo componente criado seja coberto com testes automatizados.

### Observações

Não foi desenvolvida uma classe Main para execução dos exercícios, todas as implementações descritas nos exercícios foram cobertas por testes automatizados.
