# EDA - Lista 02

## Questão 16

A questão utiliza a estrutura ST para fazer um filtro de filmes.

*Alguns códigos de demostração:*
- O primeiro código a seguir mostra o método que retorna o maior prefixo encontrado no titulo de filme passado como parametro
 
```java
//		Item 1
		System.out.println(sst.longestPreffixOf("A bela e a fera 02"));
```
- E essa é a saida:
  
 ```
 a bela e a fera
 ```

 - O segundo código mostra o método que retorna todos os titulos com o prefixo passado como parametro

```java
//		Item 2
		for(String title : sst.titlesWithPreffix("As")) {
			System.out.println(title);
		}
```

- E essa é a saida:
  
 ```
as cr?nicas de narnia
as trancas do rei careca
 ```
 Note que o primero titulo veio com um '?', pois isso se dá a conversão dos caracteres da tabela ASCII para o nosso alfabeto (a, b, c,...z ? 0, 1, 2, ..., 9)