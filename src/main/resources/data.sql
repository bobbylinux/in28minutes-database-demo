create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE) VALUES(10001, 'Roberto Bani', 'Firenze',sysdate);
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE) VALUES(10002, 'Mario Rossi', 'Roma',sysdate);
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE) VALUES(10003, 'Serena Verdi', 'Alessandria',sysdate);
INSERT INTO PERSON(ID, NAME, LOCATION, BIRTH_DATE) VALUES(10004, 'Alessio Bianchi', 'Milano',sysdate);