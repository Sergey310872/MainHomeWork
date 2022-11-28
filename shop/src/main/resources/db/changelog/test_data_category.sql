--Категории
INSERT into category(id,name,parent_id) values (1, 'ИГРУШКИ', null);
INSERT into category(id,name,parent_id) values (2, 'БЫТОВАЯ ТЕХНИКА', null);
INSERT into category(id,name,parent_id) values (3, 'ЭЛЕКТРОНИКА', null);
INSERT into category(id,name,parent_id) values (4, 'Холодильники', 2);
INSERT into category(id,name,parent_id) values (5, 'Тедевизоры', 2);
INSERT into category(id,name,parent_id) values (6, 'Стиральные машины', 2);
INSERT into category(id,name,parent_id) values (7, 'Смартфоны', 3);
INSERT into category(id,name,parent_id) values (8, 'Компьютеры', 3);
INSERT into category(id,name,parent_id) values (9, 'Принтеры', 3);