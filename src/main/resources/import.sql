INSERT into fruta(id, nome, quantidade) values(1,'abacaxi',42);
INSERT into fruta(id ,nome, quantidade) values(2,'pera',42);
INSERT into fruta(id ,nome, quantidade) values( (SELECT next_val+3 from fruta_SEQ) ,'pera',42);