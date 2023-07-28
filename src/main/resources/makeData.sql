insert into a  (id,a1,a2,a3,a4,a5,a6,a7,a8)
SELECT  @N := @N +1 AS integers,SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255),
        SUBSTR(MD5(RAND()), 1, 255)
FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100;
insert into b  (id,b1,a_id)
select (first.integers-101)*100+second.integers,SUBSTR(MD5(RAND()), 1, 255),second.integers
from
    (
        SELECT  @N := @N +1 AS integers
        FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100)first
left join (
SELECT  @N := @N +1 AS integers
FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100) second
on true
order by first.integers,second.integers;
insert into c  (id,c1,a_id)
select (first.integers-101)*100+second.integers,SUBSTR(MD5(RAND()), 1, 255),second.integers
from
    (
        SELECT  @N := @N +1 AS integers
        FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100)first
left join (
SELECT  @N := @N +1 AS integers
FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100) second
on true
order by first.integers,second.integers;

insert into d  (id,d1,a_id)
select (first.integers-101)*100+second.integers,SUBSTR(MD5(RAND()), 1, 255),second.integers
from
    (
        SELECT  @N := @N +1 AS integers
        FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100)first
left join (
SELECT  @N := @N +1 AS integers
FROM mysql.help_relation , (SELECT @N:=0) dum LIMIT 100) second
on true
order by first.integers,second.integers;