# Resoluções Teste

###### Fibonacci

*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código*

```javascript     
        var sequencia = [0, 1], achou = false;
        
        var numb = parseFloat(prompt("Informe o número a ser analisado: "));
        for (let i = 0; i <= 30 ; i++) {
            sequencia.push(sequencia[sequencia.length -1] + sequencia[sequencia.length - 2])
            if (sequencia[sequencia.length -1] + sequencia[sequencia.length - 2] == numb){
                achou = true;
            } 
        }
        if (achou == true){
            console.log("O número inserido faz parte da sequência!");
        }else{
            console.log("O número inserido não faz parte da sequência!");
        }
        console.log(sequencia);
```

###### Análise de Dados JSON

*Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;*

```javascript    
        var data = [{"dia": 1,"valor": 22174.1664},
        {"dia": 2,"valor": 24537.6698},
        {"dia": 3,"valor": 26139.6134},
        {"dia": 4,"valor": 0.0},
        {"dia": 5,"valor": 0.0},
        {"dia": 6,"valor": 26742.6612},
        {"dia": 7,"valor": 0.0},
        {"dia": 8,"valor": 42889.2258},
        {"dia": 9,"valor": 46251.174},
        {"dia": 10,"valor": 11191.4722},
        {"dia": 11,"valor": 0.0},
        {"dia": 12,"valor": 0.0},
        {"dia": 13,"valor": 3847.4823},
        {"dia": 14,"valor": 373.7838},
        {"dia": 15,"valor": 2659.7563},
        {"dia": 16,"valor": 48924.2448},
        {"dia": 17,"valor": 18419.2614},
        {"dia": 18,"valor": 0.0},
        {"dia": 19,"valor": 0.0},
        {"dia": 20,"valor": 35240.1826},
        {"dia": 21,"valor": 43829.1667},
        {"dia": 22,"valor": 18235.6852},
        {"dia": 23,"valor": 4355.0662},
        {"dia": 24,"valor": 13327.1025},
        {"dia": 25, "valor": 0.0},
        {"dia": 26,"valor": 0.0},
        {"dia": 27,"valor": 25681.8318},
        {"dia": 28,"valor": 1718.1221},
        {"dia": 29,"valor": 13220.495},
        {"dia": 30,"valor": 8414.61}
    ]
        var menor = 9999, maior = -9999, media = 0, qtdV = 0.0, value = 0;
        data.forEach(x => {
            if(x.valor < menor){
                menor = x.valor;
            }
            if(x.valor > maior){
                maior = x.valor;
            }
            if (x.valor > 0.0) {
                qtdV++;
                value = x.valor + value;
            }
        });

        
        media = value / qtdV;
        console.log("O menor valor é: "+menor);
        console.log("O maior valor é: "+maior);
        console.log("O valor da média é de: "+media.toFixed(3))
```

###### Faturamento Mensal

```javascript 
const sp = 67836.43;
const rj = 36678.66;
const mg = 29229.88;
const es = 27165.48;
const others = 19849.53;
const soma = sp + rj + mg + es + others;

console.log(`A soma dos valores é de R$${soma.toFixed(2)}`);

console.log(`Representação percentual de cada estado: \nSP: ${((sp / soma) * 100).toFixed(2)}%`);
console.log(`RJ: ${((rj / soma) * 100).toFixed(2)}%`);
console.log(`MG: ${((mg / soma) * 100).toFixed(2)}%`);
console.log(`ES: ${((es / soma) * 100).toFixed(2)}%`);


```

###### Inversão de Strings

*Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;*

```Java
import java.util.Scanner;

public class Palavra{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String str, contrario = "", semEspaco = "";
        System.out.println("Informe a string: ");
        str = entrada.nextLine();
        entrada.close();
        semEspaco = str.replaceAll(" ","");
        // semEspaco é uma string que receberá a o que foi armazenado em str sem os espaços, usando o método replaceAll
        for(int i = (semEspaco.length() -1 ) ; i >= 0 ; i-- ){
            // Usa-se o método charAt para percorrer a String, com o for acima, percorremos o vetor de trás para frente e vamos imprimindo as letras percorridas
            contrario = contrario + semEspaco.charAt(i);
        }
        System.out.println(contrario);

    }
}

```

