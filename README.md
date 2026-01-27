# 📘 Fundamentos de Arquitetura de Software
> Estudo estruturado baseado no livro  
> **Fundamentos de Arquitetura de Software**  
> *Mark Richards & Neal Ford*

---

## 🎯 Objetivo deste repositório

Este diretório concentra o estudo **conceitual** de arquitetura de software, com foco em:

- Pensamento arquitetural
- Características arquiteturais (–ilities)
- Modularidade
- Trade-offs
- Estilos arquiteturais

O objetivo é **criar uma ponte clara entre teoria e prática**, que será aplicada nos módulos arquiteturais do repositório (ex: `layered/`).

---

## 🧠 Princípios centrais do livro

- Arquitetura é sobre **decisões difíceis de mudar**
- Não existe arquitetura perfeita, apenas **trade-offs conscientes**
- Contexto é mais importante do que tendência
- Arquitetura envolve **tecnologia, pessoas e processos**

---

## 📚 Resumo por capítulo

---

### 🟦 Capítulo 1 – O que é Arquitetura de Software

📌 **Ideia central**  
Arquitetura define a **estrutura do sistema** e as **decisões críticas** que afetam sua evolução.

🧠 **Pontos-chave**
- Arquitetura ≠ código
- Nem toda decisão é arquitetural
- Arquitetura molda manutenibilidade e evolução

⚖️ **Trade-offs**
- Decidir cedo traz estabilidade
- Decidir errado gera alto custo de mudança

🔗 **Conexão prática**
- Justifica a adoção inicial de arquiteturas simples, como *Layered*

---

### 🟦 Capítulo 2 – Pensamento Arquitetural

📌 **Ideia central**  
Arquitetos precisam pensar no **todo**, não apenas em requisitos funcionais.

🧠 **Pontos-chave**
- Avaliação de impactos sistêmicos
- Comunicação é parte da arquitetura
- Arquitetura é tomada de decisão contínua

🛠 **Responsabilidades do arquiteto**
- Definir padrões
- Avaliar soluções
- Guiar times técnicos

🔗 **Conexão prática**
- Uso de ADRs para registrar decisões neste repositório

---

### 🟦 Capítulo 3 – Modularidade

📌 **Ideia central**  
Modularidade reduz complexidade e melhora manutenibilidade.

🧠 **Conceitos fundamentais**
- Acoplamento
- Coesão
- Separação de responsabilidades

⚖️ **Trade-offs**
- Modularização excessiva aumenta overhead
- Modularização insuficiente gera sistemas rígidos

🔗 **Conexão prática**
- Estrutura de pacotes aplicada no módulo `layered/`

---

### 🟦 Capítulo 4 – Características Arquiteturais

📌 **Ideia central**  
Arquitetura é guiada principalmente por **requisitos não funcionais**.

🧠 **Exemplos de características**
- Manutenibilidade
- Escalabilidade
- Performance
- Disponibilidade
- Simplicidade
- Segurança

⚠️ **Ponto crítico**
> Não é possível maximizar todas as características simultaneamente.

🔗 **Conexão prática**
- Análise de trade-offs ao escolher estilos arquiteturais

---

### 🟦 Capítulo 5 – Estilos Arquiteturais

📌 **Ideia central**  
Cada estilo arquitetural resolve um conjunto específico de problemas.

🧱 **Estilos abordados**
- Layered
- Pipeline (Pipes and Filters)
- Microkernel
- Event-Driven
- Microservices

⚖️ **Trade-offs**
- Cada estilo favorece algumas características e sacrifica outras
- O contexto define a escolha correta

🔗 **Conexão prática**
- Implementação do estilo *Layered* no módulo `layered/`

---

## 🧩 Decisões Arquiteturais (ADR)

As decisões arquiteturais deste estudo estão documentadas em:

