<h1 align="center"> Estrutura de Dados  </h1>

<h3 align="center">
<!-- <img alt="Logo" src=".github/logo.png" width="200px" /> -->
  Application Logo
</h3>

<p align="center">Exemplos e exercícios</p>

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/nathanSeixeiro/Estrutura-de-dados">
  
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/nathanSeixeiro/Estrutura-de-dados">
  
  <a href="https://github.com/nathanSeixeiro/Estrutura-de-dados/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/nathanSeixeiro/Estrutura-de-dados">
  </a>
  
  <a href="https://github.com/nathanSeixeiro/Estrutura-de-dados/issues">
    <img alt="Repository issues" src="https://img.shields.io/github/issues/nathanSeixeiro/Estrutura-de-dados">
  </a>
  
  <!--img alt="GitHub" src="https://img.shields.io/github/nathanSeixeiro/Estrutura-de-dados"-->
</p>

<p align="center">
  <a href="#-about-the-project">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-technologies">Tech??</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-getting-started">Para rodar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-how-to-contribute">Como contribuir?</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<p align="center">
  <a href="" target="_blank">
            <img align="center" alt="Java" height="90" width="95" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">
  </a>
 </p>
 
 <p align="center">
  Já olhou o Java docs hoje?
</p>


## 👨🏻‍💻 Sobre o projeto

- <p style="color: red;">Brief explanation about the project</p>

To see the **web client**, click here: [PROJECT_NAME Web](https://github/eliasgcf/readme-template)</br>
To see the **mobile client**, click here: [PROJECT_NAME Mobile](https://github/eliasgcf/readme-template)

## 🚀 Technologies

Technologies that I used to develop this api

- [Node.js](https://nodejs.org/en/)
- [TypeScript](https://www.typescriptlang.org/)
- [Express](https://expressjs.com/pt-br/)
- [Multer](https://github.com/expressjs/multer)
- [TypeORM](https://typeorm.io/#/)
- [JWT-token](https://jwt.io/)
- [uuid v4](https://github.com/thenativeweb/uuidv4/)
- [PostgreSQL](https://www.postgresql.org/)
- [Date-fns](https://date-fns.org/)
- [Jest](https://jestjs.io/)
- [SuperTest](https://github.com/visionmedia/supertest)
- [Husky](https://github.com/typicode/husky)
- [Commitlint](https://github.com/conventional-changelog/commitlint)
- [Commitizen](https://github.com/commitizen/cz-cli)
- [Eslint](https://eslint.org/)
- [Prettier](https://prettier.io/)
- [EditorConfig](https://editorconfig.org/)

## 💻 Getting started

Import the `Insomnia.json` on Insomnia App or click on [Run in Insomnia](#insomniaButton) button

### Requirements

- [Node.js](https://nodejs.org/en/)
- [Yarn](https://classic.yarnpkg.com/) or [npm](https://www.npmjs.com/)
- One instance of [PostgreSQL](https://www.postgresql.org/)

> Obs.: I recommend use docker
**Clone the project and access the folder**

```bash
$ git clone https://github.com/EliasGcf/NOME_DO_REPO.git && cd NOME_DO_REPO
```

**Follow the steps below**

```bash
# Install the dependencies
$ yarn
# Create the instance of postgreSQL using docker
$ docker run --name project-postgres -e POSTGRES_USER=docker \
              -e POSTGRES_DB=project -e POSTGRES_PASSWORD=docker \
              -p 5432:5432 -d postgres
# Make sure the keys in 'ormconfig.json' to connect with your database
# are set up correctly.
# Once the services are running, run the migrations
$ yarn typeorm migration:run
# To finish, run the api service
$ yarn dev:server
# Well done, project is started!
```

## 🤔 How to contribute

**Make a fork of this repository**

```bash
# Fork using GitHub official command line
# If you don't have the GitHub CLI, use the web site to do that.
$ gh repo fork EliasGcf/NOME_DO_REPO
```

**Follow the steps below**

```bash
# Clone your fork
$ git clone your-fork-url && cd NOME_DO_REPO
# Create a branch with your feature
$ git checkout -b my-feature
# Make the commit with your changes
$ git commit -m 'feat: My new feature'
# Send the code to your remote branch
$ git push origin my-feature
```

After your pull request is merged, you can delete your branch

