CREATE TABLE oppilas (
       id integer NOT NULL, nimi char(64) NOT NULL default '', demopisteet integer(4) NOT NULL, koepisteet integer(4) NOT NULL default '',
       PRIMARY KEY (Id)
);


INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (1,'Aku',10,20);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (2,'Hessu',12,22);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (3,'Mikki',4,19);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (4,'Iines',11,22);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (5,'Heluna',13,22);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (6,'Minni',8,19);
INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (7,'Eka',12,21);

select * from oppilas;
select * from oppilas where id=1;
SELECT * FROM oppilas WHERE demopisteet >= 10 AND demopisteet <= 15;
