# Documentação do Projeto Nourish Me

O **Nourish Me** é um aplicativo de monitoramento alimentar que tem como objetivo facilitar o tratamento de transtornos alimentares. Esses transtornos podem ter impactos negativos na saúde mental e física, incluindo depressão, ansiedade, baixa autoestima, distúrbios hormonais e problemas gastrointestinais. O Nourish Me permite que os usuários monitorem seus hábitos alimentares, atividades físicas, níveis de ansiedade e humor, fornecendo feedback personalizado para ajudar no gerenciamento dos sintomas e na promoção de um relacionamento mais saudável com a comida.

![Diagrama da Aplicação](imagem1.png)

## Funcionalidades Principais

### Monitoramento de Hábitos
- Os usuários podem registrar seus hábitos alimentares diários.
- Registram o tempo gasto em atividades físicas.
- Monitoram níveis de ansiedade e humor.

### Conexão com Terapeutas
- Terapeutas podem adicionar pacientes à plataforma.
- Os dados registrados pelos pacientes são compartilhados com seus terapeutas.
- Os terapeutas podem avaliar o progresso de seus pacientes e ajustar os tratamentos conforme necessário.

### Recursos Adicionais
- Acesso a uma comunidade de suporte online.
- Meditações guiadas e exercícios de mindfulness.
- Gestão do estresse e tratamento de gatilhos emocionais.

## Modelagem do Sistema

![Diagrama de Classe UML](imagem2.png)

### Regras de Negócio

- **RN01:** Um usuário pode fazer uma ou várias inserções por dia.
- **RN02:** Uma inserção só pode ser feita por um usuário.
- **RN03:** Um usuário pode ter apenas uma conta de e-mail cadastrado.
- **RN04:** Não pode existir contas de e-mails repetidas.
- **RN05:** Um usuário pode ter apenas um terapeuta.
- **RN06:** Um terapeuta pode ter um ou vários clientes.
- **RN07:** Para que uma refeição seja incluída, é necessário que possua um ID específico.
- **RN08:** Não pode existir um ID de refeição repetido.

![DDL (Data Definition Language)](imagem3.png)

## Planos de Acesso

- **Plano Gratuito:** Oferece monitoramento contínuo com feedbacks sobre a evolução e dicas de gerenciamento para os usuários.

- **Plano Premium para Terapeutas:** Permite que terapeutas integrem a plataforma em seus métodos de tratamento, fornecendo acesso a perfis de pacientes e dados registrados.

---

