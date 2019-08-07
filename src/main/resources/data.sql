insert into user values(1001, sysdate(), 'AB');
insert into user values(1003, sysdate(), 'Jack');
insert into user values(1002, sysdate(), 'Jill');

insert into post values (111, 'My first post', 1003);
insert into post values (112, 'My second post', 1003);
insert into post values (113, 'My first post', 1002);