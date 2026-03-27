INSERT INTO categorie (id, anarana, acronyme) VALUES
(CONCAT('CAT', nextval('categorie_seq')), 'LOHOLONA', 'LH'),
(CONCAT('CAT', nextval('categorie_seq')), 'DIAKONA', 'DK');


INSERT INTO groupe (id, anarana, acronyme) VALUES
(CONCAT('GRP', nextval('groupe_seq')), 'FANILO', 'FNL'),
(CONCAT('GRP', nextval('groupe_seq')), 'FANASINA', 'FNS'),
(CONCAT('GRP', nextval('groupe_seq')), 'FAHAZAVANA', 'FZV'),
(CONCAT('GRP', nextval('groupe_seq')), 'FANANTENANA', 'FNT'),
(CONCAT('GRP', nextval('groupe_seq')), 'FANDRESENA', 'FDS');
