insert into user_details (id, birth_date, name)
values (10001, current_date(), 'bogil');

insert into user_details (id, birth_date, name)
values (10002, current_date(), 'david');

insert into user_details (id, birth_date, name)
values (10003, current_date(), 'jane');

insert into post(id, description, user_id)
values(20001, 'First Post', 10001);

insert into post(id, description, user_id)
values(20002, 'Second Post', 10001);

insert into post(id, description, user_id)
values(20003, 'Third Post', 10002);

insert into post(id, description, user_id)
values(20004, 'Fourth Post', 10002);

insert into post(id, description, user_id)
values(20005, 'Fifth Post', 10003);

insert into post(id, description, user_id)
values(20006, 'Sixth Post', 10003);