
## 📚 Resumo por capítulo

---

### 🟦 Capítulo 3 – Modularidade

## 📌 **Ideia central**  
### Explicar o que é um módulo
- Módulo é um agrupamento lógico de código afim, que pode ser agrupado em classes numa linguagem orientada a objetos, como *package* em Java.
- Se vários pacotes estão bem acoplados, reutilizar o código de um deles não sendo necessário.

## 🧠 **Pontos-chave**
### Coesão
- É até que ponto as partes de um módulo devem ser contidas no mesmo módulo. Dividir essas partes resulta em mais acoplamento.
- É divido nos seguintes tipos, da ordem do melhor para o pior:
  - *Coesão funcional*: Toda parte do módulo está relacionado com outra, e o módulo contém tudo que é essencial para funcionar
  - *Coesão sequencial*: Dois módulos interagem, em que um produz dados que se tornam a entrada do outro
  - *Coesão comunicacional*: Dois módulos formam uma cadeia de comunicação, em que cada um opera nas informaç~eos e/ou contribui com alguma saída.
  - *Coesão procedural*: Dois módulos devem executar o código em determinada ordem.
  - *Coesão temporal*: Os módulos se relacionam com base em dependências do tempo.
  - *Coesão lógica*: Os dados nos módulos são relacionados logicamente, mas não funcionalmente. Por exemplo o pacote *StringUtils* são um grupo de métodos estáticos que operam na classe *String*, mas não são relacionados.
  - *Coesão coincidental*: Os elementos em um módulo não estão relacionados, a não ser no mesmo arquivo de origem.
- Métrica **LCOM96b** (Falta de Coesão em Métodos): Coesão estrutural de um módulo seguindo a fórmula:
  - *LCOM96b = 1 − ( ∑ m(Ai) ) / ( m × a )*
  - Onde: m  = número total de métodos da classe, a  = número total de atributos da classe, m(Ai) = número de métodos que acessam o atributo Ai

### Acoplamento
- **Acoplamento aferente**: É o número de conexões de entrada para um artefato do código.
- **Acoplamento eferente**: É o número de conexões de saída para um artefato do código.

### Abstração:
- É a proporção de artefatos abstratos para artefatos concretos. Pode ser calculada através da fórmula:
- *A =  ∑m^a / ∑m^c*
- Onde: m^a = o número de elementos abstratos como interfaces ou classes abstratas, m^c = o número de elementos concretos

### Instabilidade:
- Determina a volatilidade de uma base de código. Altos graus de instabilidade indica que quando é alterado algo gera um impacto grande por conta do alto acomplamento. Seguindo a fórmula:
- *I = C^e / C^e + C^a*
- Onde: *C^e* é o número do acomplamento *eferente*, e *C^a* é o número do acomplamento *aferente*

### Distância da Sequência Principal:
- É uma métrica para definir o quão equilibrado é a classe. Seguindo a fórmula:
- *D = |A + I -1|*
- Onde: *A* é a abstração e *I* é a instabilidade













