-- UTF8
SET NAMES utf8;

USE helpus;

INSERT INTO Customer (login, creation_date, email, job, ville)
VALUES ('MARAM-93', '2009-06-13 08:17:00', 'maram93@gmail.com', 'Proffesseur', 'Tremblay en France' ),
	( 'Doudou9_0', '2011-06-13 08:17:00', 'doudoulabelle@gmail.com', 'Danceur', 'Paris' ),
        ('YassineLeMort77', '2009-09-23 09:17:00', 'yassineLeMort@yahoo.com', 'Etudiant', 'Nantes' ),
        ('Loulizi', '2009-06-13 08:17:00', 'maram93@gmail.com', 'Médecin généraliste', 'Villepinte' );


INSERT INTO Category 
VALUES (1, 'SPO' , SYSDATE(), 'SPORT'),
	(2, 'BRICO' , SYSDATE(), 'BRICOLAGE'),
        (3, 'JARDI' , SYSDATE(), 'JARDINAGE'),
	(4, 'COPA' , SYSDATE(), 'COURS PARTICULIERS');

INSERT INTO Service ( code, label, category_id)
VALUES ( 'ABC', 'Coach sportif', 1),
       ( 'ABD', 'Bricoler', 2),
       ( 'ABE', 'Jardinage', 3),
	( 'ABF', 'Donner des cours particuliers', 4);