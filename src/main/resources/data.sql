/*BCrypted password = adminpass*/
insert into user (id, user_name, password, role) values (1, 'admin', '$2a$10$Y5.ewlkYSc6Gv9rCz32V9.a4LBsV0xlTORAAGml3g18Ck66XIViKq','ADMIN');

/*BCrypted password = userpass*/
insert into user (id, user_name, password, role) values (2, 'user', '$2a$10$9qg5r.HRbt41n/IqZoiGy.Zzsemd0vkUK3p2bhoUEpai0T0kAKvdi', 'USER');

/*BCrypted password = managerpass*/
insert into user (id, user_name, password, role) values (3, 'manager', '$2a$10$9B3OjhhLc25aXy4.oXbjr.1QUDUEryi3EKiXiCvYmq9GIsg8SBZGm', 'MANAGER');