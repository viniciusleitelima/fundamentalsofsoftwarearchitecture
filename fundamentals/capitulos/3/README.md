
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
  - LCOM96b = 1 − ( ∑ m(Ai) ) / ( m × a )
  - Onde: m  = número total de métodos da classe, a  = número total de atributos da classe, m(Ai) = número de métodos que acessam o atributo Ai

### Acoplamento
- **Acoplamento aferente**: É o número de conexões de entrada para um artefato do código.
- **Acoplamento eferente**: É o número de conexões de saída para um artefato do código.

### Abstração:
- É a proporção de artefatos abstratos para artefatos concretos. Pode ser calculada através da fórmula:
- A =  ∑m^a / ∑m^c

### Instabilidade:

### Três níveis de conhecimento
- **O que você sabe:** Inclui as tecnologias, os frameworks, as linguagens e ferramentas que você conhece e usa no dia-a-dia
- **O que você sabe que não sabe:** É aquilo que você sabeum pouco e ouviu falar, mas tem pouca ou nenhuma especialização.
- **O que não sabe que não sabe:** É a maior parte da pirâmide e incluis as inúmeras tecnologias, ferramentas, estruturas e linguagens que você nem sabe elas existem

### Amplitude técnica x profundidade técnica
- Para um arquiteto ter uma amplitude técnica é mais importante do profundidade, pois os arquitetos devem tomar decisões que combinem capacidades com restrições técnicas e assim ter uma grande variedade de soluções é precioso. Por isso os arquitetos devem focar em amplitude para ter uma aljava maior para suas flechas.

### Como manter a profundidade técnica sendo arquiteto
- Equilibrar entre codificação e arquitetura. Pois quando o arquiteto assume o desenvolvimento do código acaba se tornando um gargalo para a equipe.
- Existem quatro modos para um arquiteto manter sua profundidade técnica:
  - **Primeiro:** Realizar provas de conceitos (POCs)
  - **Segundo:** Resolver histórias com déficits técnicos
  - **Terceiro:** Trabalhar em correção de erros
  - **Quarto:** Fazer revisões de código com frequência












