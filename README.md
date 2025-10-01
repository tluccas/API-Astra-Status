# API de Status - Chatbot Astra

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring)
![Maven](https://img.shields.io/badge/Maven-4.0-red?style=for-the-badge&logo=apache-maven)
![Status](https://img.shields.io/badge/status-ativo-brightgreen?style=for-the-badge)

API de integração entre o chatbot Astra e seu website, responsável por comunicar o status de disponibilidade do bot (online/offline) em tempo real.

## 📖 Sobre o Projeto

Esta API foi desenvolvida para servir como uma ponte de comunicação entre o sistema do Chatbot Astra e seu site oficial. Seu principal objetivo é fornecer um endpoint simples e confiável que informa se o chatbot está operacional e pronto para receber interações.

A aplicação é construída utilizando Java + Spring Boot, garantindo performance, segurança e escalabilidade.

## ✨ Funcionalidades

-   **Verificação de Status em Tempo Real**: Consulta o estado atual do bot armazenando data e hora(ONLINE ou OFFLINE).
-   **Endpoint Único**: Um único endpoint `GET` para facilitar a integração.
-   **Resposta Padronizada**: Retorna uma resposta clara e consistente.
-   **Leve e Rápida**: Construída com Spring Boot para uma inicialização rápida e baixo consumo de recursos.

## 🛠️ Tecnologias Utilizadas

-   [**Java 17**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html): Versão 17 da linguagem Java.
-   [**Spring Boot 3.x**](https://spring.io/projects/spring-boot): Framework para criação de aplicações stand-alone e baseadas em microserviços.
-   [**Spring Web**](https://docs.spring.io/spring-framework/reference/web/webmvc.html): Módulo para construção de APIs RESTful.
-   [**Maven**](https://maven.apache.org/): Ferramenta de gerenciamento de dependências e build do projeto.
