Tables:

customer: - id
	 - creation_date
	  - country
	  - email
           - Job
	   - Login

Service:
	- ID
	- ID_Catégory
	- short_label
	- long_label

proposal_service:
	- ID
	- ID_Consumer
        _ ID_service

request_service :

	- ID
	- ID_Consumer
        _ ID_service

Technical environment:

- le front-end correspondant au côté client, sera mis en place à l'aide des langages descriptifs HTML/CSS. 
Nous gérerons la dynamisation des pages web construites, ainsi que la communication entre le front-end et le back-end à l'aide du framework 
Angular dans sa version 7 ;
- le back-end correspondant au côté serveur, sera mis en place à l'aide du framework Spring Boot 2 qui nous permettra de générer un projet Java 
préconstruit de type .war. Spring Boot est un framework qui offre entre autres, la possibilité de construire une application Java intégrant 
par défaut un écosystème des frameworks Spring. De plus, il donne la possibilité à l'application une fois construite d'être déployée aisément et d
e fonctionner de façon autonome (mode stand-alone). Un de ses atouts majeurs est qu'il s'occupe de l'inclusion et de la gestion des versions de 
multiples dépendances aux frameworks dont peut nécessiter l'application lors de son développement.


Frameworks et IDE utilisés pour cette application

- HTML/CSS et Angular 7, pour les traitements front-end.
- Java 8, pour les développements applicatifs back-end.
- Spring Boot 2.1.2, pour la construction de notre projet applicatif .war.
- Spring ioc, pour l'injection de dépendances.
- Spring webmvc, pour le traitement des requêtes HTTP Restful venant du front-end.
- Springfox 2.9.2, pour la documentation Swagger 2 des API REST développées ;
- Spring Mail, pour la gestion des mails.
- Spring Data JPA / Hibernate, pour la persistance des données.

- H2, la base de données de notre application. Nous faisons le choix d'utiliser une base embarquée pour cet article, afin d'avoir une application 
complètement portable et sans configuration à faire une fois développée. Ceci pour le grand bonheur des lecteurs qui voudraient tester l'application. 
À noter quand même que dans la réalité, une base embarquée est généralement utilisée uniquement pour les tests d'intégration, mais sa configuration
 reste identique à toutes autres bases de données telles que MySql, MariaDB, Oracle, etc.

- Eclipse 4.10 (SimRel 2018-12), comme IDE pour le développement de notre application côté serveur.
- Visual Studio Code 1.35.1, comme IDE pour le développement de notre application côté client.
- Tomcat 8 pour le déploiement de l'application.











	
