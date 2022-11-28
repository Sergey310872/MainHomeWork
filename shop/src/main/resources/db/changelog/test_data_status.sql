--Статусы заказа
INSERT INTO status_order(id, name, finished) values (1, 'Обрабатывается', false);
INSERT INTO status_order(id, name, finished) values (2, 'Комплектуется на складе', false);
INSERT INTO status_order(id, name, finished) values (3, 'Передан в службу доставки', false);
INSERT INTO status_order(id, name, finished) values (4, 'Передан клиенту', true);
--Способ доставки
INSERT INTO Way_delivery(id, name) values (1, 'Почта России');
INSERT INTO Way_delivery(id, name) values (2, 'Курьерская доставка');
INSERT INTO Way_delivery(id, name) values (3, 'Самовывоз');
