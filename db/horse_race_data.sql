INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Secretariat', 'blue');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Seattle Slew', 'green');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Man o'' War', 'white');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Citation', 'yellow');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Red Rum', 'red');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Seabiscuit', 'pink');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Kelso', 'brown');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Native Dancer', 'grey');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Zeus', 'purple');
INSERT INTO public.horse (id, horse_name, horse_color) VALUES (DEFAULT, 'Black Caviar', 'black');

INSERT INTO public.race (id, race_date, race_time, race_place, has_result) VALUES (DEFAULT, '12.04.2022', '13:00', 'London', false);
INSERT INTO public.race (id, race_date, race_time, race_place, has_result) VALUES (DEFAULT, '14.04.2022', '14:15', 'Liverpool', false);

INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 3, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 4, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 6, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 7, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 10, 1);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 3, 2);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 5, 2);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 8, 2);
INSERT INTO public.race_horse (id, horse_id, race_id) VALUES (DEFAULT, 9, 2);

INSERT INTO public.result (id, race_id, horse_id) VALUES (DEFAULT, 1, 3);